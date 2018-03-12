/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author hmallah
 */
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Iterator;

/**
 *
 * @author Kumpal
 */
public class UserInterface{
    private static String commands;
    private static int commandInt;
    private static double commandDouble;
    private static String total;
    
   ShoppingCart sc = new ShoppingCart();  

      
    private static String uInput(){
        //MODIFIES: commands
        //EFFECTS: commands set to user input and returned
        Scanner input = new Scanner(System.in);
        commands = input.next();
        return commands;
    }
    
    private static int uInputInt(){
        //MODIFIES: commandInt
        //EFFECTS: commandInt set to user input and returned
        Scanner input = new Scanner(System.in);
        commandInt = input.nextInt();
        return commandInt;
    }
    
    private static double uInputDouble(){
        //MODIFIES: commandDouble
        //EFFECTS: commandDouble set to user input and returned
        Scanner input = new Scanner(System.in);
        commandDouble = input.nextDouble();
        return commandDouble;
    }
    
    
    public static double readPrice(String i, String p) throws IOException{
     
        BufferedReader in;
        String read;
        double q=0;
        double price = 0;
        
        try {
            in = new BufferedReader(new FileReader("items.txt"));
            while ((read = in.readLine()) != null){
                
              String[] arr = read.split(";");
                   for( String n : arr){
                        if (arr[0].equals(i)){
                        price = Double.parseDouble(arr[1]); 
                         return price;
                            
                    }
                   }
            } 
        
            in.close();
    }
        catch (IOException e) {
        System.out.println("An error occured when reading from: " + e);
    }
        
   return price;     
            
    }
    

    public static String read(String n, String p) throws IOException{
        //REQUIRES: non-null Strings n and p
        //EFFECTS: Reads user input from file concerning specs of new Customer and creates Customer accordingly. Catches IOException throughout reading. Returns newly created Customer.
       
        
       
        BufferedReader in;
        String read;
        try {
            in = new BufferedReader(new FileReader("members.txt"));
            while ((read = in.readLine()) != null){
                String [] arr = read.split(" ");
                if (arr[0].equals(n)){
     
                    return n;
                }
            }       
            in.close();
    }
        catch (IOException e) {
        System.out.println("An error occured when reading from: " + e);
    }
        return n;
    }

    
     
public boolean confirm(String n, String p, String role){
        //REQUIRES: Non-null Strings n,p and role
        //EFFECTS: Reads user input from text file, and confirms whether selected user is in the system as either Customer, Manager, or neither, in which case an error message is printed. Displays respective options for User type after confirmation, otherwise displays error message.
        BufferedReader in;
        String read = null;
        try {
            in = new BufferedReader(new FileReader("members.txt"));
            while((read = in.readLine()) != null){
                String[] arr = read.split(" ");
                if (arr[0].equals(n)){
                    if (arr[1].equals(p)){
                 
                        
                    return true;
                    }
                }
            }
            System.out.println("File output: " + read);
        } catch (IOException i){
            System.out.println("An error occured when reading from: " + i);
        }
        System.out.println("ERROR: User not found!\n");
        return false;
    }

public static boolean find(String n){
        //REQUIRES: non-null String n
        //EFFECTS: Reads user input from text file and checks whether user with given name was inputed. Returns true if found, false otherwise.  
        BufferedReader in;
        String read;
        try{
            in = new BufferedReader(new FileReader("members.txt"));
            while ((read = in.readLine()) != null){
                String[] arr = read.split(" ");
                if(arr[0].equals(n)){
                    return true;
                }
            }
            in.close();
            return false;
        }catch (IOException i){
            System.out.println("An error occured when reading from: " + i);
            return false;
        }
    }
 public static void write(Customer x) throws IOException, FileNotFoundException{
        //REQUIRES: non-null User
        //MODIFIES: File f
        //EFFECTS: Checks if username is not in use. If not, creates new textfile and writes User username, password and role to file. If User is customer, checks whether user has Chequing only or Chequing and Savings and writes to file accordingly. Catchs IOException if necessary throught trial.
        BufferedWriter out;
        if (!find(x.getUser())){
            try {
                out = new BufferedWriter(new FileWriter("members.txt", true));
                out.write(x.getUser() + " ");
                out.write(x.getPassword() + " ");
                if (x.getRole().equals("Member")){
                    Customer y = (Customer) x;
                }
                System.out.println("\nThank you for registering!");
                out.close();
            } catch (IOException i){
                System.out.println("An error occured when writing to: " + i);
            }
        }
        else {
            System.out.println("\nSuch a username is already in use.");
        }
    }
     
