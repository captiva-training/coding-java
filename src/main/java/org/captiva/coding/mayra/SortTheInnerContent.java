package org.captiva.coding.mayra;

public final class SortTheInnerContent {
    private SortTheInnerContent() {

    }

    public static String sortTheInnerContent(final String words) {
        StringBuilder cadena = new StringBuilder(words);
        for (int i = 0; i < cadena.length(); i++) {
            int palabra = cadena.indexOf(" ", i);
            if (palabra < 0) {
                palabra = cadena.length();
            }
            int inicio = i + 1;
            int finP = palabra - 1;
            reverseSortSubChars(cadena, inicio, finP);
            i = palabra;
        }
        return cadena.toString();
    }

    public static void reverseSortSubChars(final StringBuilder cadena, int inicio, int finP) {

        for (int i = inicio; i < finP - 1; i++) {
            for (int j = i + 1; j < finP; j++) {
                if (cadena.charAt(i) < cadena.charAt(j)) {
                    char temp = cadena.charAt(i);
                    cadena.setCharAt(i, cadena.charAt(j));
                    cadena.setCharAt(j, temp);
                }
            }
        }
    }
}
