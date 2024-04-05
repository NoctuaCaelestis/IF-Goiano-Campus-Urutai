import com.sun.jdi.ObjectCollectedException;

import java.util.Scanner;

class Estaticus {
    Scanner yuu = new Scanner(System.in);
    private int size;
    Object [] listes;
    public Estaticus(int size) {
        this.size = size;
        this.listes = new Object[size];
    }
    void populates (int size) {
        for (int y = 0; y < size; y++) {
             listes[y] = yuu.nextLine();
        }
    }
    void prints () {
        for (int y = 0; y < listes.length; y++) {
            if (listes[y] != null)
                System.out.println((y + 1) + "° elements: " + listes[y] + ".");
        }
    }
    void invert () { //Escreva um método que inverte a ordem dos nodos de uma lista estática (a primeira passa a ser última, segunda passa a ser penúltima etc.).
        Object aux;
        int x = 0;
        while (x < size && listes[x] != null) {x++;}
        for (int y = 0, w = x - 1; y < (int) x/2; y++, w--){
            aux = listes [y];
            listes [y] = listes[w];
            listes [w] = aux;
        }
    }

    void strsbstr () {
        int i1 = -1, i2 = -1, y, w = 0;
        boolean check = false;
        Object [] l2;
        String substring = yuu.nextLine();
        for (int x = 0; x < listes.length; x++) {
            if (listes[x].equals(substring.charAt(0)) && !check) {
                i1 = x;
                y  = x;
                while (listes[y].equals(substring.charAt(y)) && y < substring.length()) {
                    if (y == substring.length()-1) {
                        i2 = y;
                        check = true;
                    }
                    y++;
                }
            }
        }
        if (check) {
            l2 =  new Object[substring.length()];
            while (i1 != i2) {
                l2[w] = listes[i1];
                System.out.print(l2[w]);
                w++;
                i1++;
            }
        }
    }
}