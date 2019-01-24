
public class InstanceOfExample {
    
    
    
    public static void main(String args[]){
        
        InstanceOfExample i = new InstanceOfExample();
        ChildClass c = new ChildClass();
        InstanceOfExample var = new ChildClass();
        ChildClass.method(var);
        System.out.println(i instanceof InstanceOfExample);
        System.out.println(c instanceof InstanceOfExample);

    }
    
}
class ChildClass extends InstanceOfExample {
    static void method(InstanceOfExample a) {  
    if(a instanceof InstanceOfExample){  
       ChildClass d=(ChildClass)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
}
}
