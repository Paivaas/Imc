package br.senai.sp.jandira.model;

public class Cliente {


    public String nome;
    public String telefone;
    public String email;
    public int idade;

    public Imc imc;

    public void mostarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + imc.peso);
        System.out.println("Altura: " + imc.altura);
        imc.calcularImc();
        System.out.println("");
    }

}
