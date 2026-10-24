import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Java_Collections {
    public static void main(String[] args) {
        // 1. Creating a Map
        // Map is an interface; HashMap is its implementation.
        Map<Integer, String> map = new HashMap<>();

        // 2. put(key, value): Adds key-value pairs
        map.put(101, "Harsh");
        map.put(102, "Aman");
        map.put(103, "Rahul");
        map.put(104, "Priya");

        System.out.println("Original Map: " + map);

        // 3. Duplicate keys: The existing value gets replaced
        map.put(101, "Karan");
        System.out.println("After updating key 101: " + map);

        // 4. get(key): Returns the value associated with a key
        System.out.println("Value of key 102: " + map.get(102));

        // 5. getOrDefault(key, defaultValue)
        // Returns the default if the key is absent
        System.out.println("Key 105: " +
                map.getOrDefault(105, "Not Found"));

        // 6. containsKey(key): Checks whether a key exists
        System.out.println("Has key 101? " +
                map.containsKey(101));

        // 7. containsValue(value): Checks whether a value exists
        System.out.println("Has value Rahul? " +
                map.containsValue("Rahul"));

        // 8. size(): Returns the number of entries
        System.out.println("Size: " + map.size());

        // 9. isEmpty(): Checks whether the map is empty
        System.out.println("Is empty? " + map.isEmpty());

        // 10. putIfAbsent(key, value)
        // Inserts if the key is absent or currently maps to null
        map.putIfAbsent(105, "Rohit");
        System.out.println("After putIfAbsent: " + map);

        // 11. replace(key, value)
        // Replaces a value only if the key exists
        map.replace(102, "Aman Kumar");
        System.out.println("After replace: " + map);

        // 12. remove(key): Removes the entry with that key
        map.remove(104);
        System.out.println("After removing key 104: " + map);

        // 13. remove(key, value)
        // Removes only if both key and value match
        map.remove(103, "Rahul");
        System.out.println("After conditional remove: " + map);

        // 14. putAll(otherMap): Copies entries from another map
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(106, "Neha");
        anotherMap.put(107, "Simran");

        map.putAll(anotherMap);
        System.out.println("After putAll: " + map);

        // 15. keySet(): Returns a Set of all keys
        System.out.println("All keys: " + map.keySet());

        // 16. values(): Returns a Collection of all values
        System.out.println("All values: " + map.values());

        // 17. entrySet(): Returns a Set of key-value entries
        System.out.println("All entries: " + map.entrySet());

        // 18. Iteration using keySet()
        // Get each key, then retrieve its value
        System.out.println("\nIteration using keySet():");

        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        // 19. Iteration using values()
        // Visits values only, not their keys
        System.out.println("\nIteration using values():");

        for (String value : map.values()) {
            System.out.println(value);
        }

        // 20. Iteration using entrySet()
        // Accesses both key and value directly
        System.out.println("\nIteration using entrySet():");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                    entry.getKey() + " = " + entry.getValue());
        }

        // 21. Using an Iterator with entrySet()
        // Iterator lets us traverse entries one by one
        System.out.println("\nUsing Iterator:");

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(
                    entry.getKey() + " = " + entry.getValue());
        }

        // 22. Map.Entry methods
        // getKey(): Returns the current entry's key
        // getValue(): Returns the current entry's value
        // setValue(): Changes the value of this entry
        System.out.println("\nUsing Map.Entry:");

        Map.Entry<Integer, String> firstEntry = map.entrySet().iterator().next();

        System.out.println("Key: " + firstEntry.getKey());
        System.out.println("Value: " + firstEntry.getValue());

        // 23. forEach(): Executes an action for each key-value pair
        System.out.println("\nUsing forEach():");

        map.forEach((key, value) -> System.out.println(key + " = " + value));

        // 24. computeIfAbsent()
        // Computes and inserts a value if the key is absent
        map.computeIfAbsent(108, key -> "Student" + key);
        System.out.println("\nAfter computeIfAbsent: " + map);

        // 25. computeIfPresent()
        // Updates the value only if the key exists and maps to non-null
        map.computeIfPresent(101, (key, value) -> value + " Kumar");
        System.out.println("After computeIfPresent: " + map);

        // 26. merge()
        // Combines an existing non-null value with the supplied value
        map.merge(101, " Singh", (oldValue, newValue) -> oldValue + newValue);
        System.out.println("After merge: " + map);

        // 27. null key and null values in HashMap
        // HashMap permits one null key and multiple null values
        map.put(null, "Unknown");
        map.put(109, null);
        map.put(110, null);

        System.out.println("\nMap with nulls: " + map);
        System.out.println("Value of null key: " + map.get(null));
        System.out.println("Value of key 109: " + map.get(109));

        // 28. clear(): Removes every entry
        map.clear();

        System.out.println("\nAfter clear(): " + map);
        System.out.println("Is empty now? " + map.isEmpty());
    }
}
