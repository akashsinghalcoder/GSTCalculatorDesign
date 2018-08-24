import java.util.Scanner;

public class user {
	static Manager manager=new Manager();
	public static void gstcalculator()
	{
		System.out.println("Welcome to gst calculator");
		Scanner reader = new Scanner(System.in);
		reader.useDelimiter(System.getProperty("line.separator"));// Reading from System.in
		System.out.println("Enter units ");
		int units = reader.nextInt();
		System.out.println("Enter product ");
		String product = reader.next();
		System.out.println("Enter price ");
		float price = reader.nextInt();
		float gst=manager.taxcalculator(product, units, price);
		if(gst!=-1)
		{
			System.out.println(price+gst);
				
		}
		else
		{
			System.out.println("Product not available");
		}
				
	}
	public static void addcategorymenu()
	{
		System.out.println("Enter new category to be added");
		Scanner reader = new Scanner(System.in);
		String categoryname = reader.next();
		System.out.println("Enter tax slab for this category ");
		float taxvalue = reader.nextFloat();
		manager.addcategory(categoryname, taxvalue);
				
	}
	public static void addproductmenu()
	{
		System.out.println("Enter product to be added");
		Scanner reader = new Scanner(System.in);
		String productname = reader.next();
		System.out.println("Enter category");
		String category = reader.next();
		manager.addproduct(productname, category);
				
	}
	public static void deleteproductmenu()
	{
		System.out.println("Enter product to be deleted");
		Scanner reader = new Scanner(System.in);
		String productname = reader.next();
		manager.deleteproduct(productname);
				
	}
	public static void deletecategorymenu()
	{
		System.out.println("Enter category to be deleted");
		Scanner reader = new Scanner(System.in);
		String category = reader.next();
		manager.deletewholecategory(category);
				
	}
	public static void changetaxofcategoriesmenu()
	{
		System.out.println("Enter category to be changed");
		Scanner reader = new Scanner(System.in);
		String categoryname = reader.next();
		System.out.println("Enter tax slab for this category ");
		float taxvalue = reader.nextFloat();
		manager.changetaxofparticularcategory(categoryname, taxvalue);
				
	}
	public static void settingupmenu()
	{
		manager.settingupInventoryManager();
		
		while(true)
		{
			System.out.println("Press 0 for exit and 1 for gst calculation");
			System.out.println("Press 2 for adding new category");
			System.out.println("Press 3 for adding new product");
			System.out.println("Press 4 for deleting product");
			System.out.println("Press 5 for deleting category");
			System.out.println("Press 6 for changing tax of categories");
			Scanner reader = new Scanner(System.in);
			int status=reader.nextInt();
			switch(status)
			{
			case 1:gstcalculator();
					break;
			case 2:addcategorymenu();
			break;
			case 3:addproductmenu();
			break;
			case 4:deleteproductmenu();
			break;
			case 5:deletecategorymenu();
			break;
			case 6:changetaxofcategoriesmenu();
			break;
			case 0:System.out.println("The End");
			return;
			
			}
			}
	}
	public static void main(String[] args) {
		settingupmenu();	
			
		}
		
		
		
		
		

	

}
