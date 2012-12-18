package com.neven.java.basic.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.logging.Logger;

import com.neven.java.basic.concurrent.mock.MockNodeValidator;

/**
 * ִ����֤��������
 * 
 * @author DigitalSonic
 */
public class ValidationTask implements Callable<Node> {
    private static Logger logger = Logger.getLogger("ValidationTask");

    private String        wsdl;

    /**
     * ���췽��������ڵ��WSDL
     */
    public ValidationTask(String wsdl) {
        this.wsdl = wsdl;
    }

    /**
     * ִ�����ĳ���ڵ����֤<br/>
     * ������б���߳���ִ��ͬһ�ڵ����֤��ȴ����������ظ�ִ����֤
     */
    @Override
    public Node call() throws Exception {
        Node node = ValidationService.NODE_MAP.get(wsdl);
        Lock lock = null;
        logger.info("��ʼ��֤�ڵ㣺" + wsdl);
        if (node != null) {
            lock = node.getLock();
            if (lock.tryLock()) {
                // ��ǰû�������߳���֤�ýڵ�
                logger.info("��ǰû�������߳���֤�ڵ�" + node.getName() + "[" + wsdl + "]");
                try {
                    Node result = MockNodeValidator.validateNode(wsdl);
                    mergeNode(result, node);
                } finally {
                    lock.unlock();
                }
            } else {
                // ��ǰ�б���߳�������֤�ýڵ㣬�ȴ����
                logger.info("��ǰ�б���߳�������֤�ڵ�" + node.getName() + "[" + wsdl + "]���ȴ����");
                lock.lock();
                lock.unlock();
            }
        } else {
            // ��δ���й���֤���������Ӧ��ֻ������ϵͳ��������
            // ��ʱ��������ʼ������Ӧ���г�ͻ����
            logger.info("�״���֤�ڵ㣺" + wsdl);
            node = MockNodeValidator.validateNode(wsdl);
            ValidationService.NODE_MAP.put(wsdl, node);
        }
        logger.info("�ڵ�" + node.getName() + "[" + wsdl + "]��֤��������֤�����" + node.getResult());
        return node;
    }

    /**
     * ��src�����ݺϲ���dest�ڵ��У���������ȿ���
     */
    private void mergeNode(Node src, Node dest) {
        dest.setName(src.getName());
        dest.setWsdl(src.getWsdl());
        dest.setDependencies(src.getDependencies());
        dest.setResult(src.getResult());
    }
}
