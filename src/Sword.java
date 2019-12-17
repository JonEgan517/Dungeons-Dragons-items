
public class Sword extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);	
	}
	
	public Sword()
	{
		nameOfItem = "Sword";
		strength = 0;
	}
}
