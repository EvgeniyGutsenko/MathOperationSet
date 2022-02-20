package MathOperationBody;

import java.util.HashSet;

public class UtilityClass {

    private void UtilityClass() {
    }

    public static <N> HashSet<N> union(HashSet<N>set1, HashSet<N>set2) {
        HashSet<N> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static <N> HashSet<N> intersect(HashSet<N>set1, HashSet<N>set2) {
        HashSet<N> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    public static <N> HashSet<N> minus(HashSet<N>set1, HashSet<N>set2){
        HashSet<N> minus = new HashSet<>(set1);
        minus.removeAll(set2);
        return minus;
    }

    public static <N> HashSet<N> difference(HashSet<N> set1, HashSet<N> set2) {
        HashSet<N> union = new HashSet<>(set1);
        HashSet<N> intersection = new HashSet<>(set1);
        union.addAll(set2);
        intersection.retainAll(set2);
        HashSet<N> difference = new HashSet<>(union);
        difference.removeAll(intersection);
        return difference;
    }
}

