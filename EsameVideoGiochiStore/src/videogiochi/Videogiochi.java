package videogiochi;


public class Videogiochi {
	
	private String id;
	private String name; 
	private String swh; // SoftWare House
	private CategoryGame category;
	private double price;
	 
	
	public Videogiochi( String theId, String theName, String theSwh, CategoryGame theCategory, double thePrice )
	{
		this.id = theId;
		this.name = theName;
		this.swh = theSwh;
		this.category = theCategory;
		this.price = thePrice;
	}
	
	//Accessory methods
	public String getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getSwh()
	{
		return swh;
	}
	public CategoryGame getCategory()
	{
		return category;
	}
	public double getPrice()
	{
		return price;
	}
	
	//Mutators methods
	public void setId(String newId)
	{
		if(newId != null)
			this.id = newId;
		else{
			System.out.println("The id must have a value");
			System.exit(0);
		}
	}
	public void setName(String newName)
	{
		if(newName != null)
			this.name = newName;
		else{
			System.out.println("The name must have a value");
			System.exit(0);
		}
	}
	public void setSwh(String newSwh)
	{
		if(newSwh != null)
			this.name = newSwh;
		else{
			System.out.println("The Swh name must have a value");
			System.exit(0);
		}
	}
	public void setCategoryGame(CategoryGame newCatGame)
	{
		if(newCatGame != null)
			this.category = newCatGame;
		else{
			System.out.println("The new CatGame must have a value");
			System.exit(0);
		}
	}
	@Override
	public String toString()
	{
		return "Video Game: " + id + " " + name + " Software House: " +swh + " Category: " + category;
	}
	
}
