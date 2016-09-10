import java.util.Scanner;

public class VirtualDices {

	public static void main(String[] args) {
		
		//let the user use the keyboard
		Scanner scan = new Scanner(System.in);


		int reRoll = 0;
		int totSuccess = 0;
		
		String confirm = "y";
		
		try{	
			while (confirm.equalsIgnoreCase("y")){
				
				//initialize success and reroll variables
				int success = 0;
				
				
				//number of dices to be rolled
				int dicesNum;
				
				
				if (reRoll != 0){
					
					System.out.println("You roll "+reRoll+" dices.");
					dicesNum = reRoll;
					reRoll = 0;
				} else {
					System.out.println("How many dices do you want to roll? ");
					dicesNum = scan.nextInt();	
				}
				
				for(int x=0; x<dicesNum; x++){
					
	
					
					int rolledDice = (int)(Math.random()*10 + 1);
					if (rolledDice >= 8){
						success++;
						//totSuccess += success;
						if (rolledDice==10){
							reRoll++;
						}
					}
					System.out.println("You rolled: " + rolledDice);
					
				}
				System.out.println(success + " successes.");
				totSuccess += success;
				System.out.println(totSuccess + " in total.");
				if (reRoll != 0){
					System.out.println("Reroll "+reRoll +".");
					System.out.println("Do you continue (y/n)? ");
					confirm = scan.next();
					//dicesNum = reRoll;
					//reRoll = 0;
				} else {
					System.out.println("Play again (y/n)? ");
					confirm = scan.next();
					totSuccess = 0;
					
				}
	
			}
		} catch(Exception e){
			System.out.println("Invalid input. Please restart the program.");
		}
	}

}
