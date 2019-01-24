
package JavaExamples;

public class UserDefinedExceptionExample extends Exception{
    
    public UserDefinedExceptionExample(String s){
        super(s);
    }
    
    
}
 class WeightCheck{
     
     void weightCheckMethod(int weight) throws UserDefinedExceptionExample{
	if(weight>100){
		throw new UserDefinedExceptionExample("Lose weight");
	}
     }
     
     public static void main(String args[])
    {
    	WeightCheck obj = new WeightCheck();
        try
        {
            obj.weightCheckMethod(610);
        }
        catch (UserDefinedExceptionExample ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
    
}
