
public abstract class tax {
	private float taxvalue;
	abstract public float returntaxvalue();
	
	abstract public void changetaxvalue(float taxvalue);

	public float getTaxvalue() {
		return taxvalue;
	}

	public void setTaxvalue(float taxvalue) {
		this.taxvalue = taxvalue;
	}

}
