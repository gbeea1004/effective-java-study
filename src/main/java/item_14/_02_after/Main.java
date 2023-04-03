package item_14._02_after;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        BigDecimal numberA = new BigDecimal("1.0");
        BigDecimal numberB = new BigDecimal("1.00");

        Set<BigDecimal> hashSet = new HashSet<>();
        hashSet.add(numberA);
        hashSet.add(numberB);
        System.out.println("hashSet.size() = " + hashSet.size());

        Set<BigDecimal> treeSet = new TreeSet<>();
        treeSet.add(numberA);
        treeSet.add(numberB);
        System.out.println("treeSet.size() = " + treeSet.size());
    }
}
