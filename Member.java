/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Kumpal
 */

public class Member extends Customer {
    private String password;
    public Member(String user, String loc, String pass){
        super(user, loc);
        password = pass;
        setRole();
    }
    
    @Override
    public void upgrade(Update u){
        System.out.println("Error, Member cannot be upgraded further.");
    }
    
    @Override
    public void downgrade(Update u){
        u.setCustomer(new NonMember("guest", "default"));
    }
    
    @Override
    public String getPassword(){
        //EFFECTS: Returns password
        return this.password;
    }
    
    @Override
    public void setPassword(String p){
        password = p;
    }
    
    @Override
    public void setRole(){
        super.role = "Member";
    }
    
    public double setDiscount(double d){
        //H to think about this, uses/includes, import prices
        return d;
    }
}
