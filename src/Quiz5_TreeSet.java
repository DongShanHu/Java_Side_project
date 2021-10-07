import java.util.List;
import java.util.ArrayList;

public class Quiz5_TreeSet {
    public static void main(String args[]){
        List names=new ArrayList();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");


        //using "::" symbol. A method reference can be used to point the following types of methods −
        names.forEach(System.out::println);
    }
}
