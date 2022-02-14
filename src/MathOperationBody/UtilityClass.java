package MathOperationBody;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilityClass {

    private HashSet<Integer> set1;
    private HashSet<Integer> set2;

    public void UtilityClass(HashSet<Integer> set1, HashSet<Integer> set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    public static void Union(HashSet<Integer>set1, HashSet<Integer>set2){

        Set<Integer> union = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
    }

    public static void Intersect(HashSet<Integer>set1, HashSet<Integer>set2) {

        Set<Integer> intersect = set1.stream().filter(set2::contains).collect(Collectors.toSet());
    }

    public static void Minus(HashSet<Integer>set1, HashSet<Integer>set2){

        Set<Integer> minus = set1.stream().filter(set2::contains).collect(Collectors.toSet());
    }

    public static void Difference(Set<Integer> getSet1, Set<Integer> getSet2) {
        Set differenceSet = new HashSet<>(getSet1);
        differenceSet.removeAll(getSet2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UtilityClass)) return false;
        UtilityClass that = (UtilityClass) o;
        return set1.equals(that.set1) && set2.equals(that.set2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set1, set2);
    }

    @Override
    public String toString() {
        return "UtilityClass{" +
                "set1=" + set1 +
                ", set2=" + set2 +
                '}';
    }
}

