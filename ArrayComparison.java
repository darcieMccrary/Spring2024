/*
    This program is for lab 5 and will use and total of four methods: 
    one main method without return, two methods with two array arguments without return,
    and the fourth method will take three arrays as arguments and return an array of int type.
    The goal for this program is to take two random generated arrays, print them side by side,
    compare the arrays element by element and display how many times each array's elements
    is higher then the other. It will also watch and display any ties. 
    Darcie McCrary
    04/08/24
 */
import java.util.*;

public class ArrayComparison 
{
    public static void main(String[] args)
    {
        int highLimit = 15;
        int lowLimit = 10;
        int elements = 10;
        
        int highLimit2 = 15;
        int lowLimit2 = 10;
        int elements2 = 10;
       
        int[] firstArray = initializeArray(highLimit, lowLimit, elements);
        int[] secondArray = initializeArray(highLimit2, lowLimit2, elements2);
        printTwoArrays(firstArray, secondArray);
        compareArrays(firstArray,secondArray);
        System.out.println("This program will now terminate. \n\n");
    }
    
    public static void printTwoArrays(int[] array, int[] array2)
    {
        for(int index = 0; index < array.length; index++)
        {
            String index_string1 = String.format("Index %2d:", index); 
            String index_string2 = String.format("%3d",array[index]);
            String index_string3 = String.format(" %3d", array2[index]);
            System.out.println(index_string1+"  "+index_string2+ " "+index_string3);
        }
        System.out.print("\n");
    }
    
    public static int[] initializeArray(int upperLimit, int lowerLimit, int num_elements) 
    {
        int[] arrayOfInts = new int[num_elements];
        Random randGen = new Random();
        int numberValues = upperLimit - lowerLimit +1;
        for(int index = 0; index < num_elements; index++)
        {
            arrayOfInts[index] = randGen.nextInt(numberValues) + lowerLimit;
            
        }
        return arrayOfInts;
    }    
    
    public static void compareArrays(int[] compareArray, int[] compareArray2)
    {
        int array1Counter = 0;
        int array2Counter = 0;
        int ties = 0;
        
        for (int counter = 0; counter < compareArray.length; counter++) 
        {
            if (compareArray[counter] > compareArray2[counter]) 
            {
                array1Counter++;
            } 
            if (compareArray2[counter] > compareArray[counter]) 
            {
                array2Counter++;   
            } 
            if(compareArray2[counter] == compareArray[counter])
            {   
                ties++;
            }
        }       
        System.out.println("Array 1 has "+array1Counter+" highs");
        System.out.println("Array 2 has "+array2Counter+" highs");
        System.out.println("There are "+ties+ " ties ");
        System.out.println();
    }    
}