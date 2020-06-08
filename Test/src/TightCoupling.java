// Java program to illustrate 
// tight coupling concept 
class Subject { 
	TightCoupling t = new TightCoupling(); 
    public void startReading() 
    { 
        t.understand(); 
    } 
} 
public class TightCoupling {

	 public void understand() 
	    { 
	        System.out.println("Tight coupling concept"); 
	    } 
}
