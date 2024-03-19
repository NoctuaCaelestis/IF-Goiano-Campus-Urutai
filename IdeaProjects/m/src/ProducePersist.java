import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ProducePersist extends Produto{
        public String gravar() {
            String res = "Produto armazenado com sucesso!";
            try {
                FileOutputStream file = new FileOutputStream("C:\\Users\\2023101202010001\\IdeaProjects\\m\\Produto" + this.getCod());
                ObjectOutputStream stream = new ObjectOutputStream(file);
                stream.writeObject(this);
                stream.flush();
            } catch (Exception e) {
                res = "Falha na gravação\n " + e.toString();
            }
            return res;
        }

        public static Produto ler(int cod) {
            try {
                FileInputStream file = new FileInputStream("C:\\Users\\2023101202010001\\IdeaProjects\\m\\Produto" + cod);
                ObjectInputStream stream = new ObjectInputStream(file);
                return ((Produto) stream.readObject());
            } catch (Exception e) {
                System.out.print("Falha na leitura \n " + e.toString());
                return null;
            }
        }
}
