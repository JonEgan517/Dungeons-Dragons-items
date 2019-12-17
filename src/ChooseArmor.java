import java.util.Scanner;

public class ChooseArmor 
{
	public static void chooseArmor()
	{
		Scanner intInput = new  Scanner(System.in);
		Items w = new Armor();
		w.typeOfItem();
		int armorItem = intInput.nextInt();
		
		switch(armorItem)
		{
			case 1:
				Items plate = new Plate();
				plate.pickUp();
				break;
			case 2:
				Items chainmail = new ChainMail();
				chainmail.pickUp();
				break;
			case 3:
				Items cloth = new Cloth();
				cloth.pickUp();
				break;
		}
		
	}
}
