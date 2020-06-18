import java.util.*;  
public class TestJavaCollection1{  
public static void main(String args[]){ 
	

ArrayList list=new ArrayList();//Creating arraylist  

list.add("Ravi");//Adding object in arraylist  
list.add("Vijay");  
list.add(1,78);  
list.add("Ajayhgujg");  

//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext())
{System.out.println(itr.next());}  
}  
}

