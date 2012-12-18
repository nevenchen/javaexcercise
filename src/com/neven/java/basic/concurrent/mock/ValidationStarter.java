package com.neven.java.basic.concurrent.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import com.neven.java.basic.concurrent.Node;
import com.neven.java.basic.concurrent.ThreadPoolService;
import com.neven.java.basic.concurrent.ValidationService;

/**
 * ģ��ִ�������������֤
 * 
 * @author DigitalSonic
 */
public class ValidationStarter implements Runnable {
    private List<String>      entries;
    private ValidationService validationService;
    private CountDownLatch    signal;

    public ValidationStarter(List<String> entries, ValidationService validationService,
            CountDownLatch signal) {
        this.entries = entries;
        this.validationService = validationService;
        this.signal = signal;
    }

    /**
     * �̳߳ش�СΪ10����ʼ��ִ��һ�Σ���󲢷�������֤
     */
    public static void main(String[] args) {
        ThreadPoolService threadPoolService = new ThreadPoolService(10);
        ValidationService validationService = new ValidationService(threadPoolService);
        List<String> entries = new ArrayList<String>();
        CountDownLatch signal = new CountDownLatch(3);
        long start;
        long stop;

        for (Node node : MockNodeValidator.ENTRIES) {
            entries.add(node.getWsdl());
        }

        start = System.currentTimeMillis();

        validationService.validate(entries);
        threadPoolService.execute(new ValidationStarter(entries, validationService, signal));
        threadPoolService.execute(new ValidationStarter(entries, validationService, signal));
        threadPoolService.execute(new ValidationStarter(entries, validationService, signal));

        try {
            signal.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop = System.currentTimeMillis();
        threadPoolService.destoryExecutorService(1000);
        System.out.println("ʵ��ִ����֤����: " + MockNodeValidator.getCount());
        System.out.println("ʵ��ִ��ʱ��: " + (stop - start) + "ms");
    }

    @Override
    public void run() {
        validationService.validate(entries);
        signal.countDown();
    }

}
