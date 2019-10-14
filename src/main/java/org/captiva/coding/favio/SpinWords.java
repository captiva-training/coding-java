package org.captiva.coding.favio;

public class SpinWords {
    public String spinWords(final String sentence) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            final int limite = 5;
            if (words[i].length() >= limite) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
