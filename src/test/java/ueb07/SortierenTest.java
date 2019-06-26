package ueb07;

import org.junit.jupiter.api.Test;

import javax.naming.Name;
import java.util.Arrays;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

public class SortierenTest {

    @Test
    void testSwap(){
        Integer [] array = {2,3,4};
        Sortieren.swap(array,0,1);

        assertEquals(2,(int) array[1]);
        assertEquals(3,(int) array[0]);
        assertEquals(4,(int) array[2]);

    }

    @Test
    void testBubbleSort1(){

        Student s1 = new Student(1,"Andreas");
        Student s2 = new Student (2, "Marie");
        Student s3 = new Student (3,"Thomas");
        Student s4 = new Student (4,"Felix");
        Student [] s = {s2, s4, s1, s3};
        Student [] srichig = {s1, s2, s3, s4};

        Sortieren.bubbleSort(s);
        System.out.println(Arrays.toString(s));
        assertArrayEquals(srichig,s);


    }

    @Test
    void testBubbleSort2 (){
        Student s1 = new Student(1,"Andreas");
        Student s2 = new Student (2, "Marie");
        Student s3 = new Student (3,"Thomas");
        Student s4 = new Student (4,"Felix");

        Student [] s = {s2, s4, s1, s3};
        Student [] srichig = {s1, s4, s2, s3};

        Comparator <Student> c = new NameComparator();

        Sortieren.bubbleSort(s, c);
        assertArrayEquals(srichig,s);

    }

    @Test
    void testBubbleSort3(){
        Student s1 = new Student(1,"Andreas");
        Student s2 = new Student (2, "Marie");
        Student s3 = new Student (3,"Felix");
        Student s4 = new Student (4,"Felix");

        Student [] s = {s2, s4, s1, s3};
        Student [] srichig = {s1, s3, s4, s2};

        Comparator <Student> c = new NameMatrikelComparator();

        Sortieren.bubbleSort(s,c);
        assertArrayEquals(srichig,s);

    }


}

