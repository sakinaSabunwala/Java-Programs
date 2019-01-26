
package JavaExamples;

import java.util.ArrayList;
import java.util.List;


public class AutoboxingAndUnboxing {
    
    public static void printEven(List<Integer> list){
        
        for (int i : list ){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String args[]){
         List<Integer> list = new ArrayList<Integer>(); 
         for(int i=0;i<10;i++){
             list.add(i);
         }
         
         printEven(list);

    }
    
}
