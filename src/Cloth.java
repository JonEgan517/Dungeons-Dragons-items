
public class Cloth extends Armor
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);	
	}
	
	public Cloth()
	{
		nameOfItem = "Cloth";
		defence = 0;
	}
}
