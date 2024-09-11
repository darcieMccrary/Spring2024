/*
    Practice working with SCANNERS AND RANDOM and Constants\
    Darcie McCrary
    02/01/24
    */
import java.util.*;

public class M1_Lab2_ScannerPractice {
    
    public static void main (String[] args)
    {
        Scanner keyboardScanner = new Scanner(System.in);
        String prompt = """
                        Please enter any integer in the range of -5 
                        to 1700 as the lower range. If you want to enter 10, 
                        simple type in 10 and hit enter
                        """;
                prompt += "\n --> ";
                System.out.print(prompt);
                int lowerLimit = keyboardScanner.nextInt(); 
       
                prompt = """
                        Please enter any integer in the range of -5 
                        to 1700 as the upper range. If you want to enter 60, 
                        simple type in 60 and hit enter
                        """;
                prompt += "\n --> ";
                System.out.print(prompt);
                int upperLimit = keyboardScanner.nextInt(); 
        
        Random randGen = new Random();
        
        int num_vals = upperLimit - lowerLimit + 1;
        
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.print("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit));
        System.out.println("\nRandom number: "+(randGen.nextInt(num_vals)
        + lowerLimit)+"\n");
        
    }
}
