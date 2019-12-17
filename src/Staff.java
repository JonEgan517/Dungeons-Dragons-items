
public class Staff extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);	
	}
	
	public Staff()
	{
		nameOfItem = "Staff";
		strength = 0;
	}
}
