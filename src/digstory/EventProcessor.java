package digstory;


public interface EventProcessor {
	//EventProcessor getEventProcessor();
    void processEvent(DomainEvent domainEvent);
}
