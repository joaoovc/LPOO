public class Produto {
    String nome;
    double preco;
    int qtd;

    double totalValorEstoque(){
        return preco * qtd;
    }

    void addProduto(int qtd){
        this.qtd += qtd;
    }

    void removerProduto(int qtd){
        this.qtd -= qtd;
    }
    public String toString() {
        return "\nNome do Produto: " + nome
                + ", Preço: R$" + String.format("%.2f",preco)
                + ", Quantidade: " + qtd + " unidades. "
                +  "Total do Estoque = R$" + String.format("%.2f,",totalValorEstoque());
    }
}
