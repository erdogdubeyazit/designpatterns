package creational.prototype;

public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	@Override
	protected Object clone(){
		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}
