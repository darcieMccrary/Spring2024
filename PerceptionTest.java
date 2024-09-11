/*
   This program will asimulate a perception test using Zenner Cards which were used 
   in the 60's to experiment for ESP(extrasensory perception). This program will
   use a program loop and the back-door approach to accomplish this project. 
   D.McCrary
   03/22/24
 */

import java.util.*;
import javax.swing.*;

public class PerceptionTest {
    
    public static void main(String[] args)
    {
        ImageIcon introIcon = new ImageIcon("psi_cards/"+"question.png");
        String intro =  "Welcome to this Perception Test. To begin the test\n";        
        intro += "you will be given the choice to either guess for shapes, colors,\n";
        intro += "or both shapes and colors. There will be a series of 5 trials\n";
        intro += "in which you will be asked to perceive the shape or color\n";
        intro += "behind the card. You will then be told if your guess was\n";
        intro += "correct or incorrect. At the end of the 5 trials you will be\n";
        intro += "given the option to either quit the program or add on another 5 trials.\n";
        intro += "When you do decide to quit this game will terminate.\n";
        String title = "Perception Test.  D.McCrary";
        JOptionPane.showMessageDialog(null, intro,
            title, 1, introIcon );
        
        ImageIcon typeTestIcon = new ImageIcon("psi_cards/"+"question.png");
        String prompt = "Which perception test would you like to perform?\n";
        prompt += "If you want to choose shapes simply click the shape button\n";
        prompt += "and the test will be administered.\n";
        
        String[] choices = {"Quit", "Both", "Color", "Shape"};  
        int choice = JOptionPane.showOptionDialog(null, prompt,
            "Choose test  D.McCrary",
            0, 0, typeTestIcon, choices, choices[0]);
            
        String[] shapes = {"Square", "Circle", "Star", "Wavy", "Plus"};
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black"};
                   
        
        while(true) 
        {  
            int roundCounter = 0;
            int totalRound = 0;                    
            int totalCorrect = 0;
            int setsOfTrials = 0;

            Random randGen = new Random();
            
            if (choice == 2) 
            {   
                while(true) 
                {   
                    int color = randGen.nextInt(5); 
                    int shape = randGen.nextInt(5); 

                    ImageIcon colorGeneratedIcon = new ImageIcon("psi_cards/" + "unknown.png");
                    String colorResults = "Your card has been generated\n";
                    colorResults += "What color do you perceive?\n";

                    int chosenColor = JOptionPane.showOptionDialog(
                        null, colorResults, "Choose a Color D.MCcrary",
                        0, 0, colorGeneratedIcon, colors, colors[0]);

                    String colorAccumulator = "Color Perception: \nYou percieved \n" 
                        + colors[chosenColor] + "\nThe color was \n" + colors[color] + "\n";

                    if (colors[chosenColor] == colors[color]) 
                    {
                        totalCorrect++;
                        colorAccumulator += "You guessed correctly!";
                    } 
                    else 
                    {    
                        colorAccumulator += "Better luck next time.";
                    }

                    String fileName = "psi_cards/" + colors[color] + "AND" + shapes[shape] + ".png";
                    ImageIcon icon = new ImageIcon(fileName);
                    JOptionPane.showMessageDialog(null, 
                        colorAccumulator, "Color Results   D. McCrary", 0, icon);

                    totalRound++;
                    roundCounter++; 

                    if (totalRound % 5 == 0)
                    {
                        ImageIcon addColorTrialsIcon = new ImageIcon("psi_cards/" + "question.png");
                        String addColorTrials = "\nYou have entered " + totalRound + " Perceptions";
                        addColorTrials += "\nYour color score is " + totalCorrect;

                        String[] ColorTrialChoices = {"Another 5 trials", "Quit"};
                        int colorTrialChoice = JOptionPane.showOptionDialog(null, addColorTrials,
                            "Total Color Round Results  D.McCrary",
                            0, 0, addColorTrialsIcon, ColorTrialChoices, ColorTrialChoices[0]);

                            if (colorTrialChoice == 1) 
                            {
                                ImageIcon terminationScreenIcon = new ImageIcon("psi_cards/" + "question.png");
                                JOptionPane.showMessageDialog(null, "This game has been TERMINATED",
                                    "TERMINATION SCREEN  D. McCrary", 0, terminationScreenIcon);  

                                System.exit(0);
                            }
                            setsOfTrials++;
                    }
                } 
            }
            
            else if (choice == 3)
            {
                while (true)
                {   
                    int color = randGen.nextInt(5); 
                    int shape = randGen.nextInt(5); 
            
                    ImageIcon shapeGeneratedIcon = new ImageIcon("psi_cards/"+"unknown.png");
                    String shapeResults = "Your card has been generated\n";
                    shapeResults += "What shape do you perceive?\n";
            
                    
                    int chosenShape = JOptionPane.showOptionDialog(
                        null, shapeResults,"Choose a Shape   D.MCcrary",
                        0, 0, shapeGeneratedIcon, shapes, shapes[0]);
                    
                    String shapeAccumulator = "Shape Perception: \nYou percieved\n" 
                        +shapes[chosenShape]+"\nThe shape was\n" +shapes[shape]+"\n";
                    
                    if(shapes[chosenShape] == shapes[shape]) 
                    {
                       totalCorrect++;
                       shapeAccumulator += "You guessed correctly!";
                    }
                    else
                    {    
                       shapeAccumulator += "Better luck next time";
                    }
                    
                    String fileName = "psi_cards/"+colors[color]+"AND"+shapes[shape]+".png";
                    ImageIcon icon = new ImageIcon(fileName);
                    icon = new ImageIcon(fileName);
                    JOptionPane.showMessageDialog(null, shapeAccumulator, 
                        "Shape Results  D. McCrary", 0, icon);
                    
                    totalRound++;
                    roundCounter++;
                    
                    if(totalRound % 5 == 0)
                    {
                        ImageIcon addShapeTrialsIcon = new ImageIcon("psi_cards/"+"question.png");
                        String addShapeTrials = "\nYou have entered "+ totalRound + " Perceptions";
                        addShapeTrials += "\nYour shape score is "+ totalCorrect;
                    
                    
                        String[] ShapetrialChoices = {"Another 5 trials", "Quit"};  
                        int ShapeTrialChoice = JOptionPane.showOptionDialog(null, addShapeTrials,
                            "Total Shape Round Results  D.McCrary",
                            0, 0, addShapeTrialsIcon, ShapetrialChoices, ShapetrialChoices[0]); 
                    
                            if(ShapeTrialChoice == 1)
                            {
                                ImageIcon terminationScreenIcon = new ImageIcon("psi_cards/"+"question.png");
                                JOptionPane.showMessageDialog(null, "This game has been TERMINATED",
                                "TERMINATION SCREEN  D. McCrary", 0, terminationScreenIcon);  
                
                                System.exit(0);
                            }   
                            setsOfTrials++;
                    }  
                }
            }
            
            if(choice == 1)
            {
                while(true)
                {
                    int color = randGen.nextInt(5); 
                    int shape = randGen.nextInt(5); 
            
                    ImageIcon colorTestIcon = new ImageIcon("psi_cards/"+"unknown.png");
                    String colorResults = "You have chosen to test for both shape and color\n";
                    colorResults += "Your cards have been generated\n";
                    colorResults += "Your first perception test will be color\n";
                    colorResults += "What color do you perceive?\n";
            
                    int chosenColor = JOptionPane.showOptionDialog(
                        null, colorResults,"Choose a Color  D.McCrary",
                        0, 0, colorTestIcon, colors, colors[0]);
                   
                    ImageIcon shapeTestIcon = new ImageIcon("psi_cards/"+"unknown.png");
                    String shapeResults = "Your second perception is shape\n";
                    shapeResults += "What shape do you perceive?\n";
                    
                    int chosenShape = JOptionPane.showOptionDialog(
                        null, shapeResults,"Choose a Shape  D.McCrary",
                        0, 0, shapeTestIcon, shapes, shapes[0]);
                    
                    String shapeAndColorAccumulator = "Color Perception: \n"+"You guessed " 
                        +colors[chosenColor]+"\n"+"The color was " +colors[color]+
                        "\nShape Perception: \n"+"You guessed " +shapes[chosenShape]+
                        "\n"+"The shape was " +shapes[shape]+"\n";
                    
                    if(shapes[chosenShape] == shapes[shape] && colors[chosenColor] == colors[color]) 
                    {
                       totalCorrect++;
                       shapeAndColorAccumulator += "You guessed correctly!";
                    }
                    else if (shapes[chosenShape] == shapes[shape] && colors[chosenColor] != colors[color])
                    {  
                       totalCorrect++;
                       shapeAndColorAccumulator += "You chose the correct shape but missed the color.";
                    }
                    else if (shapes[chosenShape] != shapes[shape] && colors[chosenColor] == colors[color])
                    {   
                        totalCorrect++;
                        shapeAndColorAccumulator += "You chose the correct color but missed the shape.";
                    }
                    else
                    {
                       shapeAndColorAccumulator += "You guessed neither correctly."+"\n"+"Beter luck next time";
                    }
                    
                    String fileName = "psi_cards/"+colors[color]+"AND"+shapes[shape]+".png";
                    ImageIcon icon = new ImageIcon(fileName);
                    JOptionPane.showMessageDialog(null, shapeAndColorAccumulator,
                        "Color and Shape Results  D.McCrary", 0, icon);
                    
                    totalRound++;
                    roundCounter++;
                      
                    if(totalRound % 5 == 0)
                    {
                        ImageIcon addFiveIcon = new ImageIcon("psi_cards/"+"question.png");
                        String finalResults = "\nYou have entered "+ totalRound + " Perceptions";
                        finalResults += "\nYour shape and color score is "+ totalCorrect;
                 
                        String[] ShapeAndColortrialChoices = {"Another 5 trials", "Quit"};  
                        int ShapeAndColorTrialChoice = JOptionPane.showOptionDialog(null, finalResults,
                            "Total Shape & Color Round Results  D.McCrary",
                            0, 0, addFiveIcon, ShapeAndColortrialChoices, ShapeAndColortrialChoices[0]); 
                
                        if(ShapeAndColorTrialChoice == 1)
                        {
                            ImageIcon terminationScreenIcon = new ImageIcon("psi_cards/"+"question.png");
                            JOptionPane.showMessageDialog(null, "This game has been TERMINATED",
                            "TERMINATION SCREEN  D.McCrary", 0, terminationScreenIcon);  
                
                            System.exit(0);
                        }
                        setsOfTrials++;
                    }
                } 
            }
              
            if(choice == 0)
            {
                ImageIcon terminationScreenIcon = new ImageIcon("psi_cards/"+"question.png");
                JOptionPane.showMessageDialog(null, "This game has been TERMINATED",
                    "TERMINATION SCREEN  D.McCrary", 0, terminationScreenIcon);  
                
                System.exit(0);
            } 
        } 
    } 
}
