package behavioral.observer;

public class BinaryObserver extends Observer {



	public BinaryObserver(Subject subject) {
		super(subject);
	}

	@Override
	protected void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
