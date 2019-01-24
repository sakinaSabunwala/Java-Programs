
public class PrivateConstructor {
    
    
   
    static PrivateConstructor example   = null;
     static public int x = 10; 
     
    
    private PrivateConstructor() { }

    static public PrivateConstructor getExample() {
         if(example == null) 
             example = new PrivateConstructor();  
         return example;
    }
    
}
class Main{
    public static void main(String args[])
    {   
        PrivateConstructor p1 = PrivateConstructor.getExample();
        PrivateConstructor p2 = PrivateConstructor.getExample();
           //p1.x= p1.x + 10;
         System.out.println("hello");
         System.out.println("Value of a.x = " + p1.x); 
         System.out.println("Value of b.x = " + p2.x); 
    }
}
