/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Kumpal
 */

public class GalaxyPay implements Checkout  {
   
double gc;

ShoppingCart sc = new ShoppingCart();
String i = null;
String p= null;
String c= null;
        
      

 public double ReadGalaxyCash(String i, String p, String c){
     
        BufferedReader in;
        String read; 
        double galaxycash = 0;
        try {
            in = new BufferedReader(new FileReader("members.txt"));
            while ((read = in.readLine()) != null){
                
              String[] arr = read.split(" ");
                   for( String n : arr)
                   {
                        if (arr[0].equals(i)){
                       galaxycash = Double.parseDouble(arr[2]); 
                        return galaxycash;
                            
                    }
                      
                   }
                
                } 
          
            in.close();
        }
        catch (IOException e) {
        System.out.println("An error occured when reading from: " + e);
                              }
       
       return galaxycash;         
    }
 


    public void Pay(double fp) throws FileNotFoundException, IOException{
        double newgalaxycash ;
        
        Scanner console = new Scanner(System.in);
        System.out.print("Enter username again: ");
        String itemID = console.nextLine();
        
        File originalFile = new File("members.txt");
        BufferedReader br = new BufferedReader(new FileReader(originalFile));

        File tempFile = new File("tempmembers.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

        String line ;
        String [] members ;
        
        while ((line = br.readLine()) != null) {
            members = line.split(" ");
            if (line.contains(itemID)) {
                String strCurrentgalaxycash = line.substring(line.lastIndexOf(" "), line.length());
                if (strCurrentgalaxycash != null || !strCurrentgalaxycash.trim().isEmpty()) {
                    
                    gc = ReadGalaxyCash(itemID,p,c);
                    System.out.println(gc);
                    System.out.println(fp);
                    newgalaxycash = gc - fp;
                    double newGalaxyCash = newgalaxycash;
                    System.out.println("Updated Price :  $ " + newGalaxyCash);
                    line = members[0]+" "+members[1]+" "+ newgalaxycash;
                    
                }

            }
            
            pw.println(line);
            pw.flush();
        }
        pw.close();
        br.close();

        // Delete the original file
        if (!originalFile.delete()) {
            System.out.println("Could not delete file");
            return;
        }

        // Rename the new file to the filename the original file had.
        if (!tempFile.renameTo(originalFile))
            System.out.println("Could not rename file");
        
    
    }

    @Override
    public void pay() {
      
    }

  

  
      
    
 
}                    





