import java.util.*;
import java.util.stream.Collectors;

public class UC8 {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Bogie{name='" + name + "', capacity=" + capacity + "}";
        }
    }

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("===============================================\n");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("B1", 50));
        bogies.add(new Bogie("B2", 30));
        bogies.add(new Bogie("B3", 70));
        bogies.add(new Bogie("B4", 20));

        // Step 2 & 3: Convert to stream and apply filter condition
        // Example condition: capacity >= 40
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity >= 40)
                .collect(Collectors.toList());

        // Step 4 & 5: Display filtered bogies
        System.out.println("Filtered Bogies (capacity >= 40):");
        filteredBogies.forEach(System.out::println);
    }
}