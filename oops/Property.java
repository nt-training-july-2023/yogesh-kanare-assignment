// Java program to demonstrate Properties class to create
// the properties file
  
import java.util.*;
import java.io.*;
  
public class Property {
    public static void main(String[] args) throws Exception
    {
        // create an instance of Properties
        Properties p = new Properties();
  
        // add properties to it
        p.setProperty("name", "Yogesh Kanare");
        p.setProperty("email",  "abc@gmail.com");
  
        // store the properties to a file
        p.store(new FileWriter("info.properties"),"Properties Uses");
    }
}