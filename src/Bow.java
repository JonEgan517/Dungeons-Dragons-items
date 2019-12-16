
public class Bow extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem + " used by " + classes + ".");	
	}
	
	public Bow()
	{
		nameOfItem = "Bow";
		classes = "";
		stats = "";
	}
}
