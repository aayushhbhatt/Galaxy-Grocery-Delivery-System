/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//change this with regards to password
package classes;

/**
 *
 * @author Kumpal
 */
public class NonMember extends Customer {
    
    public NonMember(String user, String loc){
        super("guest", loc);
        setRole();
    }
    
    @Override
    public void upgrade(Update u){
        u.setCustomer(new Member("default", "default", "default"));
    }
    
    @Override
    public void setPassword(String password){
        password = null;
    }
    
    
    @Override
    public String getPassword(){
        return null;
    }
    
    @Override
    public void downgrade(Update u){
        System.out.println("Error, NonMember cannot be downgraded further.");
    }
    
    @Override
    public void setRole(){
        super.role = "NonMember";
    }
}