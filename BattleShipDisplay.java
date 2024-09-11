/*
    This program is for assignment three and is designed to display a battleship
    pegboard with the users randomly generated ship. It will be using GUI format 
    through JOptionPane to prompt the user to run the program to display their ship.
    The user will then have an option to quit or show another board.
    Darcie McCrary
    04/19/24
 */

import java.util.*;

import javax.swing.*;

public class BattleShipDisplay 
{
    public static void main(String[] args)
   {
        String intro = "Welcome to this game of battleships.\n";
        intro += "This game will randomly place a ship on the pegboard.\n";
        intro += "To play simply click 'show board'. Once you do this\n";
        intro += "you can either generate another ship by clicking\n";
        intro += "'show another board' or quit to end the program.\n";
        intro += "Are you ready? BEGIN!";
        String introTitle = "Battleships.   D.McCrary";
        String[] introButton = {"Show Board!"};    
        JOptionPane.showOptionDialog(null, intro,
            introTitle,0, 1, null, introButton, introButton[0]);    
 
        while(true)
        {  
            int numberOfRows = 10;
            int numberOfCols = 10;
            String[][] populatedArray = generateBoard(numberOfRows, numberOfCols);
            
            displayBoard(populatedArray, numberOfRows, numberOfCols);    
        }
    }
    
    public static String[][] generateBoard(int numRows, int numCols)  
    {
        String[][] pegBoard = new String[numRows][numCols];
        String emptySpaceSymbol = "--";
        Random randGen = new Random();
        
        for(int pegBoardRowIterator = 0; pegBoardRowIterator < numRows; pegBoardRowIterator++)
        {
            for(int pegBoardColIterator = 0; pegBoardColIterator < numCols; pegBoardColIterator++)
            {
                pegBoard[pegBoardRowIterator][pegBoardColIterator] = emptySpaceSymbol;
            }
        }
                
        String shipSymbol = " X ";    
        int shipSize = 5;
        int lastValidCol = numCols - shipSize;
        int lastValidRow = numRows - shipSize;
        int randomStartCol = randGen.nextInt(lastValidCol);
        int randomStartRow = randGen.nextInt(lastValidRow);
        

        int shipsRandomOrientation = randGen.nextInt(2);
        
        if (shipsRandomOrientation == 0) 
        {   
            lastValidRow = numRows;
            randomStartRow = randGen.nextInt(lastValidRow);
            for (int horizontalShipPosition = 0; horizontalShipPosition < shipSize; horizontalShipPosition++) 
            {   
                
                pegBoard[randomStartRow][randomStartCol + horizontalShipPosition] = shipSymbol;
            }           
        } 
        else 
        {   
            randomStartCol = numCols;
            randomStartCol = randGen.nextInt(lastValidCol);
            for (int verticalShipPosition = 0; verticalShipPosition < shipSize; verticalShipPosition++) 
            {
                
                pegBoard[randomStartRow + verticalShipPosition][randomStartCol] = shipSymbol;
            }
        }
        return pegBoard;
    }

    public static void displayBoard(String[][] populatedArray, int numberOfRows, int numberOfCols) 
    {
        String displayAccumulator = "";
        for(int displayIterator = 0; displayIterator < populatedArray.length; displayIterator++)
        {
            for(int displayIterator2 = 0; displayIterator2 < populatedArray[0].length; displayIterator2++)
            {
                displayAccumulator += populatedArray[displayIterator][displayIterator2]+ " ";  
            }
            displayAccumulator += "\n";    
        }
        String[] options = {"Show Another Board", "Quit"};
        String boardTitle = "Battleship board D. McCrary";
        int newBoardOrQuit = JOptionPane.showOptionDialog(null, "New Gameboard\n\n"+displayAccumulator,
            boardTitle,0, 1, null, options, options[0]);
                
        if(newBoardOrQuit == 0)
        {
            String[][] newPopulatedArray = generateBoard(numberOfRows, numberOfCols);
            displayBoard(newPopulatedArray, numberOfRows, numberOfCols);
        }
                
        if (newBoardOrQuit == 1)
        {
            String terminationTitle = "Battleship Termination";
            String[] terminationButton = {"Terminate!"};
            JOptionPane.showOptionDialog(null, "This game has been TERMINATED",
                terminationTitle, 0, 1, null,terminationButton,terminationButton[0]);    
                 
        }
        System.exit(0);  
    }    
}
            