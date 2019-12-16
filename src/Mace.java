public class Mace extends Weapon
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem + " used by " + classes + ".");		
	}
	
	public Mace()
	{
		nameOfItem = "Mace";
		classes = "Cleric";
		stats = "";
	}

}
