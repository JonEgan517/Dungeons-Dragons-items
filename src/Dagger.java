
public class Dagger extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);	
	}
	
	public Dagger()
	{
		nameOfItem = "Dagger";
		strength = 0;
	}
}
