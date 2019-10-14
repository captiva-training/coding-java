package org.captiva.coding.Mayra;

public class SpinWords {
    public String spinWords(final String sentence) {
        final int limit = 5;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= limit) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
