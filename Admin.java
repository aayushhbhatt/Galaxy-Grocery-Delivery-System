/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kumpal
 */
public class Admin {
    private String password;
    private String username;
    protected String role;
    MilkItem item;
     
    public Admin(String password, String username /*String role*/){
        //EFFECTS: returns new Admin
        password = this.password;
        username = this.username;
        /*role = "admin";*/
    }
    
    /*public String getRole(){
        //EFFECTS: Returns role
        return role;
    }*/
    
    public void setPassword(String password){
        //MODIFIES: password
        //EFFECTS: Returns password
        password = this.password;
    }
    
    public String getPassword(){
        //EFFECTS: Returns password
        return password;
    }
    
    public void setUsername(String username){
        //MODIFIES: username
        //EFFECTS: Returns username
        username = this.username;
    }
    
    public String getUsername(){
        //EFFECTS: Returns username
        return username;
    }
    
    
    
    public void priceUpdate() throws IOException, NumberFormatException{
        //EFFECTS: updates prices of Items
        //MODIFIES: Item price
        //updatePrice();
        
        
        double replenish;

        Scanner console = new Scanner(System.in);
        System.out.print("Please Enter Item code: ");
        String a = console.nextLine();
        while(!((a.equalsIgnoreCase("S"))||(a.equalsIgnoreCase("O")) ||(a.equalsIgnoreCase("L")) ||(a.equalsIgnoreCase("C"))||(a.equalsIgnoreCase("Y")))){
        if (!((a.equalsIgnoreCase("S"))||(a.equalsIgnoreCase("O")) ||(a.equalsIgnoreCase("L")) ||(a.equalsIgnoreCase("C"))||(a.equalsIgnoreCase("Y")))){
            System.out.print("Error! Incorrect item code entered, please try again: ");
            a = console.nextLine();
        }
        }
        String itemID = a;
        System.out.print("Enter new Price: ");
        String rep = console.nextLine();
        do{
        try{
            Double.parseDouble(rep);
        }
        catch(NumberFormatException e){
            }
            System.out.println("\nError, incorrect format entered!!");
            System.out.println("Please re-enter the price:");
            rep = console.nextLine();
        
        }while (false);
        replenish = Double.parseDouble(rep);
            File originalFile = new File("items.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(originalFile));

        // Construct the new file that will later be renamed to the original
        // filename.
        File tempFile = new File("tempitems.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

        String line = null;
        String [] items = null;
        // Read from the original file and write to the new
        // unless content matches data to be removed.
        while ((line = br.readLine()) != null) {
            items = line.split(";");
            if (line.contains(itemID)) {
                String strCurrentPrice = line.substring(line.lastIndexOf(""), line.length());
                if (strCurrentPrice != null || !strCurrentPrice.trim().isEmpty()) {
                    double replenishedPrice = replenish;
                    System.out.println("Updated Price :  $ " + replenishedPrice);
                    line = items[0]+";"+ replenish;
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
    }


    