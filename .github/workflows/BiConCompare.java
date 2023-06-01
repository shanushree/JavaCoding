//Program to demonstrate usage of BiConsumer.
//Biconsumer accepts two arguments and returns nothing
//Program to compare two list


import java.util.*;
import java.util.function.*;
public class BiConCompare {
	
	public static void main(String args[]) {
	List<Integer> oi1=new ArrayList<>();
	
	oi1.add(1);
	oi1.add(2);
	oi1.add(3);
	
	List<Integer> oi2=new ArrayList<>();
	oi2.add(3);
	oi2.add(2);
	oi2.add(1);
	
	
	BiConsumer<List<Integer>,List<Integer>> b= (a1,b1)->{
		System.out.println("I am in consumer");
		if(a1.size()!=b1.size()) System.out.println("False");
		else
		{
			for(int i=0;i<a1.size();i++) {
				if(a1.get(i)!=b1.get(i)) {
          System.out.println("False"); 
          return;
        }
			}
			System.out.println("It was a success");		
		}
	};
	b.accept(oi1, oi2);
	}
}
