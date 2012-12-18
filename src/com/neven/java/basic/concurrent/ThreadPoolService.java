package com.neven.java.basic.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * �̳߳ط�����
 * 
 * @author DigitalSonic
 */
public class ThreadPoolService {
    /**
     * Ĭ���̳߳ش�С
     */
    public static final int  DEFAULT_POOL_SIZE    = 5;

    /**
     * Ĭ��һ������ĳ�ʱʱ�䣬��λΪ����
     */
    public static final long DEFAULT_TASK_TIMEOUT = 1000;

    private int              poolSize             = DEFAULT_POOL_SIZE;
    private ExecutorService  executorService;

    /**
     * ���ݸ�����С�����̳߳�
     */
    public ThreadPoolService(int poolSize) {
        setPoolSize(poolSize);
    }

    /**
     * ʹ���̳߳��е��߳���ִ������
     */
    public void execute(Runnable task) {
        executorService.execute(task);
    }

    /**
     * ���̳߳���ִ�����и���������ȡ�����н����ʹ��Ĭ�ϳ�ʱʱ��
     * 
     * @see #invokeAll(List, long)
     */
    public List<Node> invokeAll(List<ValidationTask> tasks) {
        return invokeAll(tasks, DEFAULT_TASK_TIMEOUT * tasks.size());
    }

    /**
     * ���̳߳���ִ�����и���������ȡ�����н��
     * 
     * @param timeout �Ժ���Ϊ��λ�ĳ�ʱʱ�䣬С��0��ʾ���趨��ʱ
     * @see java.util.concurrent.ExecutorService#invokeAll(java.util.Collection)
     */
    public List<Node> invokeAll(List<ValidationTask> tasks, long timeout) {
        List<Node> nodes = new ArrayList<Node>(tasks.size());
        try {
            List<Future<Node>> futures = null;
            if (timeout < 0) {
                futures = executorService.invokeAll(tasks);
            } else {
                futures = executorService.invokeAll(tasks, timeout, TimeUnit.MILLISECONDS);
            }
            for (Future<Node> future : futures) {
                try {
                    nodes.add(future.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nodes;
    }

    /**
     * �رյ�ǰExecutorService
     * 
     * @param timeout �Ժ���Ϊ��λ�ĳ�ʱʱ��
     */
    public void destoryExecutorService(long timeout) {
        if (executorService != null && !executorService.isShutdown()) {
            try {
                executorService.awaitTermination(timeout, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
        }
    }

    /**
     * �رյ�ǰExecutorService��������poolSize�����µ�ExecutorService
     */
    public void createExecutorService() {
        destoryExecutorService(1000);
        executorService = Executors.newFixedThreadPool(poolSize);
    }

    /**
     * �����̳߳ش�С
     * @see #createExecutorService()
     */
    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
        createExecutorService();
    }
}
