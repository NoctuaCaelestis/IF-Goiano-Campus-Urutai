public class Main {
    public static void main (String [] args){
        ProducePersist produto = new ProducePersist();
        produto.setCod(2);
        produto.setDescricao("Banana");
        System.out.println(produto.gravar());

        Produto p = ProducePersist.ler(2);
        if (p != null) {System.out.println(p.getCod());}
        if (p != null) {System.out.println(p.getDescricao());}

    }
}
