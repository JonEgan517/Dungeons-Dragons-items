public class Weapon extends Items
{
	@Override
	public void typeOfItem()
	{
		System.out.println("Choose your " + itemType);
	}
	
	public Weapon()
	{
		itemType = "Weapon";
	}

	@Override
	public void pickUp() {
		// TODO Auto-generated method stub
		
	}
}
