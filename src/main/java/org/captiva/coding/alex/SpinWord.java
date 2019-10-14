package org.captiva.coding.alex;

public class SpinWord {
    public String spinWords(final String sentence) {
        String[] words = sentence.split(" ");
        final int limit = 5;
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() >= limit) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
