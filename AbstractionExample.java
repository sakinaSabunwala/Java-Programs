abstract class func {
    abstract void fun() ; // abstract method
}
class AbstractionExample extends func{

    @Override
    void fun() {
        System.out.println("func is extended and func is overriddden");
    }
    
    public static void main(String args[]){
        AbstractionExample a = new AbstractionExample();
        a.fun();
        
    }
    
}
