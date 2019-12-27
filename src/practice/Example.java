package practice;

public class Example{
	 public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
	  Runtime r = Runtime.getRuntime();
	  System.out.println(r.availableProcessors());
	  System.out.println(r.totalMemory());	  
	  System.out.println(r.freeMemory()); 

	  for(int i=0;i<10000;i++){  
	   new Example();  
	  }  
	  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
	  System.gc();  
	  System.out.println("After gc(), Free Memory: "+r.freeMemory()); 
	 }  
}

