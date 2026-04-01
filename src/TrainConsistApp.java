import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC6: Map Bogie to Capacity) ===\n");

        // Create a HashMap to store bogie name -> capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie-capacity entries
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 36);
        bogieCapacityMap.put("Cargo", 1000); // in kg, for goods bogie

        // Display bogie and capacity details
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("- " + entry.getKey() + " : " + entry.getValue() +
                    (entry.getKey().equals("Cargo") ? " kg" : " seats"));
        }

        // Lookup example: get capacity of a specific bogie
        String lookupBogie = "AC Chair";
        if (bogieCapacityMap.containsKey(lookupBogie)) {
            System.out.println("\nCapacity of " + lookupBogie + " bogie: " +
                    bogieCapacityMap.get(lookupBogie) + " seats");
        }

        // Display total bogies tracked
        System.out.println("\nTotal bogies tracked: " + bogieCapacityMap.size());
    }
}