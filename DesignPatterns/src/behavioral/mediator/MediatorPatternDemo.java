package behavioral.mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		User robert = new User("Rober");
		User john = new User("John");

		robert.sendMessage("Hi! John");
		john.sendMessage("Hello! Robert");
	}

}
