package ca.bcit.comp1510.lab07;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TestThisTest {

    @Test
    public void testLargestIntIntInt1() {
        TestThis testThis = new TestThis();
        int result = testThis.largest(1, 2, 3);
        assertEquals(3, result);
    }
    
    @Test
    public void testLargestIntIntInt2() {
        TestThis testThis = new TestThis();
        int result = testThis.largest(11, 20, 50);
        assertEquals(50, result);
    }
    
    @Test
    public void testLargestIntIntInt3() {
        TestThis testThis = new TestThis();
        int result = testThis.largest(20, 30, 40);
        assertEquals(40, result);
    }
    

    @Test
    public void testLargestListOfInteger1() {
        TestThis testThis = new TestThis();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int result = testThis.largest(list);
        assertEquals(3, result);
    }
    
    @Test
    public void testLargestListOfInteger2() {
        TestThis testThis = new TestThis();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        int result = testThis.largest(list);
        assertEquals(13, result);
    }
    
    @Test
    public void testLargestListOfInteger3() {
        TestThis testThis = new TestThis();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(32);
        list.add(13);
        int result = testThis.largest(list);
        assertEquals(32, result);
    }
    


}