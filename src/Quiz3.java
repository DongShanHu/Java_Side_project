import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Quiz3 {
//lambda java8

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Sahesh ");
        names1.add("Auresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Sahesh ");
        names2.add("Buresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        Quiz3 tester = new Quiz3();
        System.out.println("Sort using Java 7 syntax: ");
        tester.sortUsingJava7(names1);
        System.out.println(names1);

        System.out.println("Sort using Java 8 syntax: ");
        tester.sortUsingJava8(names2);
        System.out.println(names2);

    }
    //sort using java 7

    private void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }

//sort function with a lambda expression as parameter to get the sorting criteria.
    //sort using java 8
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }

}

