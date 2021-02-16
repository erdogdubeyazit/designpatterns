package behavioral.nullobject;

public class Nullcustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
