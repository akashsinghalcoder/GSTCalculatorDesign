
public class category extends tax {
	private String category;
	
	category(String category,float taxvalue)
	{
		this.category=category;
		this.setTaxvalue(taxvalue);
		
	}
	
	public float returntaxvalue()
	{
		return getTaxvalue();
	}
	
	public void changetaxvalue(float taxvalue)
	{
		this.setTaxvalue(taxvalue);
	}

}
