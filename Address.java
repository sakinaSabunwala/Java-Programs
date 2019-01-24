public class Address {
    
    String country;
    String state ;
    String city;
    
    Address (String country , String state , String city) {
        
        this.country = country ;
        this.state = state;
        this.city = city;
    }
    
}
 
class Employee {
    
    String empName;
    Address add;
    
    Employee(String name , Address add){
        this.empName = name;
        this.add = add;
        
    } 
    
    public void show() {
        System.out.println("name :  " + empName  + " \nAddress :" + 
                            add.country + " " + add.state + " " + add.city);
    }
    
    public static void main(String args[]) {
        
        Address a1 = new Address("India","rajasthan" , "udaipur");
        Employee e1 = new Employee ("sakina" , a1);
        e1.show();
        
    }
}
