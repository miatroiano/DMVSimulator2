import java.util.Random;

public class DmvSimulator {
	public static void main(String []args) {
		Random random = new Random();
		int randomNumber = random.nextInt(200);
		int chance = random.nextInt(100);
		
		Boolean call = false; 
		int numb = 1;
		System.out.println("welcome to the DMV!");
		System.out.println("you are number " + randomNumber + " please wait until your number is called");
		while (call == false) {
			
			if (randomNumber == numb) {
				System.out.println(randomNumber);
				call = true;
				if(chance == 1) {
					System.out.println("You have all required paperwork!");
				}
				else{
					System.out.println("You dont have the required paperwork MWAHAHAHAHAHAHA!! :D ");
				}
				
			}
			else {
				System.out.println(numb);
				numb += 1;
			}
		}
	}
}
