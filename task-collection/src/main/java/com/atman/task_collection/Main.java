package com.atman.task_collection;
import java.util.Scanner;

//import com.atman.task_collection.List;

public class Main {

	public static void main(String[] args) {
		 List <Integer> list = new List<Integer>();
		    list.add(11);
	        list.add(22);
	        list.add(33);
	        list.add(44);
	        list.add(55);
	        list.add(66);
	        list.add(77);
	        list.add(88);
	        list.add(99);
	        list.add(100);
	        
	        System.out.println(list);	       
	        System.out.print("Enter a number: ");
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        list.add(n);
	        
	        System.out.println("Size of list: "+list.size());
	        System.out.println("List after addition of new number"+list);	        	        
	        System.out.println(list);	         
	        System.out.println("Removing element at 2nd index or 3rd position");
	        
	        list.remove(2);
	        
	        System.out.println("List after removal  of element:"+list);	         
	        System.out.println("Element at 0 index: "+ list.get(0) );
	        System.out.println("Element at 1 index: " + list.get(1) );	 
	        System.out.println("Size of list is: "+list.size());
	       	System.out.println(list);
	       	sc.close();


	}

}
