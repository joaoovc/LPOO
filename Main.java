import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Entre com os dados do Produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.println("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade: ");
        produto.qtd = sc.nextInt();
        System.out.println();

        System.out.println("Dados do Produto: " + produto);

        System.out.println("Insira a quantidade de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);
        System.out.println("Dados Atualizados: " + produto);

        System.out.println("Insira a qtd de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);
        System.out.println("Dados Atualizados: " + produto);
    }
}
