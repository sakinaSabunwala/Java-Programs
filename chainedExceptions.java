
package JavaExamples;

import java.io.IOException;


public class chainedExceptions {
    
    public static void checkAge(int age){
        if(age<=0)
        {
            ArithmeticException ae = new ArithmeticException("top layer");
            ae.initCause( new IOException("cause") );
            throw ae;
        }
        else
        {
         System.out.println("correct age");
        }
    }
    
   public static void main(String args[]){
       try {
                 checkAge(0);
       }
       catch(ArithmeticException ae) {
        System.out.println( "caught : " +ae);
        System.out.println("actual cause: "+ae.getCause());
       }
        }
}
