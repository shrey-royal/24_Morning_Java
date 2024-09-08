import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Ram");
        map.put(2, "Krishna");
        map.put(3, "Shiva");
        map.put(4, "Ganesh");
        map.put(5, "Bramha");
        map.put(6, "Parshuram");
        map.put(7, "Vishnu");
        map.put(8, "Kalki");
        map.put(9, "Narayan");
        map.put(10, "Kuber");
        map.put(11, "Indra");
        map.put(12, "Surya");
        map.put(13, "Chandra");
        map.put(14, "Yam");
        map.put(15, "Varun");
        map.put(16, "Vayu");
        map.put(17, "Agni");
        map.put(18, "Kamdev");
        map.put(19, "Narad");
        map.put(20, "Hanuman");

        System.out.println(map);

        // System.out.println("Size: " + map.size());
        // System.out.println(map.get(17));
        // map.clear();
        // System.out.println(map.isEmpty());
        // System.out.println(map.containsKey(125));
        // System.out.println(map.containsValue("Shiva"));

        //replace
        // map.replace(1, "Rama");
        // map.replace(1, "Rama", "Ramachandra");
        // System.out.println(map);

        // HashMap<Integer, String> map1 = new HashMap<>();
        // map.put(111, "Car");
        // map.put(222, "Bike");
        // map.put(333, "Nothing");
        // map.putAll(map1);

        // System.out.println(map);

        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.entrySet());

        // getOrDefault
        // System.out.println(map.get(125));   //null
        // System.out.println(map.getOrDefault(125, "Invalid Key"));
        

        // putIfAbsent
        map.putIfAbsent(112, "Car & Bike");
        System.out.println(map);
    }
}
/*

-> Map is a combination of key, value pairs that we can store and retrieve data from.
-> it doesn't have any ordering method
-> we have to give 2 datatypes when declaring the map (1 4 key & 1 4 value)

Methods of HashMap: 

1. put(key, value): This method is used to insert an entry in this map.
2. get(key): This method is used to return the value for the specified key.
3. remove(key): This method is used to delete an entry for the specified key.
4. containsKey(key): This method is used to search the specified key from this map.
5. containsValue(value): This method is used to search the specified value from this map.
6. size(): This method is used to return the size of this map.
7. replace(key, oldValue, newValue): This method is used to replace the oldValue with newValue for the specified key.
8. replace(key, value): This method is used to replace the value for the specified key.
9. putAll(Map m): This method is used to copy all of the mappings from the specified map to this map.
10. clear(): This method is used to remove all of the mappings from this map.
11. keySet(): This method is used to return the Set view containing all the keys.
12. values(): This method is used to return the collection view containing all the values.
13. entrySet(): This method is used to return the Set view containing all the keys and values.
14. getOrDefault(Object key, V defaultValue): This method is used to return the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
15. putIfAbsent(K key, V value): This method inserts the specified value with the specified key in the map only if it is not already specified.
----------------------------------------------------------------------------------------
Task:

Problem Title: Calculate Average Grades

Problem Description:

You are tasked with writing a program to calculate the average grades of a group of students. The program should take a list of student names and their corresponding grades as input and then compute the average grade for the entire class.

Input:
- A list of student names (strings).
- A list of corresponding grades (floating-point numbers).

Output:
- The average grade for the class (a floating-point number).

Function Signature:

---
public static double calculateAverageGrade(String[] studentNames, double[] studentGrades) {
    // Your code here
    return 0.0; // Placeholder return value
}

// Example usage
String[] studentNames = {"Alice", "Bob", "Charlie", "David"};
double[] studentGrades = {85.5, 92.0, 78.5, 88.0};
double averageGrade = calculateAverageGrade(studentNames, studentGrades);
System.out.println("Average Grade: " + averageGrade);
---

Constraints:
- 1 <= Number of students <= 1000
- Grades are floating-point numbers between 0 and 100.

Note:
- You need to calculate the average grade by summing up all the grades and dividing by the number of students.

Your task is to implement the 'calculate_average_grade' function that computes the average grade for the given list of student names and their grades.



*/