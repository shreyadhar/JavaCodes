package Properties;

import java.util.*;  
import java.io.*; 

public class Test {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("G:\\trial java\\postTCStrials\\Comparator\\src\\Properties\\db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}  