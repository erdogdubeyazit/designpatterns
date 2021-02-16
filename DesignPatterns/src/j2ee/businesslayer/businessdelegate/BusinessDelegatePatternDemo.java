package j2ee.businesslayer.businessdelegate;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.getServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.getServiceType("JMS");
		client.doTask();

	}

}
