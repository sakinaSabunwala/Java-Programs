
package JavaExamples;
import java.io.*;
/*if parent class does not declare an exception the child class cannot declare an checked  exception
public class OverRiddingExceptioneEx {
    void msg(){System.out.println("parent");}  
}
class child extends OverRiddingExceptioneEx{
  void msg()throws IOException{  
    System.out.println("TestExceptionChild");  
  }    
    
}*/

// if parent class does not declare an checked exception the child class cannot declare an checked  exception but can declare an unchecked exception
public class OverRiddingExceptioneEx{
    void msg(){System.out.println("parent");}  
}
class child extends OverRiddingExceptioneEx{
    void msg()throws NumberFormatException{  
    System.out.println("child");  
  }  
  public static void main(String args[]){
       OverRiddingExceptioneEx eg =new OverRiddingExceptioneEx();  
       eg.msg();  
       OverRiddingExceptioneEx eg1 = new child();
       eg1.msg();
  }
}


