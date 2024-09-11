/*
   This program is for assignment 1 which is to create a high/low dice game.
   Darcie McCrary
   02/09/24
 */

import java.util.*;

public class M1_Assignment1 {

    public static void main (String[] args)
    {
        String welcomeIntroGreeting = """
            Hi and welcome to your very first experience of
            playing this high/low game. Let me explain the rules. First you will
            role 5 dice and the total sum of your role will be displayed. Next
            the computer will take it's turn at rolling the dice. You will then
            be prompted to guess whether you think your total is lower or higher
            than the computers total. If you want to guess 'high', type in 'H'
            and hit enter. If you want to guess 'low', type in 'L' and hit
            enter. Now all you have to do is wait for the results.
            Ready? Now, LET'S BEGIN!
            """;
        System.out.print(welcomeIntroGreeting+ "\n");

        Random randGen = new Random();
        Scanner keyboard = new Scanner(System.in);
            
        System.out.print("You rolled the dice below: ");
        int userRandNum1 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 1 --> "+userRandNum1);        
        int userRandNum2 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 2 --> "+userRandNum2);        
        int userRandNum3 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 3 --> "+userRandNum3);        
        int userRandNum4 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 4 --> "+userRandNum4);        
        int userRandNum5 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 5 --> "+userRandNum5+"\n");
        
        int userRunningTotal = userRandNum1 + userRandNum2 + userRandNum3 + userRandNum4 +  userRandNum5;            
        System.out.println("The total of your roll is " +userRunningTotal);
               
        String prompt = "\nPlease enter whether you think your number is ether higher or lower than the computers.\n";
        prompt += "If you want to guess lower type L and hit enter, if you want to guess higher type H.\n";
        prompt += "\n --> ";
        System.out.print(prompt);
        String highLow = keyboard.next();   
        String user = highLow;
        
        switch(user)
        {
        case "H":
        case "h":
        System.out.printf("You guessed HIGHER.\n");
        break;
        case "L":
        case "l":
        System.out.printf("You guessed LOWER.\n");
        break;     
        }

        System.out.print("\nThe computer rolled the dice below:");
        int computerRandNum1 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 1 --> "+computerRandNum1);
        int computerRandNum2 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 2 --> "+computerRandNum2);
        int computerRandNum3 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 3 --> "+computerRandNum3);
        int computerRandNum4 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 4 --> "+computerRandNum4);
        int computerRandNum5 = randGen.nextInt(6)+1;
        System.out.print("\nRoll 5 --> "+computerRandNum5+"\n");
               
        int computerRunningTotal = computerRandNum1 + computerRandNum2 + computerRandNum3 + computerRandNum4 + computerRandNum5;            
        System.out.println("The total of the computer's roll is " +computerRunningTotal+".\n");
        
        if (userRunningTotal > computerRunningTotal && user.equals("H"))
            System.out.print("You guessed HIGHER and you are CORRECT! \n\n");
        else if (userRunningTotal > computerRunningTotal && user.equals("L"))
            System.out.print("You guessed LOWER and you are INCORRECT! \n\n");
        else if (userRunningTotal < computerRunningTotal && user.equals("L"))
            System.out.print("You guessed LOWER and you are CORRECT! \n\n");
        else if (userRunningTotal < computerRunningTotal && user.equals("H"))
            System.out.print("You guessed HIGHER and you are INCORRECT! \n\n");
        
        System.out.print("This program is terminated \n\n");
    }
}
