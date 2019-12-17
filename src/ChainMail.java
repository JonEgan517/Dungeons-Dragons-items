
public class ChainMail extends Armor
{
	@Override
	public void pickUp() 
	{
		System.out.println(nameOfItem);	
	}
	
	public ChainMail()
	{
		nameOfItem = "Chainmail";
		defence = 0; 
	}
}
