
public class Bow extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);	
	}
	
	public Bow()
	{
		nameOfItem = "Bow";
		strength = 0;
	}
}
