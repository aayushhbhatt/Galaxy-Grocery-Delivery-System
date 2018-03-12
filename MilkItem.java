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
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Kumpal
 */
public class MilkItem{
   double quantity;
   String item;
   double price, gTotal;
   String pri=null;
   
   public MilkItem(String item,double price,double quantity){
       /* Effects : */
       price = this.price;
       item= this.item;
       quantity = this.quantity;
       
       
   }
 

      public void setItem(String i)       
    { 
        //Effects: should be overriden in the classes that use this abstarct class 
     item = i;
       
}
        
   public String getItem(){
        // Requires : a string user input inquiring the specific dairy item required
        // Modifies : Instance variable 'item'
        //Effects  : Assigns instance variable 'item' to the string user input
       return item;
   }
   
  
    

 

  public void setQuantity(double q){
        quantity = q;
   }
    
   public double getQuantity(){
       return quantity;
   }
    
   
  public void setPrice(double p){
        price = p;
   }
    
   public double getPrice(){
       return price;
   }
    
   @Override
    public String toString()
    {
        return "Itemcode of your item is : " + item + "\nQuantity required : "+quantity + "\nPrice of a litre is $ " + price +"\nPrice of "+ quantity + " items is $ "+gTotal+ "\n"; 
      
    }

    
public double getTotal(){
    
   gTotal = quantity*price;
  
    return gTotal;
}


}