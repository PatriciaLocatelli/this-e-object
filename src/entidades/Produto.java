package entidades;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public int totalEmEstoque() {
        return this.quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void deletarProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + " Preço = " + preco +
                " Quantidade = " + quantidade;
    }
}
