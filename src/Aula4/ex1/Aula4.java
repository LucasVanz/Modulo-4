package Aula4.ex1;

import java.util.List;

public class Aula4 {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos"),
                new Produto("Camisa", "Vestuário"),
                new Produto("Smartphone", "Eletrônicos"),
                new Produto("Tênis", "Calçados") );


        produtos.stream().filter(p -> p.getCategoria().equalsIgnoreCase("Vestuário")).forEach(p -> System.out.println(p.getNome()));
    }
}
