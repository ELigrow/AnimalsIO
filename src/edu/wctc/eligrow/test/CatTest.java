package edu.wctc.eligrow.test;

import edu.wctc.eligrow.Cat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat tom;
    @Before
    public void setUp() throws Exception {
        Cat tom = new Cat(12, "Tom");
    }

    @Test
    public void getMousesKilled() {
        assertNotNull("This will return a value", tom.getMousesKilled());
    }

    @Test
    public void talk() {
        assertNotNull("This will return a value", tom.talk());
    }
}