/*
   This is GUI program for lab 4 which is to create a 3 round game of Rock, Paper, 
   Scissors. The user will be prompted to enter their choice of either rock
   paper, or scissors. The computer will then generate its own choice. The last 
   screen will display the score board of the total wins, losses, and ties.
   D.McCrary
   03/14/24
*/

import java.util.*;
import javax.swing.*;

public class Lab4_RPS_GUI {
    
    public static void main(String[] args)
    {
        ImageIcon introIcon = new ImageIcon("clipart942700.png");
        String intro =  "\nHi and welcome to this game of Rock, Paper, Scissors! ";
        intro += "\nThis is a simple three round game, where you will make ";
        intro += "\nyour choice for three rounds and at the end of the third";
        intro += "\nround you will be able to view the final score board.";
        intro += "\nGOOD LUCK!";
        String title = "Rock, Paper, Scissors Game. D.McCrary";
        JOptionPane.showMessageDialog(null, intro,
            title, 1, introIcon );
        
        int count = 0;
        int userWins = 0;
        int computerWins = 0;
        int userLosses = 0;
        int computerLosses = 0;     
        int ties = 0;
        
        while(count < 3)
        {
        
            ImageIcon icon = new ImageIcon("ClipartKey_53688.png");
            String prompt =  "Please, click on one of\n";
            prompt += "the following buttons, \n";
            prompt += "corresponding to your play.\n";
               
            String[] choices = {"Scissors", "Paper", "Rock"};  
            int choice = JOptionPane.showOptionDialog(null, prompt,
                "Play \"Rock, Paper, Scissors\"  D.McCrary",
                0, 0, icon, choices, choices[0]);
        
            String player_choice ="";
            String computer_choice ="";
                  
            switch (choice)
            {
                case 2 -> player_choice = "\"ROCK\"";
                case 1 -> player_choice = "\"PAPER\"";
                case 0 -> player_choice = "\"SCISSORS\"";
            }        

            Random randGen = new Random();
            int num1 = randGen.nextInt(3);         
       
            switch (num1)
            {
                case 2 -> computer_choice = "\"ROCK\"";
                case 1 -> computer_choice = "\"PAPER\"";
                case 0 -> computer_choice = "\"SCISSORS\"";
            }
             
            String resultsAccumulator = "You played: "+ player_choice+ " and\n" +  "the computer played: "+ computer_choice+ ".\n";
        
            if(computer_choice.equals(player_choice)) 
            {
                resultsAccumulator += "It's a tie";
                ImageIcon resultIcon = new ImageIcon("RPS2.png");
                JOptionPane.showMessageDialog(null, resultsAccumulator ,
                    "End of round results  D.McCrary",
                    0, resultIcon);
                ties++;
            }
            
            else if (choice == 2 && num1 == 1)
            {
                resultsAccumulator += "PAPER wraps ROCK."+ "\n" + "The computer WINS!";
                ImageIcon paperWrapsRockIcon = new ImageIcon("paperWrapsRock.png");
                JOptionPane.showMessageDialog(null, resultsAccumulator ,
                    "End of round results  D.McCrary",
                    0, paperWrapsRockIcon);
                computerWins++;
                userLosses++;            
            }
            
            else if (choice == 1 && num1 == 0)
            {
                resultsAccumulator += "SCISSORS cuts PAPER."+ "\n" + "The computer WINS!";
                ImageIcon scissorCutPaperIcon = new ImageIcon("scissorCutPaper.png");                
                    JOptionPane.showMessageDialog(null, resultsAccumulator ,
                    "End of round results  D.McCrary",
                    0, scissorCutPaperIcon);
                computerWins++;
                userLosses++;            
            }
            
            else if (choice == 0 && num1 == 2)
            {
                resultsAccumulator += "ROCK crushes SCISSORS."+ "\n" + "The computer WINS!";   
                ImageIcon rockCrushScissorIcon = new ImageIcon("rockCrushScissor.png");
                    JOptionPane.showMessageDialog(null, resultsAccumulator ,
                    "End of round results  D.McCrary",
                    0, rockCrushScissorIcon);
                computerWins++;
                userLosses++;            
            }
            
            else if (choice == 1 && num1 == 2)
            {
                resultsAccumulator += "PAPER wraps ROCK."+ "\n" + "You WIN!";
                ImageIcon paperWrapsRockIcon = new ImageIcon("paperWrapsRock.png");
                    JOptionPane.showMessageDialog(null, resultsAccumulator ,
                    "End of round results  D.McCrary",
                    0, paperWrapsRockIcon);
                userWins++;
                computerLosses++;
            }
            
            else if (choice == 0 && num1 == 1)
            {
                resultsAccumulator += "SCISSORS cuts PAPER."+ "\n" + "You WIN!"; 
                ImageIcon scissorCutPaperIcon = new ImageIcon("scissorCutPaper.png");                
                    JOptionPane.showMessageDialog(null, resultsAccumulator ,
                    "End of round results  D.McCrary",
                    0, scissorCutPaperIcon);
                userWins++;
                computerLosses++;
            }
            
            else if (choice == 2 && num1 == 0)       
            {
                resultsAccumulator += "ROCK crushes SCISSORS."+ "\n" + "You WIN!";
                ImageIcon rockCrushScissorIcon = new ImageIcon("rockCrushScissor.png");
                    JOptionPane.showMessageDialog(null, resultsAccumulator ,
                    "End of round results  D.McCrary",
                    0, rockCrushScissorIcon);
                userWins++;
                computerLosses++;
            }
            
            count++;
        }
        
        ImageIcon finalScoreIcon = new ImageIcon("ClipartKey_1094212.png");
        JOptionPane.showMessageDialog(null, "<html> <h3> TOTAL WINS: </h3>"+userWins+
            "<h3> TOTAL LOSSES: </h3>"+userLosses+ "<h3> TOTAL TIES: </h3>"+ties,
            "FINAL SCOREBOARD  D.McCrary", 0, finalScoreIcon);
           
        
        ImageIcon terminationScreenIcon = new ImageIcon("RPS2.png");
        JOptionPane.showMessageDialog(null, "This game has been TERMINATED",
            "TERMINATION SCREEN  D. McCrary", 0, terminationScreenIcon);
            
    }   
}
