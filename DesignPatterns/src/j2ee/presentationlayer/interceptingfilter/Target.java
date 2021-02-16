package j2ee.presentationlayer.interceptingfilter;

public class Target {

	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}

}
