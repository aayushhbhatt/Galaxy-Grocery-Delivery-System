package classes;
import java.util.Scanner;
import java.lang.NullPointerException;
/**
 *
 * @author Kumpal
 */

public abstract class Customer{
    private String username;
    private String location;
    protected String role;
    
    public Customer(String username, String location){
        username = this.username;
        location = this.location;
    }
    public abstract void setPassword(String p);
    public abstract String getPassword();
    public abstract void upgrade(Update c);
    public abstract void downgrade(Update c);
    public abstract void setRole();
    
    public String getRole(){
        //EFFECTS: Returns role
        return role;
    }
    
     public String getLocation(){
        //EFFECTS: Returns location
        return location;
    }
     
    public String getUser(){
        //EFFECTS: Returns location
        return username;
    }
    
    public void setUser(String user){
       
        username = user;
    }
    
    public void setLocation(String loc){
        //MODIFIES: location
        //EFFECTS: Returns location 
        
        location = loc;
        }
}



