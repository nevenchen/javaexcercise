package digstory;

public abstract class DomainEvent{

	public void accept(EventHandler eventHandler) {
		eventHandler.vistor(eventCallback());
	}

	// 此方法是钩子方法，模板方法，子类，比如顶贴的事件，增加好友的事件等，都要实现此方法
	protected abstract EventCallback eventCallback();
}
