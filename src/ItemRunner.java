import java.util.Scanner;

public class ItemRunner 
{
	public static void main(String[] args)
	{		
		Scanner intInput = new  Scanner(System.in);
		System.out.println("Choose your Weapon");
		int weaponItem = intInput.nextInt();
		
		switch(weaponItem)
		{
			case 1:
				Items ga = new Greataxe();
				ga.pickUp();
				break;
			case 2:
				Items m = new Mace();
				m.pickUp();
				break;
			case 3:
				Items sw = new Sword();
				sw.pickUp();
				break;
			case 4:
				Items st = new Staff();
				st.pickUp();
				break;
			case 5:
				Items d = new Dagger();
				d.pickUp();
				break;
			case 6:
				Items b = new Bow();
				b.pickUp();
				break;
		}
	}
}
