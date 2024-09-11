/*
    This is a the driver class that is used to test Class Ship.
    D. McCrary
    04/24/24
 */

import java.io.*;

import java.util.*;

import javax.swing.*;

public class ShipDriver 
{
    public static void main(String[] args)
    {
        ArrayList<Ship> myShips = new ArrayList<>();
        
        String fileName = "justShips.csv";
        File inFile = new File(fileName);
        
        if( ! inFile.exists())
        {
            String fileNotPresentMessage = "The file: "+fileName+"\n"+
                "is not present.\n" + "Check spelling or location of file\n";
            
            JOptionPane.showMessageDialog(null, fileNotPresentMessage,
                "File Missing", 0);
            System.exit(0);
        }
        
        try
        {
            Scanner inScan = new Scanner(inFile).useDelimiter("[,\n]");
            
            while(inScan.hasNext())
            {
                String tempName = inScan.next();
                int tempYear = inScan.nextInt();
                String tempCountry = inScan.next();
                
                myShips.add(new Ship(tempName,tempYear,tempCountry+"\n"));
            }
          
            inScan.close();
        }
        catch(IOException ioe)
        {
            String troubleOpeningFileMessage = "Trouble opening file: "+fileName+"!";
            JOptionPane.showMessageDialog(null, troubleOpeningFileMessage,
                "Cannot Open File!", 2);
            System.exit(0);
        }
        
        int lineNumber = 1;
        int maxLineNumber = myShips.size(); 
        int numDigits = String.valueOf(maxLineNumber).length();
        
        String accumulator = "";
        for (Ship tempShip : myShips) 
        {
            String alignNumber = String.format("%" + numDigits + "d", lineNumber);
    
            accumulator += alignNumber + ": " + tempShip;
    
            lineNumber++;
        }

        JOptionPane.showMessageDialog(null, "Our Fleet\n" + accumulator, "Fleet Roster", 1);
    }
}