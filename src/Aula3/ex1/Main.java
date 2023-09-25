package Aula3.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Main {
        public static double calcular(List<Produto> compras, Function<Produto, Double> funcao){
            double totalCompras = 0.0;
            for (Produto produtos:compras) {
                totalCompras += funcao.apply(produtos);
            }
            return totalCompras;
        };
        public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(0, new Produto("maça", 5.0));
        produtos.add(1, new Produto("leite", 8.0));
        produtos.add(2, new Produto("agua", 3.5));
        double precoTotal = calcular(produtos, (Produto produto) -> produto.getPreco());
        System.out.println("Preço total é " + precoTotal);
    }

}
