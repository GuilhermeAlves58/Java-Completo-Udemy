package secao17.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }

        /* ---------- LinkedHashSet: ordem de inserção ---------- */
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("TV");
        linkedSet.add("Notebook");
        linkedSet.add("Tablet");
        linkedSet.add("Smartphone");

        System.out.println("LinkedHashSet (ordem de inserção):");
        for (String item : linkedSet) {
            System.out.println("  " + item);
        }

        /* ---------- TreeSet: ordem natural (alfabética) ---------- */
        Set<String> treeSet = new TreeSet<>(linkedSet);   // usa os mesmos elementos

        System.out.println("\nTreeSet (ordem natural):");
        for (String item : treeSet) {
            System.out.println("  " + item);
        }

        /* ---------- Operações típicas ---------- */
        System.out.println("\nlinkedSet.contains(\"Tablet\")  -> " + linkedSet.contains("Tablet"));
        System.out.println("treeSet.first()                -> " + ((TreeSet<String>) treeSet).first());
        System.out.println("treeSet.last()                 -> " + ((TreeSet<String>) treeSet).last());
    }
}
