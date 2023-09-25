package Aula4.ex2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Smartphone", 1200.0),
                new Produto("Camisa", 50.0),
                new Produto("Tênis", 150.0),
                new Produto("Notebook", 2500.0)
        );

       Optional<Produto> maisCaro = produtos.stream().max(Comparator.comparing(Produto::getPreco));

        if (maisCaro.isPresent()){
            System.out.println(maisCaro.get().getNome());
        }
    }
}
