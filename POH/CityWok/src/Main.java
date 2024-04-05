import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Object> N = new ArrayList<>();
        Newer n = new Newer ("Kueh");
        N.add(n.emitirSom());
        n = new Newer("Kah Kah");
        N.add(n.emitirSom());
        System.out.print(N);
    }
}