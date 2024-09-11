/*
   This program is for practicing using full switch statements to display the 
   roman numeral symbols that correspond to a users' input of a number in the 
   range of 1-999. It will will extract and display each digit as well as 
   check if the number the user entered is within the correct range or not.
   Darcie McCrary
   02/22/24
 */

import java.util.*;

public class RomanNumeralTranslator
{  
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String prompt = "Please enter any integer in the range of 1-999. ";
        prompt += "\nIf you want to enter 325, simple just type it in and hit enter. \n";
        prompt += "\n--> ";
        System.out.print(prompt);
        int userInput = keyboard.nextInt();
        
        int upperLimit = 999;
        int lowerLimit = 1;
        
        int number = userInput;
        int hundreds_place = number / 100;
        number = number % 100;
        int tens_place = number / 10;
        int units_place = number % 10;
        
        String romanNumeral_DP = "";
        switch(units_place)
        {
            case 9:
                romanNumeral_DP += "IX";
                break;
            case 8:
                romanNumeral_DP += "VIII";
                break;
            case 7:
                romanNumeral_DP += "VII";
                break;    
            case 6:
                romanNumeral_DP += "VI";
                break; 
            case 5:
                romanNumeral_DP += "V";
                break;  
            case 4:
                romanNumeral_DP += "IV";
                break;
            case 3:
                romanNumeral_DP += "III";
                break;
            case 2:
                romanNumeral_DP += "II";
                break;
            case 1:
                romanNumeral_DP += "I";
                break;    
        }
        
        String romanNumeral_TP = "";
        switch(tens_place)
        {
            case 9:
                romanNumeral_TP += "XC";
                break;
            case 8:
                romanNumeral_TP += "LXXX";
                break;
            case 7:
                romanNumeral_TP += "LXX";
                break;    
            case 6:
                romanNumeral_TP += "LX";
                break; 
            case 5:
                romanNumeral_TP += "L";
                break;  
            case 4:
                romanNumeral_TP += "XL";
                break;
            case 3:
                romanNumeral_TP += "XXX";
                break;
            case 2:
                romanNumeral_TP += "XX";
                break;
            case 1:
                romanNumeral_TP += "X";
                break;    
        }
        
        String romanNumeral_HP = "";
        switch(hundreds_place)
        {
            case 9:
                romanNumeral_HP += "CM";
                break;
            case 8:
                romanNumeral_HP += "DCCC";
                break;
            case 7:
                romanNumeral_HP += "DCC";
                break;    
            case 6:
                romanNumeral_HP += "DC";
                break; 
            case 5:
                romanNumeral_HP += "D";
                break;  
            case 4:
                romanNumeral_HP += "CD";
                break;
            case 3:
                romanNumeral_HP += "CCC";
                break;
            case 2:
                romanNumeral_HP += "CC";
                break;
            case 1:
                romanNumeral_HP += "C";
                break;    
        }
        
        if (userInput >= lowerLimit && userInput <= upperLimit)
            System.out.print("The isolated digits are: "+(hundreds_place)+ "   "+ (tens_place)+ "   "+ (units_place)+ "\n\n");
        if (userInput >= lowerLimit && userInput <= upperLimit)
            System.out.print("The value "+userInput+" in roman numerals is "+romanNumeral_HP+romanNumeral_TP+romanNumeral_DP+".\n\n");
        else 
            System.out.print("\nYou entered a number that is not in the correct range. Try again! \n\n");
    }  
}
