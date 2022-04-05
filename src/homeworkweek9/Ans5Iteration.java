package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

public class Ans5Iteration {
//    Write a Java program to iterate through all elements in an array list using
//    Iterator.

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();
        list.add("Ahemdabad");
        list.add("Baroda");
        list.add("Dakor");
        list.add("Anand");
        list.add("Surat");
        list.add("Navsari");

        //iteration by "Iteratrator"

        Iterator obj= list.iterator();
        while (obj.hasNext()){
            System.out.println(obj.next());
        }
    }
}
