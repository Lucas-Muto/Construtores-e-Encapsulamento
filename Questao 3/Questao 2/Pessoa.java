package Questao3.Questao2;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimir(){
        System.out.println(nome);
        System.out.println(idade);

    }
    public void aniver(){

        idade=idade+1;
    }


}
