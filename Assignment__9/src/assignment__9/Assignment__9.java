
package assignment__9;

import java.security.SecureRandom;
public class Assignment__9 {

   
    public static void main(String[] args) 
    {
        SecureRandom numbers = new SecureRandom();
        
        //Establish the four random numbers
        double randOne = 1 + numbers.nextInt(10);
        double randTwo = 1 + numbers.nextInt(10);
        double randThree = 1 + numbers.nextInt(10);
        double randFour = 1 + numbers.nextInt(10);
        
        double averageOfFour = average(randOne, randTwo, randThree, randFour);
        System.out.printf( "%s%f%n" , "The average of the four numbers is: " , averageOfFour );

        double averageOfThree = average(randOne, randTwo, randThree, "Finding the average of only three numbers:");
        System.out.printf( "%s%f%n" ,"The average of only the first three numbers is: " , averageOfThree );

        double min = minimum(randOne, randTwo, randThree, randFour);
        System.out.printf( "%s%f%n" , "The smallest number is: " , min );

        closingMessage(); 
    }
    //Finds average of all four randome numbers
    public static double average(double first, double second, double third, double fourth) 
    {

        System.out.printf( "%n%s%f%n", "The first number is: " , first);
        System.out.printf( "%s%f%n","The second number is: " , second);
        System.out.printf( "%s%f%n","The third number is: " , third);
        System.out.printf( "%s%f%n","The fourth number is: " , fourth);
       
        //returns the average
        return (first + second + third + fourth) / 4 ;

    }
    
    //method to find the average of only three numbers
    public static double average(double first, double second, double third, String message) 
    {
        System.out.printf( "%n%s%f%n" , "The first number is: " , first);
        System.out.printf( "%s%f%n" , "The second numberis: " , second);
        System.out.printf( "%s%f%n" , "The third number is: " , third);
        System.out.println( message );

        //Average of only the first three numbers
        return (first + second + third) / 3;
    }
    
    public static double minimum(double first, double second, double third, double fourth) 
    {
        //Breaks up finding the minimum into two parts because of how the min method works in math class
        double minOne = Math.min(first, second);
        double minTwo = Math.min(third, fourth);

        //Finds the min based off the previous math
        return Math.min(minOne, minTwo);
    }
    
    //Method that uses a switch and a random number to choose what message to display 
     public static void closingMessage() 
    {
        SecureRandom randomNumber = new SecureRandom();
        //uses a random from 1 to 4 because there are 4 goodbye cases
        int goodbye =  randomNumber.nextInt(4);

        switch (goodbye)
        {
            case 0:
                System.out.println("Have a nice day!");
                break;
            case 1:
                System.out.println("Thank you for playing! ");
                break;
            case 2:
                System.out.println("So Long Folks!");
                break;
            case 3:
                System.out.println("Goodbye Wally World!");
                break;
        }
    }
}
