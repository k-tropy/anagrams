package first_test;


import static org.junit.Assert.*;

import org.junit.Test;

import ru.bolgov.task1.AnagramMaker;

public class AnagramMakerTest {
    private AnagramMaker anagram;

    @Test
    public void testOneLetter() { 
        anagram = new AnagramMaker();
        assertEquals("j", anagram.makeAnagram("j"));
    }
    
    @Test
    public void testSameLetters() { 
        anagram = new AnagramMaker();
        assertEquals("sdfjjjjjjjj", anagram.makeAnagram("jjjjjjjjfds"));
    }

    @Test
    public void testWithSymbols() { 
        anagram = new AnagramMaker();
        assertEquals("jpo;,vs", anagram.makeAnagram("svo;,pj"));
    }
    
    @Test
    public void testJustSymbols() { 
        anagram = new AnagramMaker();
        assertEquals(";,$%@^", anagram.makeAnagram(";,$%@^"));
    }
    
    @Test
    public void testLowerCase() { 
        anagram = new AnagramMaker();
        assertEquals("asdfg", anagram.makeAnagram("gfdsa"));
    }
    
    @Test
    public void testUpperCase() { 
        anagram = new AnagramMaker();
        assertEquals("QWERTY", anagram.makeAnagram("YTREWQ"));
    }
    
    @Test
    public void testDifferentRegistries() { 
        anagram = new AnagramMaker();
        assertEquals("zxcvQWERTY", anagram.makeAnagram("YTREWQvcxz"));
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
    
    @Test
    public void testSpace() { //How it should be with only one space
        anagram = new AnagramMaker();
        assertEquals("", anagram.makeAnagram(" "));
    }
    
    @Test
    public void testMultipleSpaces() { //How it should be with multiple spaces 
        anagram = new AnagramMaker();
        assertEquals("", anagram.makeAnagram("     "));
    }
    
    @Test
    public void testWithMultipleSpaces() { //How it should be with multiple spaces 
        anagram = new AnagramMaker();
        assertEquals("xcfb    sedgf", anagram.makeAnagram("bfcx    fgdes"));
    }
    
    @Test
    public void testMultipleWords() { 
        anagram = new AnagramMaker();
        assertEquals("asdfg hjkl", anagram.makeAnagram("gfdsa lkjh"));
    }

    
//TODO testNullInput
    

}
