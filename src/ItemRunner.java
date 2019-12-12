public class ItemRunner 
{
	public static void main(String[] args)
	{
		Items [] bag = new Items[1];
		bag[0] = new Greataxe();
		
		for(Items b : bag)
		{
			b.pickUp();
			b.typeOfItem();
		}
	}
}
