public class Produto implements Dao, Estoque{


    private int cod;

    private String descricao;


    @Override
    public void inserir() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void deletar() {

    }

    @Override
    public void baixar() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
