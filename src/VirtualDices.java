import java.util.Scanner;

public class VirtualDices {

	public static void main(String[] args) {
		
		//let the user use the keyboard
		Scanner scan = new Scanner(System.in);

		//System.out.println("How many dices do you want to roll? ");
		
		//int dicesNum = scan.nextInt();
		
		int success = 0;
		int reRoll = 0;
		
		String confirm = "y";
		
		while (confirm == "y"){
			
			int dicesNum;
			if (reRoll != 0){
				
				System.out.println("You roll "+reRoll+" dices.");
				dicesNum = reRoll;
			} else {
				System.out.println("How many dices do you want to roll? ");
				dicesNum = scan.nextInt();
			}

			
			for(int x=0; x<dicesNum; x++){
				
				
				int rolledDice = (int)(Math.random()*10 + 1);
				if (rolledDice >= 8){
					success++;
					if (rolledDice==10){
						reRoll++;
					}
				}
				System.out.println(rolledDice);
				
			}
			System.out.println(success + " successes.");
			if (reRoll != 0){
				System.out.println("Reroll "+reRoll +".");
				System.out.println("Do you continue (y/n)? ");
				confirm = scan.next();
				dicesNum = reRoll;
			} else {
				System.out.println("Play again (y/n)? ");
				confirm = scan.next();
				
			}
		}
		
	}

}
