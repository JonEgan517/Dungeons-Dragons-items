public class Armor extends Items
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

	@Override
	public void pickUp() {
		// TODO Auto-generated method stub
		
	}
}
