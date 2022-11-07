package introtoprogramming;

import java.util.ArrayList;
import java.util.List;

public class TextProcessor {

    private boolean stop = false;
    private List<String> texts;

    public TextProcessor() {
        texts = new ArrayList<>();
    }

    public boolean isStop() {
        return stop;
    }

    public void add(String text) {
        if (text.contains("stop")) {
            stop = true;
        } else {
            texts.add(text);
        }
    }

    public String getRow(int index) {
        return texts.get(index);
    }

    public int getCharacterCount() {
        int count = 0;
        for (String text : texts) {
            for (Character c : text.toCharArray()) {
                if (!Character.toString(c).equals(" ")) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getWordCount() {
        int count = 0;
        for (String text : texts) {
            String[] words = text.split(" ");
            count += words.length;
        }
        return count;
    }

    public int getRowCount() {
        return texts.size();
    }

    public String getLongestWord() {
        String longestWord = "";
        int longestCount = 0;
        for (String text : texts) {
            String[] words = text.split(" ");
            for (String word : words) {
                if (word.length() > longestCount) {
                    longestCount = word.length();
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}