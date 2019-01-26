
package JavaExamples;

import java.util.*;


class Emp {
    
    int empNumber;
    String empName;
    String empDesgination;
    long empSalary;
    
    Emp(int empNo , String name , String desg, long sal ){
        empNumber = empNo;
        empName = name;
        empDesgination = desg;
        empSalary = sal;
    }
    
    public String toString(){
        return empNumber + " " + empName + " " + empDesgination + " " + empSalary;
    }
    
}
class MyComp implements Comparator<Emp>{
    public int compare(Emp a,Emp b){ 
            return (int) (a.empSalary-b.empSalary);
    }
}

public class TreeSetMapExample {
    
    public static void main(String args[]) {
        
        
        TreeSet<Emp> ts=new TreeSet<Emp>(new MyComp());
      
        ts.add(new Emp(1,"sakina","Project Manager",25000));
        ts.add(new Emp(2,"vipul","Project Lead",35000));
        ts.add(new Emp(3,"neeraj","Programmer Analyst",10000));
        ts.add(new Emp(4,"zee","System Analyst",20000));
        ts.add(new Emp(5,"elize","Software Engineer",45000));
        
         Iterator<Emp> itr= ts.iterator();
         
          while(itr.hasNext()){
            Emp element= (Emp) itr.next();
                System.out.println(element); 
        }
          
         TreeMap<Integer,Emp> tm=new TreeMap<Integer,Emp>();
                  tm.put(1,new Emp(1,"sakina","Project Manager",25000));
                  tm.put(2,new Emp(2,"vipul","Project Lead",35000));
                  tm.put(3,new Emp(3,"neeraj","Programmer Analyst",10000));
                  tm.put(4,new Emp(4,"zee","System Analyst",20000));
                  tm.put(5,new Emp(5,"elize","Software Engineer",45000));
                  
                  Set<Map.Entry<Integer,Emp>> set =tm.entrySet();
                  
                  for(Map.Entry<Integer,Emp> me : set){
                      
                      System.out.println();
                      System.out.println();
                      System.out.println(me.getKey());
                      System.out.println(me.getValue());
                  }
    
}
}
