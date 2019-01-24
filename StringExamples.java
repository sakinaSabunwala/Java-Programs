
package JavaExamples;


public class StringExamples {
    
    String str1 = "sakina";
    
    public static  void stringMethod(String s) {
       s = s+ "sabunwala"; 
       System.out.println("String got is not original and it is pointed towards a reference variable in string :" + s);
    }
    
    public static void stringBuilderMethod(StringBuilder s) {
        s.append("sabunwala");
         System.out.println("in stringBuilder the origonal variable is changed : " + s);
    }

    
    public  static void stringBufferMethod(StringBuffer s) {
        s.append("sabunwala");
         System.out.println("in stringBuffer works same as the stringBuilder but is thread safe:" + s);
    }
    
    public static void main(String[] args) {
        
        String str1 = "sakina";
        stringMethod(str1);
        
        StringBuilder s1 = new StringBuilder("sakina");
        stringBuilderMethod(s1);
        
        StringBuffer s2 = new StringBuffer("sakina");
        stringBufferMethod(s2);
        
    }
    
}
