package homeworkweek9;

import java.util.ArrayList;

public class Ans6 {
    //    Write a Java program to retrieve an element (at a specified index) from a given
//    array list
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Jira");
        list.add("Postman");
        list.add("Selenium");
        list.add("IntelliJ");

        //retrieving element
        System.out.println(list.get(3));//Inrellij
        System.out.println(list.get(0));//Jira

    }
}
