package thread.concurrent.lock_excutor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lombok.Getter;
import lombok.Setter;


public class Node { 
    @Getter @Setter private String name;   
    @Getter @Setter private String wsdl;   
    @Getter @Setter private String result = "PASS";   
    @Getter @Setter private String[] dependencies = new String[] {};   
    @Getter @Setter private Lock lock = new ReentrantLock();   
    /**  
     * 默认构造方法  
     */  
    public Node() {   
    }   
       
    /**  
     * 构造节点对象，设置名称及WSDL  
     */  
    public Node(String name, String wsdl) {   
        this.name = name;   
        this.wsdl = wsdl;   
    }   
  
    /**  
     * 返回包含节点名称、WSDL以及验证结果的字符串  
     */  
    @Override  
    public String toString() {   
        String toString = "Node: " + name + " WSDL: " + wsdl + " Result: " + result;   
        return toString;   
    }   
       
}
