package digstory;



//事件Handler，有一点点类似一个ESB消息总线一样，它负责接收事件，然后转发给不同的事件处理器
public class DefaultEventHandler implements EventHandler{      
	// 事件处理器注册器，每一个事件都可以注册三种类型的事件处理器，异步，同步，nullEventProcessor
	private EventProcessorRegister eventProcessorRegister;		   
	public void vistor(EventCallback eventCallback){      
		DomainEvent domainEvent = eventCallback.getDomainEvent();            
		// 事件处理器注册器根据具体的DomainEvent查找到对应的事件处理器
		EventProcessor eventProcessor = eventProcessorRegister.lookUp(domainEvent);            
		/**
		 * 这里面的事件处理器，一共有三种策略，同步事件处理，异步事件处理，还有NullEventProcessor, *空事件处理器主要用来在系统运行的时候暂停某个功能，比如假设系统想停止顶贴这个功能，那么
		 * *可以动态的修改DiggStoryEvent对应的事件处理器为NullEventProcessor
		 */     
		eventProcessor.processEvent(domainEvent);    
	}
}  
