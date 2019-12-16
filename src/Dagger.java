
public class Dagger extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem + " used by " + classes + ".");	
	}
	
	public Dagger()
	{
		nameOfItem = "Dagger";
		classes = "";
		stats = "";
	}
}
