import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Manager {
	private HashMap<String,category> categories = new HashMap<String,category>();
	private HashMap<String,SpecificCommodity> newinventory = new HashMap<String,SpecificCommodity>();
	
	//It sets initial categories in system
	private void settinginitialcategories() {
		categories.put("Furniture",new category("Furniture",5));
		categories.put("Cosmetics",new category("Cosmetics",28));
		categories.put("FoodGrains",new category("FoodGrains",0));
		categories.put("Electronics",new category("Electronics",18));
	}
	
	//It sets initial products related to initial categories
	private void settingupInventoryManagerProducts()
	{
		newinventory.put("dal",new SpecificCommodity("dal","FoodGrains"));
		newinventory.put("wheat",new SpecificCommodity("wheat","FoodGrains"));
		newinventory.put("rice",new SpecificCommodity("rice","FoodGrains"));
		newinventory.put("sofa",new SpecificCommodity("sofa","Furniture"));
		newinventory.put("chair",new SpecificCommodity("chair","Furniture"));
		newinventory.put("table",new SpecificCommodity("table","Furniture"));
		newinventory.put("lotion",new SpecificCommodity("lotion","Cosmetics"));
		newinventory.put("perfume",new SpecificCommodity("perfume","Cosmetics"));
		newinventory.put("cream",new SpecificCommodity("cream","Cosmetics"));
		newinventory.put("tv",new SpecificCommodity("tv","Electronics"));
		newinventory.put("fridge",new SpecificCommodity("fridge","Cosmetics"));
	}
	
	
	public void settingupInventoryManager()
	{
		settinginitialcategories();
		settingupInventoryManagerProducts();	
	}
	
	//Tax calculation
	public float taxcalculator(String productname,float quantity,float price)
	{
		if(newinventory.containsKey(productname))
		{
			SpecificCommodity temp=newinventory.get(productname);
			return quantity*(price*categories.get(temp.gettype()).returntaxvalue()/100);
		}
		else
		{
			return -1;
		}
		
	}
	
	
	//changing tax of particular category
	public void changetaxofparticularcategory(String category,float taxvalue)
	{
		if(category.equals("Cosmetics"))
		{
			System.out.println(category);
		}
		categories.put(category,new category(category,taxvalue));	
	}
	
	
	//adding new category dynamically
	public void addcategory(String category,float taxvalue)
	{
		categories.put(category,new category(category,taxvalue));	
	}
	
	//adding new product dynamically
	public void addproduct(String productname,String type)
	{
		newinventory.put(productname,new SpecificCommodity(productname,type));
	}
	
	
	//delete product dynamically
	public void deleteproduct(String productname)
	{
		newinventory.remove(productname);
	}
	
	//delete category dynamically
	public void deletewholecategory(String category)
	{
		categories.remove(category);
		//deleting products related to deleted category
		for (HashMap.Entry<String, SpecificCommodity> entry : newinventory.entrySet()) {
		    if(entry.getValue().gettype().equalsIgnoreCase(category))
		    {
		    	newinventory.remove(entry.getKey());
		    	
		    }
		}
	}

}
