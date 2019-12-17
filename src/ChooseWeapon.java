import java.util.Scanner;

public class ChooseWeapon 
{
	public static void chooseWeapon()
	{
		Scanner intInput = new  Scanner(System.in);
		Items w = new Weapon();
		w.typeOfItem();
		int weaponItem = intInput.nextInt();
		
		switch(weaponItem)
		{
			case 1:
				Items greataxe = new Greataxe();
				greataxe.pickUp();
				break;
			case 2:
				Items mace = new Mace();
				mace.pickUp();
				break;
			case 3:
				Items sword = new Sword();
				sword.pickUp();
				break;
			case 4:
				Items staff = new Staff();
				staff.pickUp();
				break;
			case 5:
				Items dagger = new Dagger();
				dagger.pickUp();
				break;
			case 6:
				Items bow = new Bow();
				bow.pickUp();
				break;
		}
	}
}
