package JavaExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialzation implements java.io.Serializable{
    
    private String message;
    private int id;
    
    SerializationAndDeserialzation(String message , int id){
        
        this.message = message ;
        this.id = id;
    }
    
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        SerializationAndDeserialzation s = new SerializationAndDeserialzation("hello" ,1);
        
        String filename =  "file.txt";
        
        try {
        FileOutputStream f1 = new FileOutputStream("file.txt");
        ObjectOutputStream out = new ObjectOutputStream(f1);
        
        out.writeObject(s); 
        out.close();
        f1.close();
        System.out.println("Object has been serialized"); 
        }catch(IOException ex){
            System.out.println("IOException is caught" + ex); 
        }

        try{
        FileInputStream f = new FileInputStream("file.txt");
        ObjectInputStream in = new ObjectInputStream(f);
        
        SerializationAndDeserialzation s1 = null;
        
         // Method for deserialization of object 
         s1 = (SerializationAndDeserialzation)in.readObject(); 
        
         in.close(); 
         f.close(); 
         System.out.println("Object has been deserialized "); 
         System.out.println("a = " + s1.message); 
        System.out.println("b = " + s1.id); 
        }catch(IOException ex){
            System.out.println("IOException is caught"); 
        }

    }
    
}
