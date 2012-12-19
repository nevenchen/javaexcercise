package digstory;


public class Test {
	private static EventHandler eventHandler = new DefaultEventHandler();
	private static User user = new User("Neven");
	public static void main(String[] args){
//		EventProcessorRegister.add(domainEvent, eProcesser)
		Story story = new Story("Design pettern");
		story.digg(eventHandler, user);
	}
}
