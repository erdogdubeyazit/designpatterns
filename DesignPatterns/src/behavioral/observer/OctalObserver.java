package behavioral.observer;

public class OctalObserver extends Observer {


	public OctalObserver(Subject subject) {
		super(subject);
	}

	@Override
	protected void update() {
		System.out.println("Octal String : " + Integer.toOctalString(subject.getState()));
	}

}
