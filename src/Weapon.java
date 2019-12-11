public abstract class Weapon extends Items
{
	@Override
	public void typeOfItem()
	{
		System.out.println(itemType);
	}
	
	public Weapon()
	{
		itemType = "Weapon";
	}
}
