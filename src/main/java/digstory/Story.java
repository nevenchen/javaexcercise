package digstory;

public class Story {
	
	private String name;

	public void digg(EventHandler eventHandler, User user) {
		DiggStoryEvent diggStoryEvent = new DiggStoryEvent(this, user);
		diggStoryEvent.accept(eventHandler);
	}

	public Story(String name){
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
