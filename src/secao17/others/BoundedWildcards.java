package secao17.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedWildcards {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        System.out.println();
        System.out.println("Line Break");
        copy(myDoubles, myObjs);
        printList(myObjs);
    }
    public static void copy(List<? extends Number> list, List<? super Number> destiny){
        for (Number number: list){
            destiny.add(number);
        }
    }
    public static void printList(List<?> list){
        for (Object object : list){
            System.out.print(object + " ");
        }
    }
}
