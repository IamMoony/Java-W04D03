package Advanced_A5_Simon;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        // Create customers objects
        Customer c1 = new Customer(0001, "Mueller");
        Customer c2 = new Customer(0002, "Bauer");
        Customer c3 = new Customer(0003, "Havlicek");
        Customer c4 = new Customer(0004, "Warmhud");
        Customer c5 = new Customer(0010, "Burger");

        // Save customer objects into an array
        Customer[] arr = {c1, c2, c3, c4, c5};

        // Convert the array into a list
        List<Customer> customers = Arrays.asList(arr);

        //Create a randomizer -- picks a random index from the customer list
        int index = new Random().nextInt(customers.size());

        // Random output saved into a variable called output
        Customer output = customers.get(index);

        // Print the random id and name from the array list
        System.out.println("ID: " + output.getId() + "\nName: " + output.getName());

    }
}
