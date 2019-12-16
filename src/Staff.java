
public class Staff extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem + " used by " + classes + ".");	
	}
	
	public Staff()
	{
		nameOfItem = "Staff";
		classes = "";
		stats = "";
	}
}
