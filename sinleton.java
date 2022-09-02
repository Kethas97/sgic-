package ex03;

public class sinleton {

	 private static sinleton instance;
	 
	  private sinleton()
	  {
	    
	  }
	 
	 
	  public static sinleton getInstance()
	  {
	    if (instance == null)
	    {
	      
	      instance = new sinleton();
	    }
	    return instance;
	  }
	  
	  public String s1(String s) {
		  return s.toUpperCase();
	  }
}
