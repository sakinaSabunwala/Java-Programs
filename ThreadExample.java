
package JavaExamples;

/* we can extend thread class 
public class ThreadExample extends Thread{
    
    public void run(){
        
        int age = 10;
        System.out.println("you are young at the age of :"+ age );
        System.out.println("thread example is running");
    }
    
   public static void main(String args[]){
       
       ThreadExample obj = new ThreadExample();
       obj.start();
   }
    
    
    
}*/

//invoking thread by implementing runnable
public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("numbers:");
        for(int i =0 ; i<10;i++){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        
       Thread t = new Thread(new ThreadExample());
       Thread t1 = new Thread(new ThreadExample());
       t.start();
       System.out.println("name  :" +t.getName());     // to get the name of thread
       System.out.println("name 1 :" +t1.getName());
       System.out.println("priority:" + t1.getPriority());
       System.out.println("is alive:" + t.isAlive());
    }
}

