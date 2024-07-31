package TRICKS;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SORTING2D {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {30, 25, 35};

        // Create an array of Person objects
        Person[] people = new Person[names.length];
        for (int i = 0; i < names.length; i++) {
            people[i] = new Person(names[i], ages[i]);
        }

        // Sort by age in decreasing order
        Arrays.sort(people, Comparator.comparingInt(Person::getAge).reversed());

        // Print the sorted array
        System.out.println("People sorted by age in decreasing order: " + Arrays.toString(people));
    }
}
