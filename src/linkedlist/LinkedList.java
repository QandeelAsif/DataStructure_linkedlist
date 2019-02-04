/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Qandeel
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          list a= new list();
       // a.insert(20);
       // a.insert(45);
       // a.insert(278);
      //  a.insert(67);

          
          a.orderinsertion(23);
          a.orderinsertion(256);
          a.orderinsertion(244);
          a.orderinsertion(278);
          a.orderinsertion(90);
          a.orderinsertion(19);

        System.out.println(a);
       // System.out.println(a.find(48));
       // System.out.println(a.find(23));
          System.out.println("");     
       // a.clear();
        
        a.Reverse();
        System.out.println("new list \n" +a);
        
       a.Delete(24);
        a.Delete(23);
        a.Delete(278);
        System.out.println(a);

    }
    
}
