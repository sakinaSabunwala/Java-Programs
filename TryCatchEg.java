
package JavaExamples;


public class TryCatchEg { 
    
    //throw example
    static void avg(){
         try
         {
          throw new ArithmeticException("demo");
         }
         catch(ArithmeticException e)
         {
          System.out.println("Exception caught");
         }
    }
    
    //throws example
    static void check() throws ArithmeticException
        {
         System.out.println("Inside check function");
         throw new ArithmeticException("demo");
        }
    
    
    public static void main(String args[]){
        
        
        //throws example 
        try { check();
        }catch(ArithmeticException e)
            {
             System.out.println("caught" + e);
            }
        
        
       avg();  //throw example
        try {
     
        
        //
        try{
            
         //arithmatic exception
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
        }catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
         try { 
         //array out of bound
         int a[]=new int[10];
          a[11] = 9;  //Array has only 10 elements  
         }catch(ArrayIndexOutOfBoundsException e){
          System.out.println ("ArrayIndexOutOfBounds");
         }
          
         
         try {
         //number format 
         int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
         }catch(NumberFormatException e){
          System.out.println("Number format exception occurred");
         }

        }catch(Exception e){
            System.out.println("generic exception occured");
        }
        finally{  
          System.out.println("Finally executes afterwards.");  //always executed
     }  
        
        
}
        
}
