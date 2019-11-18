package org.captiva.coding.favio;

public final class Complementarydna {

    private Complementarydna() {
    }

    public static String makeComplement(final String dna) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (dna.charAt(i) == 'T') {
                a.append('A');
            }
            if (dna.charAt(i) == 'A') {
                a.append('T');

            }
            if (dna.charAt(i) == 'C') {
                a.append('G');
            }
            if (dna.charAt(i) == 'G') {
                a.append('C');
            }
        }
        return a.toString();

    }
}
