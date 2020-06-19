import java.util.*;  
public class ArrayList{  
public static void main(String args[]){ 
	

ArrayList list=new ArrayList();//Creating arraylist  or older jdk 
ArrayList<String> list=new ArrayList<String>();// new method after 1.5 jdk or latest

list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");    
list.add("Ajayhgujg");  

//Traversing list through Iterator  
Iterator itr=list.iterator(); //getting the iterator 
while(itr.hasNext()) // check if iterator has the elements 
{
	System.out.println(itr.next()); // printing the element and move to next  
}	
}  
}

