package digstory;

import java.util.Map;


public class EventProcessorRegister {
	private static Map<DomainEvent,EventProcessor> eventProcessors;
	
	public static EventProcessor lookUp(DomainEvent domainEvent){
		return eventProcessors.get(domainEvent);
	}
	
	public static void add(DomainEvent domainEvent,EventProcessor eProcesser){
		eventProcessors.put(domainEvent, eProcesser);
	}
}
