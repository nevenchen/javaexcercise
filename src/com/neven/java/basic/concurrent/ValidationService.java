package com.neven.java.basic.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ִ����֤�ķ�����
 * 
 * @author DigitalSonic
 */
public class ValidationService {
	/**
	 * ȫ�ֽڵ��
	 */
	public static final Map<String, Node> NODE_MAP = new ConcurrentHashMap<String, Node>();

	private ThreadPoolService threadPoolService;
	
	public ValidationService(ThreadPoolService threadPoolService) {
		this.threadPoolService = threadPoolService;
	}

	/**
	 * ����һ����ڽڵ��WSDL��ͨ����ȱ����ķ�ʽ��֤������صĸ����ڵ�
	 * 
	 * @param wsdl ��ڽڵ�WSDL
	 */
	public void validate(List<String> wsdl) {
		List<String> visitedNodes = new ArrayList<String>();
		List<String> nextRoundNodes = new ArrayList<String>();

		nextRoundNodes.addAll(wsdl);
		while (nextRoundNodes.size() > 0) {
			List<ValidationTask> tasks = getTasks(nextRoundNodes);
			List<Node> nodes = threadPoolService.invokeAll(tasks);

			visitedNodes.addAll(nextRoundNodes);
			nextRoundNodes.clear();
			getNextRoundNodes(nodes, visitedNodes, nextRoundNodes);
		}
	}

	private List<String> getNextRoundNodes(List<Node> nodes,
			List<String> visitedNodes, List<String> nextRoundNodes) {
		for (Node node : nodes) {
			for (String wsdl : node.getDependencies()) {
				if (!visitedNodes.contains(wsdl)) {
					nextRoundNodes.add(wsdl);
				}
			}
		}
		return nextRoundNodes;
	}

	private List<ValidationTask> getTasks(List<String> nodes) {
		List<ValidationTask> tasks = new ArrayList<ValidationTask>(nodes.size());
		for (String wsdl : nodes) {
			tasks.add(new ValidationTask(wsdl));
		}
		return tasks;
	}
}
