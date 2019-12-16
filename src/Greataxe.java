public class Greataxe extends Weapon
{
	@Override
	public void pickUp()
	{
		System.out.println(nameOfItem + " used by " + classes + ".");
	}
	
	public Greataxe()
	{
		nameOfItem = "Greataxe";
		classes = "Barbarians";
		stats = "";
	}
	
}
