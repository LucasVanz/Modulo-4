package Aula6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Usuario> bancoDadosUsuarios = new ArrayList<>();
        Usuario usuario = new Usuario("Lucas", Optional.empty(), Optional.empty());
        Usuario usuario1 = new Usuario("Lucas", Optional.of("lucas@gmail.com"), Optional.empty());
        Usuario usuario2 = new Usuario("Lucas", Optional.empty(), Optional.of(19));
        bancoDadosUsuarios.add(usuario);
        usuario.mostrarDetalhes();
        usuario1.mostrarDetalhes();
        usuario2.mostrarDetalhes();
    }
}
