package edu.wctc.eligrow.test;

import edu.wctc.eligrow.Student;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class StudentTest {


    Student John = new Student(18, "John");

    @Test
    public void getAge() {
        assertNotNull("This will return a value", John.getAge());
    }

    @Test
    public void talk() {
        assertNotNull("This will return a value", John.talk());
    }
}