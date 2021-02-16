package behavioral.observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		super(subject);
	}

	@Override
	protected void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()));

	}

}
