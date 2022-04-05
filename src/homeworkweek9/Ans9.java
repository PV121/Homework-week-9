package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

public class Ans9 {
    /*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
     */
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Manual", 1);
        people.put("TestCase", 2);
        people.put("Gherkin", 3);
        people.put("Postman", 4);
        people.put("JIRA", 5);
        people.put("JAVA", 6);
        people.put("Selenium", 7);

        // for each loop to iterate the value
        for (Map.Entry<String, Integer> list : people.entrySet()) {
            System.out.println(list.getValue());
        }
    }
}