 public static void delete(String n) throws IOException, FileNotFoundException{
        //REQUIRES: non-null String n
        //MODIFIES: File f
        //EFFECTS: Reads file containing user input and continues so long as n exists in file. Writes contents to temporary file excluding String to be deleted. Once complete, reads temporary file and writes it to input file, essentially deleting desired String with new update.
        File inputF = new File("members.txt");
        File tempF = new File("temp.txt");
        BufferedReader r = new BufferedReader(new FileReader(inputF));
        BufferedWriter w = new BufferedWriter(new FileWriter(tempF));
        String current;
        while((current = r.readLine()) != null){
            if (current.contains(n)){
                continue;
            }
            w.write(current);
            w.newLine();
        }
        w.close();
        r.close();
        
        r = new BufferedReader(new FileReader(tempF));
        w = new BufferedWriter(new FileWriter(inputF));
        while ((current = r.readLine()) != null){
            w.write(current);
            w.newLine();
        }
        w.close();
        r.close();
        System.out.println("You have successfully deregistered.");
    }


  
    public static void main(String[] args) throws IOException {
        System.out.println("**************************************************\n           'WELCOME TO GALAXY INSTACART' \n"); 
        System.out.println("           On your doorstep in an hour  \n***************************************************"); 
        System.out.println("           PROJECT BY : Aayush Bhatt, Hussein Mallah and Kumpal Madhiwala ");
        System.out.println("                        500509970     500573853          500604199");
        String n = null;
        String p=null, inp, l = null, add, item = null,pri = null,fp=null,i=null,ps=null;
        UserInterface Galaxy = new UserInterface();
        int m1, m2, m3, m4, m5, p1;//going to need as manyy as possible items
        double q=0,t = 0;
        double price=0,finprice=0;
        Update u;
        double amt = 0, tst;
        int totalitems = 0;
        String strr;
        Customer c;
        NonMember non;
        Member m;
           Admin a = new Admin(n,p);
        MilkItem mlk = new MilkItem(item,price,q);
        
       ShoppingCart sc = new ShoppingCart();  
     
        
    while (true){
            System.out.println("\n\n\n>>>>>  Press 'A' if you are admin");
             System.out.println(">>>>>  Press 'C' if you are customer.");
            inp = uInput();
    if (!((inp.equalsIgnoreCase("A"))||(inp.equalsIgnoreCase("C")) ||(inp.equalsIgnoreCase("E")) )){
                System.out.println("\nInvalid input !!!");
            }
    else if (inp.equalsIgnoreCase("A")){
                System.out.println("\nPlease enter your Username:");
                   n = uInput();
                 System.out.println("\nPlease enter your password:");
                    p = uInput();
                    if(n.equalsIgnoreCase("admin")&&(p.equalsIgnoreCase("123"))){
                        System.out.println("\n  >>>>> Press 'U' to update Item prices ");
                         System.out.println( "  >>>>> Press 'L', to logout");
                        inp = uInput();
                        while(!inp.equalsIgnoreCase("l")){
                            if(inp.equalsIgnoreCase("u")){
                            System.out.println("Please update any of the prices:");
                            System.out.println("The following are the itemcodes for specific items:");
                            System.out.println(" >> Press 'S' for skim(low-fat)");
                            System.out.println("  >> Press 'O' for organic");
                            System.out.println("   >> Press 'L' for lactose-free");
                            System.out.println("    >> Press 'C' for chocolate");
                            System.out.println("     >> Press 'Y' for soy");
                            a.priceUpdate();
                            System.out.println("\n       >>>>> Press 'U' to continue updating all the prices ");
                            System.out.println( "          >>>>> Press 'L', to logout");
                                inp = uInput(); 
                                                         }
                            else{
                              System.out.println("please enter again");
                                inp = uInput();
                                }
                            }
                        }
                    else{
                        System.out.println("\nError, user input incorrect. Please try again.");
                    }
                     }
    
    
                        
                    
            else if (inp.equalsIgnoreCase("C")){
                System.out.println("\n\n  >>>>> press 'M' if you are already a member");
                System.out.println("  >>>>> press 'G' to continue as a guest");
                inp = uInput();
                if (!((inp.equalsIgnoreCase("M")) || (inp.equalsIgnoreCase("G")))){
                    System.out.println(" Error : Please specify the customer type to proceed");
                    
                }
                else if(inp.equalsIgnoreCase("M")){
                    
                    System.out.println("\nEnter your Username:");
                    n = uInput();
                    //are we going to check if he is a member???
                    System.out.println("\nEnter your Password:");
                    p = uInput();
                    if (Galaxy.confirm(n,p, "Member")){
                                
                                System.out.println("\n Our services only cover Toronto, Hamilton, Brampton or Missisauga");
                                System.out.println(">>> Press 'T' for Toronto");
                                System.out.println("  >>> Press 'B' for Brampton");
                                System.out.println("    >>> Press 'H' for Hamilton");
                                System.out.println("      >>> Press 'M' for Missisauga");
                        
                                l = uInput();
                                if(l.equalsIgnoreCase("t")){
                                    t=1;
                                }
                                else if(l.equalsIgnoreCase("h")){
                                    t=2.5;
                                }
                                else  if(l.equalsIgnoreCase("m")){
                                    t=1.5;
                                }
                                else if(l.equalsIgnoreCase("b")){
                                    t=1.25;
                                }
                        
   while(!((l.equalsIgnoreCase("T"))||(l.equalsIgnoreCase("H"))||(l.equalsIgnoreCase("B"))||(l.equalsIgnoreCase("M") ) ))
   {
                System.out.println("\n\n Sorry, our services are available only in Toronto, Hamilton, Brampton or Missisauga");
                          System.out.println("Please enter a valid region, thank you");
                            l = uInput();
                        }
                        m = new Member(n, l, p);
                        System.out.println("\n\n>>>>> Press 'PUR' for purchase of grocery item");
                        System.out.println("  >>>>> Press 'PCD' to proceed to you shopping cart");
                        System.out.println("    >>>>> Press 'UP' to upgrade your account"); 
                        System.out.println("      >>>>> Press 'DOWN' to downgrade your account");
                        System.out.println("        >>>>> Press 'L' to logout");
                        inp = uInput();
                     
                    while(!inp.equalsIgnoreCase("L")){
                      
                        if (inp.equalsIgnoreCase("PUR")){
                         
                           
                            System.out.println("\n\nThe available MilkItems are ");
                            System.out.println(" >> Press 'S' for skim(low-fat)");
                            System.out.println("  >> Press 'O' for organic");
                            System.out.println("   >> Press 'L' for lactose-free");
                            System.out.println("    >> Press 'C' for chocolate");
                            System.out.println("     >> Press 'Y' for soy");     
                            System.out.println("      >> Press 'F' while you have finished choosing items"); 
                            inp = uInput();
                            
             while(!(inp.equalsIgnoreCase("F"))){
          
                            
                               
      if(!((inp.equalsIgnoreCase("S"))||(inp.equalsIgnoreCase("O"))||(inp.equalsIgnoreCase("L"))||(inp.equalsIgnoreCase("C"))||(inp.equalsIgnoreCase("Y"))||(inp.equalsIgnoreCase("F")))){
                                    System.out.println("\nUnavailable item requested");
                                    inp = uInput();
                                    }
                               
                             
                 else if((inp.equalsIgnoreCase("s"))||(inp.equalsIgnoreCase("o"))||(inp.equalsIgnoreCase("l"))||(inp.equalsIgnoreCase("c"))||(inp.equalsIgnoreCase("y")))
                                        {
                                          
                                         item = inp;
                                            mlk.setItem(item);
                                            System.out.println("Please enter the required quantity: ");
                                            q = uInputDouble(); 
                                            mlk.setQuantity(q);
                                            price = UserInterface.readPrice(item,pri);
                                            mlk.setPrice(price);
                                            mlk.getTotal();
                                            sc.add(mlk);
                                            strr = mlk.toString();
                                            System.out.println(strr);
                                            finprice = sc.getfinalprice();
                                            
                                            
                                     System.out.println("\n\nThe available MilkItems are ");
                                     System.out.println(" >> Press 'S' for skim(low-fat)");
                                    System.out.println("  >> Press 'O' for organic");
                                   System.out.println("   >> Press 'L' for lactose-free");
                                 System.out.println("    >> Press 'C' for chocolate");
                               System.out.println("     >> Press 'Y' for soy");   
                            System.out.println("      >> Press 'F' while you have finished choosing items"); 
                          inp = uInput();
                            
                                        
                                         
                                             
                                    }
                  
                            }
             
             
                        }
                      
         
                            else if (inp.equalsIgnoreCase("PCD")){        
                               
                           totalitems = sc.getTotalItems();
                            System.out.println("\n you have selected " + totalitems + " items");
                           
                            System.out.println("\nyour e-bill is as follows : \n"); 
                      
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("                                                     $ "+finprice);
                                 
                                
                                System.out.println("\n\n\n\n\nPlease Choose your preferred method of Payement:");
                                System.out.println("  >>>>> Press 'CC' to pay by creditcard");
                                System.out.println("     >>>>> Press 'DC' to pay by debitcard");
                                System.out.println("        >>>>> Press 'CD' for cash on delivery");
                                System.out.println("           >>>>> Press 'GP' to pay with Galaxy pay");
                                System.out.println("              >>>>> Press 'GB' to go back to main menu");
                               
                                inp = uInput();
                                
                      if(inp.equalsIgnoreCase("GP")){
                                    GalaxyPay gp = new GalaxyPay();
                                   double galc = gp.ReadGalaxyCash(i,ps,fp);
                                    System.out.println("you have $ "+ galc + " as you galaxy cash");
                                    gp.Pay(finprice);         
                            System.out.println("\nyou have selected Galaxycash for your payment method ");
                                    gp.ReadGalaxyCash(i,ps,fp);
                             System.out.println("\nEnter Address for the delivery of the selected items");          
                            System.out.println("Please Use ', : - * + # etc' instead of a space between the strings");
                            add = uInput();
                            System.out.println("\nyour Grocery Items will be delivered at "+ add );
                             System.out.println("\nEstimated time for your delivery is "+ t + " hours");
                            System.out.println("\n\n\n\n\n                            ******Thank you for choosing GALAXY INSTACART");
                            System.out.println("                            We look forward to serve you in future******");
                            System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                                        return;
                                    
                                }
                            if (inp.equalsIgnoreCase("CC")) 
                                   {
                                
                                Credit ct = new Credit();
                                   ct.pay();
                                
                              
                            System.out.println("\nEnter Address for the delivery of the selected items");          
                            System.out.println("Please Use ', : - * + # etc ' instead of a space between the strings");
                        add = uInput();
                            System.out.println("\nyour Grocery Items will be delivered at "+ add );
                             System.out.println("\nEstimated time for your delivery is "+ t+ " hours");
                             System.out.println("\n\n\n\n\n                          ******Thank you for choosing GALAXY INSTACART");
                            System.out.println("                                 We look forward to serve you in future******");
                            System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                               return;
                                }
                               else if (inp.equalsIgnoreCase("DC")) 
                                   {
                                
                                Debit dt = new Debit();
                                   dt.pay();
                                
                              
                            System.out.println("\nEnter Address for the delivery of the selected items");          
                            System.out.println("Please Use ', : - * + # etc ' instead of a space between the strings");
                        add = uInput();
                            System.out.println("\nyour Grocery Items will be delivered at "+ add );
                             System.out.println("\nEstimated time for your delivery is "+ t+ " hours");
                             System.out.println("\n\n\n\n\n                          ******Thank you for choosing GALAXY INSTACART");
                            System.out.println("                                 We look forward to serve you in future******");
                            System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                               return;
                                }
                                else if(inp.equalsIgnoreCase("CD")){
                                    
                            System.out.println("\nyou have selected cash on delivery");
                             System.out.println("\nEnter Address for the delivery of the selected items");          
                            System.out.println("Please Use ', : - * + # etc' instead of a space between the strings");
                            add = uInput();
                            System.out.println("\nyour Grocery Items will be delivered at "+ add );
                             System.out.println("\nEstimated time for your delivery is "+ t + " hours");
                            System.out.println("\n\n\n\n\n                            ******Thank you for choosing GALAXY INSTACART");
                            System.out.println("                            We look forward to serve you in future******");
                            System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                                        return;
                                    }
                                else{
                                    break;
                                }
                            }
                      
                              else if (inp.equalsIgnoreCase("UP"))
                              {
                                u = new Update(m);
                                m.upgrade(u);
                            }
                            else if (inp.equalsIgnoreCase("DOWN"))
                            {
                                u = new Update(m);
                                m.downgrade(u);
                                c = u.getCustomer();
                                delete(n);
                                break;
                            }
                        
                            else {
                                System.out.println("\nError, incorrect command entered.");
                              }
                        
                        
                       System.out.println(">>>>> Press 'PUR' for purchase of another grocery item");
                        System.out.println("  >>>>> Press 'PCD' to proceed to you shopping cart");
                        System.out.println("    >>>>> Press 'UP' to upgrade your account"); 
                        System.out.println("      >>>>> Press 'DOWN' to downgrade your account");
                        System.out.println("        >>>>> Press 'L' to logout");
                       
                        inp = uInput();
                        
                    } 
                    
                    System.out.print("\n");
                
                }
                }
                
                else if(inp.equalsIgnoreCase("G")){
                    System.out.println("\nWelcome Guest");
                       System.out.println("\nOur services only cover Toronto, Hamilton, Brampton or Missisauga");
                                System.out.println(">>> Press 'T' for Toronto");
                                System.out.println("  >>> Press 'B' for Brampton");
                                System.out.println("   >>> Press 'H' for Hamilton");
                                System.out.println("     >>> Press 'M' for Missisauga");
                        
                                l = uInput();
                                    if(l.equalsIgnoreCase("t")){
                                    t=1;
                                }
                                else if(l.equalsIgnoreCase("h")){
                                    t=2.5;
                                }
                                else  if(l.equalsIgnoreCase("m")){
                                    t=1.5;
                                }
                                else if(l.equalsIgnoreCase("b")){
                                    t=1.25;
                                }
                        
                        
   while(!((l.equalsIgnoreCase("T"))||(l.equalsIgnoreCase("H"))||(l.equalsIgnoreCase("B"))||(l.equalsIgnoreCase("M") ) ))
   {
                System.out.println("\n Our services are available only in Toronto, Hamilton, Brampton or Missisauga");
                          System.out.println("Please enter a valid region, thank you");
                            l = uInput();
                        }
                      
                
                    non = new NonMember("guest", l);
                        System.out.println(">>>>> Press 'PUR' for purchase of grocery item");
                        System.out.println("  >>>>> Press 'PCD' to proceed to you shopping cart");
                        System.out.println("    >>>>> Press 'UP' to upgrade your account"); 
                        System.out.println("      >>>>> Press 'DOWN' to downgrade your account");
                        System.out.println("        >>>>> Press 'L' to logout");
                         
                    inp = uInput();
                    while(!inp.equalsIgnoreCase("L")){
                        if (inp.equalsIgnoreCase("PUR")){
                            System.out.println("\n\nThe available MilkItems are ");
                            System.out.println(" >> Press 'S' for skim(low-fat)");
                            System.out.println("  >> Press 'O' for organic");
                            System.out.println("   >> Press 'L' for lactose-free");
                            System.out.println("    >> Press 'C' for chocolate");
                            System.out.println("     >> Press 'Y' for soy");     
                            System.out.println("      >> Press 'F' while you have finished choosing items"); 
                                
                            inp = uInput();
                            while(!inp.equalsIgnoreCase("F")){
                                if(!((inp.equalsIgnoreCase("s"))||(inp.equalsIgnoreCase("o"))||(inp.equalsIgnoreCase("l"))||(inp.equalsIgnoreCase("c"))||(inp.equalsIgnoreCase("y"))||(inp.equalsIgnoreCase("f")))){
                                    System.out.println("\nError, incorrect command entered.");
                                    inp = uInput();
                                    }
                                else if((inp.equalsIgnoreCase("s"))||(inp.equalsIgnoreCase("o"))||(inp.equalsIgnoreCase("l"))||(inp.equalsIgnoreCase("c"))||(inp.equalsIgnoreCase("y")))
                                        {
                                          
                                                  
                                            item = inp;
                                            mlk.setItem(item);
                                            System.out.println("Please enter the required quantity: ");
                                            q = uInputDouble(); 
                                            mlk.setQuantity(q);
                                            price = UserInterface.readPrice(item,pri);
                                            mlk.setPrice(price);
                                            mlk.getTotal();
                                            sc.add(mlk);
                                            strr = mlk.toString();
                                            System.out.println(strr);
                                            finprice = sc.getfinalprice();
                                                     
                                     System.out.println("\n\nThe available MilkItems are ");
                                     System.out.println(" >> Press 'S' for skim(low-fat)");
                                    System.out.println("  >> Press 'O' for organic");
                                   System.out.println("   >> Press 'L' for lactose-free");
                                 System.out.println("    >> Press 'C' for chocolate");
                               System.out.println("     >> Press 'Y' for soy");   
                            System.out.println("      >> Press 'F' while you have finished choosing items"); 
                          inp = uInput();
                             
                                    }
                                }
                            }
                        
                            else if (inp.equalsIgnoreCase("PCD")){
                                 
                            totalitems = sc.getTotalItems();
                            System.out.println("\n you have selected " + totalitems + " items");
                           
                            System.out.println("\nyour e-bill is as follows : \n"); 
                      
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("                                                     $ "+finprice);


           

                                
                                System.out.println("\n\nChoose your preferred method of Payement:");
                                System.out.println("  >>>>> Press 'CC' to pay by creditcard");
                                System.out.println("     >>>>> Press 'DC' to pay by debitcard");
                                System.out.println("        >>>>> Press 'CD' for cash on delivery");
                                System.out.println("           >>>>> Press 'GB' to go back to main menu");
                                
                                
                                inp = uInput();
                               
                                  
                              if (inp.equalsIgnoreCase("CC")) 
                                   {
                                
                                Credit ct = new Credit();
                                   ct.pay();
                                
                              
                            System.out.println("\nEnter Address for the delivery of the selected items");          
                            System.out.println("Please Use ', : - * + # etc ' instead of a space between the strings");
                        add = uInput();
                            System.out.println("\nyour Grocery Items will be delivered at "+ add );
                             System.out.println("\nEstimated time for your delivery is "+ t+ " hours");
                             System.out.println("\n\n\n\n\n                          ******Thank you for choosing GALAXY INSTACART");
                            System.out.println("                                 We look forward to serve you in future******");
                            System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                               return;
                                }
                                if (inp.equalsIgnoreCase("DC")) 
                                   {
                                
                                Debit dt = new Debit();
                                   dt.pay();
                                
                              
                            System.out.println("\nEnter Address for the delivery of the selected items");          
                            System.out.println("Please Use ', : - * + # etc ' instead of a space between the strings");
                        add = uInput();
                            System.out.println("\nyour Grocery Items will be delivered at "+ add );
                             System.out.println("\nEstimated time for your delivery is "+ t+ " hours");
                             System.out.println("\n\n\n\n\n                          ******Thank you for choosing GALAXY INSTACART");
                            System.out.println("                                 We look forward to serve you in future******");
                            System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                               return;
                                }
                                else if(inp.equalsIgnoreCase("CD")){
                                    
                            System.out.println("\nyou have selected cash on delivery");
                             System.out.println("\nEnter Address for the delivery of the selected items");          
                            System.out.println("Please Use ', : - * + # etc' instead of a space between the strings");
                            add = uInput();
                            System.out.println("\nyour Grocery Items will be delivered at "+ add );
                             System.out.println("\nEstimated time for your delivery is "+ t + " hours");
                            System.out.println("\n\n\n\n\n                            ******Thank you for choosing GALAXY INSTACART");
                            System.out.println("                            We look forward to serve you in future******");
                            System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                                        return;
                                    }
                                else{
                                    break;
                                }
                            }
                               else if (inp.equalsIgnoreCase("UP")){
                                u = new Update(non);        
                                non.upgrade(u);
                                c = u.getCustomer();
                                System.out.println("\nPlease enter your desired Username:");
                                n = uInput();
                                System.out.println("\nPlease enter your desired Password:");
                                p = uInput();
                               c.setLocation(l);
                                c.setUser(n);
                                c.setPassword(p);
                                write(c);
                                break;
                            }
                            else if (inp.equalsIgnoreCase("DOWN")){
                                u = new Update(non);        
                                non.downgrade(u);
                            }
                  else  {
                        System.out.println("\nError, incorrect command entered.");
                        }
                         
                        System.out.println(">>>>> Press 'PUR' for purchase of another grocery item");
                        System.out.println("  >>>>> Press 'PCD' to proceed to you shopping cart");
                        System.out.println("    >>>>> Press 'UP' to upgrade your account"); 
                        System.out.println("      >>>>> Press 'DOWN' to downgrade your account");
                        System.out.println("        >>>>> Press 'L' to logout");
                         
                        inp = uInput();
                    }
                    System.out.print("\n");
                             
                  }  
            }
            
                
    
             if(inp.equalsIgnoreCase("E")){
                 System.out.println("Thank you for visiting GALAXY INSTACART");
                 System.out.println(" \n\n                                                                  GALAXY INSTACART Limited © 2015"); 
                break;
              }
            
             
           
          
         
    }
    }
}


    
    




