
public class category {
	private String category;
	private float taxvalue;
	category(String category,float taxvalue)
	{
		this.category=category;
		this.taxvalue=taxvalue;
		
	}
	public float returntaxvalue()
	{
		return taxvalue;
	}
	public void changetaxvalue(float taxvalue)
	{
		this.taxvalue=taxvalue;
	}

}
