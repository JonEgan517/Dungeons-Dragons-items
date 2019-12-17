public class Mace extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);		
	}
	
	public Mace()
	{
		nameOfItem = "Mace";
		strength = 0;
	}

}
