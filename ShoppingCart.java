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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ShoppingCart implements Cloneable  {

   
ArrayList<MilkItem> items;
double finalprice=0;
double pr;
double itemtotal;


    public ShoppingCart(){
        items = new ArrayList<>();
        items = this.items;
        this.items = (ArrayList<MilkItem>) items.clone();
    }

public void add(MilkItem item) {
          items.add(item);
}

public int getTotalItems() {
    return items.size() ;
}


public double getfinalprice() {
 
    for (MilkItem item : items) {
        itemtotal = item.getTotal();
    }
  finalprice = itemtotal + finalprice; 
    System.out.println("total price of the selected items till now : "+finalprice);        
          return finalprice; 
}


  
      
    }



