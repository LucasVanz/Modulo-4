package Aula6;

import java.util.Optional;

public class Usuario {

    private String nome;
    private Optional<String> email;
    private Optional<Integer> idade;


    public Usuario(String nome, Optional<String> email, Optional<Integer> idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public Optional<Integer> getIdade() {
        return idade;
    }

    public void setIdade(Optional<Integer> idade) {
        this.idade = idade;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        if (email.isPresent()){
            System.out.println("Email: " + email);
        }
        if (idade.isPresent()){
            System.out.println("Idade: " + idade);
        }
    }
}

