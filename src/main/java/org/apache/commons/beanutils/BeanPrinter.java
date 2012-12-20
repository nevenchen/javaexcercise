package org.apache.commons.beanutils;

import java.io.PrintStream;
import java.util.Map;

/**
 * @Class：BeanPrinter
 * @Description:打印bean
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 5 Nov 2010 10:53:24
 * Revision history:
 *
 * @see 	 
 */
public class BeanPrinter{	
	/**
	 * @说明：输出Bean的属性/深输出Bean的属性
	 * 
	 * @param out  输出流
	 * @author Neven Chen
	 * 
	 * @异常： 
	 */
	public static void printBean(Object bean){
		System.out.println("+++++++++++++打印bean: "+ bean.getClass().getName());
		printBean(bean, System.out);
		System.out.println("+++++++++++++打印bean: "+ bean.getClass().getName()+"结束。");
	}
	
	public static void printBean(Object bean, PrintStream out){
		try {
			Map m = org.apache.commons.beanutils.BeanUtils.describe(bean);
			for (Object  o : m.keySet()) {  
				String desc = "null";
				if (m.get(o)!=null)
					desc = m.get(o).toString();
				out.println(o.toString()+":  "+desc);  
		  }
		} catch(Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	
	public static void printBeanDeep(Object bean, PrintStream out) {
		try {
			Map m = org.apache.commons.beanutils.BeanUtils.describe(bean);
			for (Object  o : m.keySet()) {  
				if(o==null){
					out.println("Null value field");
					continue;
				}
				out.println(o.toString()+":  "+m.get(o));  
		  }
		} catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex.getMessage());
		}
	}
}
