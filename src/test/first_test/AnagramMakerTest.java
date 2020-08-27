package first_test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ru.bolgov.task1.AnagramMaker;

public class AnagramMakerTest {
    private AnagramMaker anagram;

    @Test
    public void testEasy() { 
        anagram = new AnagramMaker();
        assertEquals("j", anagram.makeAnagram("j"));
    }

    @Test
    public void testWithSymbols() { 
        anagram = new AnagramMaker();
        assertEquals("jpo;,vs", anagram.makeAnagram("svo;,pj"));
    }
    
    @Test
    public void testWithSpace() { 
        anagram = new AnagramMaker();
        assertEquals("asdfg hjkl", anagram.makeAnagram("gfdsa lkjh"));
    }
    
    @Test
    public void testUpperCase() { 
        anagram = new AnagramMaker();
        assertEquals("QWERTY", anagram.makeAnagram("YTREWQ"));
    }
    
    @Test
    public void testWithNumbers() { 
        anagram = new AnagramMaker();
        assertEquals("jpo56,vs", anagram.makeAnagram("svo56,pj"));
    }
    
    @Test
    public void testRussian() { 
        anagram = new AnagramMaker();
        assertEquals("‚‡Ó‘›,ﬁ¡ÛÒ", anagram.makeAnagram("‚‡Ó‘›,ﬁ¡ÛÒ"));
    }
    
    @Test
    public void testEmptyInput() { 
        anagram = new AnagramMaker();
        assertEquals("", anagram.makeAnagram(""));
    }
    
    
//TODO testNullInput
    

}
