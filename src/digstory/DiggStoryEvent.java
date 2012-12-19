package digstory;


//DiggStoryEvent表示顶贴的事件，每次用户顶贴的是很，领域模型对象会触发此事件来完成后续的逻辑操作
public class DiggStoryEvent extends DomainEvent{ 
	
	private Story story;
	private User user;
	// 所有的事件类，只需要继承DomainEvent，然后override eventCallback()方法即可。
	public EventCallback eventCallback(){        
		// 这里使用匿名内部类返回具体的事件类型
		return new EventCallback(){        		  
			public DomainEvent getDomainEvent(){			  
					return DiggStoryEvent.this;			  
			}
		};
	}
	
	public DiggStoryEvent(Story story,User user){
		this.story = story;
		this.user = user;
	}
	public Story getStory() {
		return story;
	}
	public User getUser() {
		return user;
	}
}
