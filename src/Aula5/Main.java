package Aula5;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Teclado", 100.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Notebook", 2500.0, 10)
        );
        System.out.println("\nProdutos que custam mais de 500:");
        produtos.stream().filter(p -> p.getPreco() > 500).forEach(p -> System.out.println(p.getNome()));
        System.out.println("\nPreços dos produtos:");
        produtos.stream().map(Produto::getPreco).forEach(System.out::println);
        System.out.println("\nProduto mais barato:");
        System.out.println(produtos.stream().min(Comparator.comparing(Produto::getPreco)).get().getNome());
        System.out.println("\nProduto com quantidade menor que 10:");
        produtos.stream().filter(p -> p.getQuantidade() < 10).forEach(p -> System.out.println(p.getNome()));
    }
}
