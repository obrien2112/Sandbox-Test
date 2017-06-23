/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Scanner;

/**
 * This is a test of Git and Github  #3 This small edit should pull down
 * @author Michael
 */
public class Sandbox {   // this is a test of the editor pulling down

    /**
     * @param args the command line arguments
     */
    
    static final int MAX_NUM = 200;
    static int counts [] = new int [MAX_NUM];
    static int number_given;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Prompt for input
        System.out.print("Enter the integers between 1 and " + MAX_NUM + " (end input with 0): ");
        
        do { 
            number_given = input.nextInt();
            counts[number_given]++;
            
        } while (number_given != 0);
        
        output(counts);
        
        
    }
    
    
    public static void output (int [] x){
        for (int counter = 1; counter < MAX_NUM; counter++)
            if (x[counter] > 1)
                System.out.println(counter + " occurs " + x[counter] + " times");
            else if (x[counter] == 1)
                System.out.println(counter + " occurs " + x[counter] + " time");
        
    }
    
}

