public class Greataxe extends Weapon
{
	@Override
	public void pickUp()
	{
		System.out.println(nameOfItem);
	}
	
	public Greataxe()
	{
		nameOfItem = "Greataxe";
	}
	
}
