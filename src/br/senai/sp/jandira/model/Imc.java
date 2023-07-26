package br.senai.sp.jandira.model;

public class Imc {
    public double peso;
    public double altura;

    public void calcularImc(){

        double valorImc = peso/ Math.pow(altura, 2);
        System.out.println("Imc: " + String.format("%.2f", valorImc));
    }

}
