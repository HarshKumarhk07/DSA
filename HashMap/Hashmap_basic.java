package HashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_basic {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        //Insertion
        map.put("India",150);    
        map.put("china",200);    
        map.put("us",50);    
        map.put("uae",10);
        
        //Searching 
        map.containsKey("India");
        map.containsKey("Indo");
        
        //get value 
        map.get("india");
        
        //iteration: using for each loop 
        //1
        for(Map.Entry<String ,Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.print(e.getValue());
        }

        //remove
        map.remove("china");
        
    }
}
