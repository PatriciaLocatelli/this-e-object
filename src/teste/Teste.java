package teste;

import entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Nome do produto: ");
        produto.nome = sc.nextLine();
        System.out.println("Preço do produto: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto.toString());
        System.out.println("Quantidade em estoque " + produto.totalEmEstoque());

        System.out.println("Você quer adicionar quanto no estoque? ");
        int add = sc.nextInt();
        produto.adicionarProdutos(add);
        System.out.println(produto.toString());
        System.out.println("Quantidade em estoque " + produto.totalEmEstoque());

        System.out.println("Você quer remover quanto no estoque? ");
        int remove = sc.nextInt();
        produto.deletarProdutos(remove);
        System.out.println(produto.toString());
        System.out.println("Quantidade em estoque " + produto.totalEmEstoque());


        System.out.println("");
        sc.close();
    }
}
