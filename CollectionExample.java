
package JavaExamples;

import java.util.*;

class Employee {
    
    int empNumber;
    String empName;
    String empDesgination;
    int empSalary;
    
    Employee() { }
    
    Employee(int empNo , String name , String desg, int sal ){
        empNumber = empNo;
        empName = name;
        empDesgination = desg;
        empSalary = sal;
    }
    
    public String toString(){
        return empNumber + " " + empName + " " + empDesgination + " " + empSalary;
    }
    
}
class DesignationSalary{
    
    HashMap<String,Integer> salary(){
    HashMap<String,Integer> hm= new HashMap<String,Integer>(); 
         hm.put("developer",16000);
         hm.put("senior developer",20000);
         return hm;
    }
    
//    HashMap<String,Integer> calcSum (){
//       HashMap<String,Integer> hm1= new HashMap<String,Integer>(); 
//       
//       
//    }
    
}
public class CollectionExample {
    
    public static void main(String args[]){
        
        System.out.println("EMPLOYEE LIST");
        
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"sakina","Developer",1600));
        list.add(new Employee(2,"vipul","Developer",1600));
        list.add(new Employee(3,"neeraj","Senior Developer",2000));
        list.add(new Employee(4,"zeenat","Business Analyst",1000));
        list.add(new Employee(5,"alisha","Business Analyst",1000));
        list.add(new Employee(6,"sani","Developer",1600));
        list.add(new Employee(7,"afshu","Senior Developer",2000));
        list.add(new Employee(8,"gajju","Developer",1600));
        
        DesignationSalary ds = new DesignationSalary();
        
        
        HashMap<String,Integer> salary = ds.salary();
         
        Iterator itr = list.iterator();
        
        while(itr.hasNext()){
            Employee element=(Employee) itr.next();
            System.out.println(element);
        }
        
        //System.out.println(salary.get("developer"));
         HashMap<String,Integer[]> hm1= new HashMap<String,Integer[]>();
         
         hm1.put("Developer",new Integer[]{0,0});
         hm1.put("Senior Developer",new Integer[]{0,0});
         hm1.put("Business Analyst",new Integer[]{0,0});
         
         Iterator itr1 = list.iterator();
         
         
         while(itr1.hasNext()){
             
             Employee employee = (Employee)itr1.next();
             hm1.put(employee.empDesgination,new Integer[]{(hm1.get(employee.empDesgination)[0]+employee.empSalary),
                                                            hm1.get(employee.empDesgination)[1]+1});
         }
         
         
         System.out.println();
         System.out.println("TOTAL SALARY GIVEN:");
         Set<Map.Entry<String, Integer[]>> set = hm1.entrySet();
           for(Map.Entry<String, Integer[]> me : set) {
           System.out.print(me.getKey() + ": ");
           Integer temp[] = me.getValue();
           System.out.println("Count :" + temp[1]);
           System.out.println("Salaries:" + temp[0]);
           }
           
          
          
          
     }
    
}
