public abstract class Armor extends Items
{
	@Override
	public void typeOfItem()
	{
		System.out.println(itemType);
	}
	
	public Armor()
	{
		itemType = "Armor";
	}
}
