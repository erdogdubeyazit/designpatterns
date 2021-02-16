package j2ee.businesslayer.compositeentity;

public class CoarseGrainedObject {

	DependentObject1 do1 = new DependentObject1();
	DependentObject2 do2 = new DependentObject2();

	public void setData(String data1, String data2) {
		do1.setdata(data1);
		do2.setdata(data2);
	}

	public String[] getData() {
		return new String[] { do1.getData(), do2.getData() };
	}

}
