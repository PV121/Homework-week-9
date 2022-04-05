package homeworkweek9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ans4 {
    //Write a Java program to create a new array list, add some colours (string) and
    //printout the collection using for each loop
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Black");

        // for each loop :
        for (String colourlist : colours) {
            System.out.println(colourlist);
        }

    }
}
