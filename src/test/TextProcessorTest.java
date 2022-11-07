package test;

import introtoprogramming.TextProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorTest {

    @Test
    public void testAddText() {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.add("Test");
        assertEquals("Test", textProcessor.getRow(0));
    }

    @Test
    public void testCharacterCunt() {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.add("Test");
        assertEquals(4, textProcessor.getCharacterCount());
    }

    @Test
    public void testWordCount() {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.add("Test1 Test2");
        assertEquals(2, textProcessor.getWordCount());
    }

    @Test
    public void testRowCount() {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.add("Test1");
        textProcessor.add("Test2");
        assertEquals(2, textProcessor.getRowCount());
    }

    @Test
    public void testGetLongestWord() {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.add("Test");
        textProcessor.add("Realisationsvinstbeskattning är det längsta ordet.");
        assertEquals("Realisationsvinstbeskattning", textProcessor.getLongestWord());
    }
}