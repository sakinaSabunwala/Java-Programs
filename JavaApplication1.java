
package javaapplication1;

public class JavaApplication1 {
    
    int arr = 10;
    int data = 10;

    JavaApplication1() { 
     B b=new B(this);
     b.display();
     System.out. println("hello"); }
    // this as class obj 
    
    JavaApplication1(int a) {
        this();                     // used to invoke current class cnstructor
        int temp = a;
        System.out.println(temp);
    }
    //this keyword usd as calling current class instance var.
     int a , b;
    public void student (int a , int b) {
       
        this.a = a;
        this.b = b;
    }
    public void show () {
        System.out.println(a + "+" + b);
    }
    
    //invoke current class method
    void m(){System.out.println("hello m");}  
    void n(){  
                System.out.println("hello n");  
                //m();//same as this.m()  
                this.m();  
            }  
    
    //passed as arg in method call
    void m1(JavaApplication1 j3){ System.out.println("method is invoked");  }
    
    void p(){  
        m1(this);  
        }  
    
    JavaApplication1 getA(){
        return this;
    }
    void msg()
    { System.out.println("sakina");}
    
     
//    JavaApplication1(){  
//    B b=new B(this);  
//    b.display();  
//    }  
//    
    
    public static void main(String[] args) {
        JavaApplication1 j1 = new JavaApplication1();
        JavaApplication1 j2 = new JavaApplication1(2);
        j1.student(1, 1);
        j1.show();
        j1.n();
        j1.p();
        j1.getA().msg();
        
        
    }
    
}

class B{  
  JavaApplication1 obj;  
  B(JavaApplication1 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of A4 class  
  }  
}  

