/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Kumpal
 */
public class Debit implements Checkout {
    
String fullname;
int cardnumber;
int pin;

@Override
 public void pay(){
             System.out.println("\nEnter your full name as it appears on your card:");                                                                       
                                
    
    String f;
     Scanner in = new Scanner(System.in);
     f = in.nextLine();
     fullname = f;
     
    

    System.out.println("\nEnter your 12 Digit Card Number here :");
                               
                              
    
       int cd;
          Scanner n = new Scanner(System.in);
            cd =n.nextInt();
            cardnumber =  cd;
             
    

    System.out.println("\nEnter your 3-Digit Security PIN to finish payment:");
                                
        int pn;
        
          Scanner i = new Scanner(System.in);
            pn = i.nextInt();
            pin = pn;
            
            System.out.println("\nyour payment was succesful");  
                            
    }
}

