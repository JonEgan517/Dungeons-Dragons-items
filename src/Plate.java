
public class Plate extends Armor
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);	
	}
	
	public Plate()
	{
		nameOfItem = "Plate Armor";
		defence = 0;
	}
}
