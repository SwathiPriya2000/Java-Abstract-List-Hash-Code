// Java program to demonstrate 
// hashCode() method 
// for Integer value 
  
import java.util.*; 
  
public class AbsLisHashCode { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 
  
            // Creating object of AbstractList<Integer> 
            ArrayList<Integer> 
                arrlist1 = new ArrayList<Integer>(); 
  
            // Populating arrlist1 
            arrlist1.add(10); 
            arrlist1.add(20); 
            arrlist1.add(30); 
            arrlist1.add(40); 
            arrlist1.add(50); 
  
            // print arrlist1 
            System.out.println("ArrayListlist : " + arrlist1); 
  
            // getting the value at the index 3 
            // using get() method 
            int code = arrlist1.hashCode(); 
  
            // print the value 
            System.out.println("HashCode : " + code); 
        } 
  
        catch (IndexOutOfBoundsException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 





