package edu.wctc.eligrow.test;

import edu.wctc.eligrow.FileInput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileInputTest {

    FileInput bad;
    FileInput good;

    @Before
    public void setUp() throws Exception {
        bad = new FileInput("bad.txt");
        good = new FileInput("good.txt");
    }

    @Test
    public void fileReadLine() {
        assertNotNull("This should return text", good.fileReadLine());
        assertNull("This should not return text", bad.fileReadLine());
    }



    @After
    public void tearDown() throws Exception {
        bad.fileClose();
        bad.fileClose();
    }
}