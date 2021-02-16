package behavioral.observer;

public abstract class Observer {

	public Observer(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	protected Subject subject;

	protected abstract void update();

}
