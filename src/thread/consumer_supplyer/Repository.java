package thread.consumer_supplyer;

import lombok.Getter;
import lombok.Setter;


public class Repository {
	@Setter @Getter private int amount = 0;
	@Setter @Getter private int capability = 50;
	
	public void add(int i){
		this.amount += i;
		System.out.println("生产,仓库产品库存：" + amount);
	}
	
	public void get(int i){
		this.amount -= i;
		System.out.println("消费，仓库产品库存：" + amount);
	}
}
