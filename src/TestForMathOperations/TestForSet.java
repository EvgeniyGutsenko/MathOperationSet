package TestForMathOperations;

import MathOperationBody.UtilityClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestForSet {

    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    @Before
    public void buildSet(){
        set1.add("A");
        set1.add("B");

        set2.add("B");
        set2.add("C");
    }

    @After
    public void clearSet() {

        HashSet<String> set1 = null;
        HashSet<String> set2 = null;
    }

    @Test
    public void union() {
        HashSet<String> expected = new HashSet<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");

        HashSet<String> actual = UtilityClass.union(set1,set2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void intersect() {
        HashSet<String> expected = new HashSet<>();
        expected.add("B");

        HashSet<String> actual = UtilityClass.intersect(set1,set2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void minus() {
        HashSet<String> expected = new HashSet<>();
        expected.add("A");

        HashSet<String> actual = UtilityClass.minus(set1,set2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void difference() {
        HashSet<String> expected = new HashSet<>();
        expected.add("A");
        expected.add("C");

        HashSet<String> actual = UtilityClass.difference(set1,set2);
        Assert.assertEquals(expected,actual);
    }
}
