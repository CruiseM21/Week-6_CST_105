/*
 * Program: Prime Palidrome Numbers Program
 * File: PrimePalidromeNumbers.java
 * Summary: Loops through 100,000 positive numbers to see if they are prime and
 *          palidromic.
 * Author: Vincent Christaldi
 * Date: 12/19/2017
*/
package prime.palidrome.numbers;

import java.util.ArrayList;

public class PrimePalidromeNumbers
{
    //boolean flags
    static boolean palin;
    static boolean prime;
    
    
    public static void main(String[] args)
    {
        //array list to hold all values that match criteria
        ArrayList<Integer> Matches = new ArrayList<>();
        
        for(int value = 0; value <= 100000; ++value)
        {
            //check if number is prime
            prime = CheckPrime(value);
            
            //if number is a prime check for palindrome
            if(prime == true)
            {
                palin = CheckPalindrome(value);
                //if number is also palindrome add to list
                if(palin == true)
                {
                    Matches.add(value);
                }
            }
        }
        
     //display all numbers that meet prime/palindrome criteria   
     for(int c = 0; c < Matches.size();++c)
     {
         System.out.println(Matches.get(c));
     }
    }
    
    //method to check for palindrome
    public static boolean CheckPalindrome(int checkNum)
    {
        //set temporary variables for formula
        int flip = 0;               //reversed number
        int startValue = checkNum;  //store start value for comparison
        while(checkNum > 0)
        {
            int temp = checkNum % 10; //separate number
            flip = flip * 10 + temp;  //rebuild reversed number
            checkNum /= 10;           //prep for next number to continue reverse
        }
        if(flip == startValue)
            palin = true;
        else
            palin = false;
              
        return palin;
    }
    
    //method to check if prime
    public static boolean CheckPrime(int checkNum)
    {
        int count = 0;//used to count if number is prime or not
        for(int check = 1; check <= checkNum;++check)
        {
            //check what number is divisible by
            if(checkNum % check == 0)
            {
                ++count;
            }
            //if count is 2 then number is prime
            if(count ==2)
            {
                prime = true;
            }
            //if count is not 2 then number is not prime
            else                
            {
                prime = false;
            }
        }
            
            
        return prime;
    }
}
