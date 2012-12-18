package com.neven.java.basic.concurrent;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * �ڵ���
 * 
 * @author DigitalSonic
 */
public class Node {
	private String name;
	private String wsdl;
	private String result = "PASS";
	private String[] dependencies = new String[] {};
	private Lock lock = new ReentrantLock();
	/**
	 * Ĭ�Ϲ��췽��
	 */
	public Node() {
	}
	
	/**
	 * ����ڵ�����������Ƽ�WSDL
	 */
	public Node(String name, String wsdl) {
		this.name = name;
		this.wsdl = wsdl;
	}

	/**
	 * ���ذ����ڵ����ơ�WSDL�Լ���֤������ַ���
	 */
	@Override
	public String toString() {
		return "Node: " + name + " WSDL: " + wsdl + " Result: " + result;
	}
	
	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWsdl() {
		return wsdl;
	}

	public void setWsdl(String wsdl) {
		this.wsdl = wsdl;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String[] getDependencies() {
		return dependencies;
	}

	public void setDependencies(String[] dependencies) {
		this.dependencies = dependencies;
	}

	public Lock getLock() {
		return lock;
	}

}
