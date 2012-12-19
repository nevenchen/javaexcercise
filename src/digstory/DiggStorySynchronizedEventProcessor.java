package digstory;

import java.util.Properties;




//以下是DiggStorySynchronizedEventProcessor的实现： 
public class DiggStorySynchronizedEventProcessor implements EventProcessor{				
	private DiggStoryEventRepository diggStoryEventRepository;				
	private FeedRepository feedRepository;				
	public void processEvent(DomainEvent domainEvent){			
		DiggStoryEvent diggStoryEvent = (DiggStoryEvent)domainEvent;						
		// 存储DiggStoryEvent以便以后统计哪些人顶了Story
		this.diggStoryEventRepository.add(diggStoryEvent);						
		// 新建一个Feed,表示某个人顶了某个Story,
		Feed feed = new Feed();			
		Property property = new Property();			
		property.setName("title");			
		property.setValue("Digg the story"+diggStoryEvent.getStory().getName());						// ....动态的增加新的Property feed.add(property);
	}
}
// 以后也许会有新的行为加入 }
