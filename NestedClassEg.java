
public class NestedClassEg {
    
    static int a ;
    int b = 20;
    
    public static class innerClass {
        
        void display(){
            System.out.println("helloooo");
            System.out.println("hey" + a);
            //System.out.println("hi" + b); cant access non static members 
        }
    }
    
    public static void main(String args[]){
   
        NestedClassEg.innerClass n = new NestedClassEg.innerClass();
        n.display();
    }
}
