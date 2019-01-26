
package JavaExamples;

import java.io.*; 
import java.util.*; 

public class SynchronizationExample {
    
     public static void sendMsg(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
    
}
class ThreadSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    SynchronizationExample  sender; 
  
    // Recieves a message object and a string 
    // message to be sent 
    ThreadSend(String m,  SynchronizationExample obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    { 
        // Only one thread can send a message 
        // at a time. 
        synchronized(sender)
        { 
            // synchronizing the snd object 
            SynchronizationExample.sendMsg(msg); 
        } 
    } 
} 

class SyncDemo 
{ 
    public static void main(String args[]) 
    { 
        SynchronizationExample snd = new SynchronizationExample(); 
        ThreadSend S1 = 
            new ThreadSend( " Thread 1 " , snd ); 
        ThreadSend S2 = 
            new ThreadSend( " Thread 2 " , snd ); 
  
        // Start two threads of ThreadedSend type 
        S1.start(); 
        S2.start(); 
  
        // wait for threads to end 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 
