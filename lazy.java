class A{  

 private static A obj;  

 private A(){}  
   
 public static A getA(){  
   
	if (obj == null){ 

            obj = new A();
        }    
  return obj;  
 }  
 
 public void printMessage(){
      System.out.println("Hello from Singleton object!!!");
   }
}
 
public class lazy {
   public static void main(String[] args) {
 
       A object = A.getA();
 
      
      object.printMessage();
   }
}