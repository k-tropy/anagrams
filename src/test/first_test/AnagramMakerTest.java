package first_test;
package;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnagramMakerTest {
    private AnagramMaker anagram;

    @Before
    public void initTest() {
        anagram = new AnagramMaker();
    }

    @After
    public void afterTest() {
        anagram = null;
    }

    @Test
    public void testMakeAnagramEasy() {
        // assertEquals("asdvcl;", anagram.makeAnagram("skwalc;"));
        assertEquals("j", anagram.makeAnagram("j"));
    }

    @Test
    public void testMakeAnagram() {
        assertEquals("jpo;,vs", anagram.makeAnagram("svo;,pj"));
    }

}
