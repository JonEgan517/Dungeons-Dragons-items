
public class Sword extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem + " used by " + classes + ".");	
	}
	
	public Sword()
	{
		nameOfItem = "Sword";
		classes = "";
		stats = "";
	}
}
