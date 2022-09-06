class Singleton {

	private static volatile Singleton instance;
	private static Object mutex = new Object();

	private Singleton() {
	}

	public static Singleton getInstance() {
		Singleton result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new Singleton();
			}
		}
		return result;
	}

 public void printMessage(){
      System.out.println("Hello from Singleton instance!!!");
   }
}
 
public class thread {
   public static void main(String[] args) {
 
  Singleton object=Singleton.getInstance();
 
      
    object.printMessage();
   }
}