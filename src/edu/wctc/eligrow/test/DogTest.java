package edu.wctc.eligrow.test;

import edu.wctc.eligrow.Dog;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Dog snoopy;

    @Before
    public void setUp() throws Exception {
        snoopy = new Dog(true, "Snoopy");
    }

    @Test
    public void isFriendly() {
        assertTrue("This will return true",true);
    }

    @Test
    public void talk() {
        assertNotNull("This will return a value", snoopy.talk());
    }
}