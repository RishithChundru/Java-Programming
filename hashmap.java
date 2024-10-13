import java.util.HashMap;

public class hashmap{

    public static void main(String[] args) {
        
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. Inserting key-value pairs into the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);
        System.out.println("Initial HashMap: " + map);
        
        // 2. Accessing a value using the key
        int value = map.get("Apple");
        System.out.println("Value for 'Apple': " + value);
        
        // 3. Updating the value for a key
        map.put("Banana", 25);  // Updating Banana's value
        System.out.println("Updated HashMap (after updating Banana): " + map);
        
        // 4. Checking if a key is present
        if (map.containsKey("Mango")) {
            System.out.println("'Mango' is present in the HashMap.");
        }

        // 5. Removing a key-value pair
        map.remove("Orange");
        System.out.println("Updated HashMap (after removing Orange): " + map);
        
        // 6. Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // 7. Getting the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // 8. Checking if the map is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());
        
        // 9. Clearing all elements from the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map);
    }
}
