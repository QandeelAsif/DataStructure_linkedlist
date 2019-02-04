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
public class list {
      nodeclass head;
    Node tail;
    Node temp;
   
//    public void insert(int data){
//     Node n= new Node(data);   
//     if(head==null){
//         head=tail= n;
//         System.out.println(data);
//     }
//     else{
//         tail.next=n;
//         tail=n;
//        // System.out.println(data);
//     }
//    }
   
    
   public void orderinsertion(int d){
     Node n =new Node(d);  
      Node temp=head;
      if(head== null || head.data>=d){
          n.next=head;
          head=n;
      }
      else{
          while(temp.next!=null && temp.next.data<d){
              temp=temp.next;
          }
          n.next=temp.next;
          temp.next=n;
          }
   }}
