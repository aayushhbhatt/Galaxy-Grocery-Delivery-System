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
 
public class Update {
    Customer cus;
    public Update(Customer c){
        cus = c;
    }
    public void setCustomer(Customer s){
        cus = s;
    }
    public Customer getCustomer(){
        return cus;
    }
    public void upgrade(){
        cus.upgrade(this);
    }
    public void downgrade(){
        cus.downgrade(this);
    }
}
