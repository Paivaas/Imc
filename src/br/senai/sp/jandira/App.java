package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Imc;

public class App {
    public static void main(String[] args) {

        Imc i1 = new Imc();
        i1.altura = 1.74;
        i1.peso = 78.0;

        Imc i2 = new Imc();
        i2.altura = 1.50;
        i2.peso = 74;

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        c1.nome = "Julia Paiva";
        c1.email = "Julia@email.com";
        c1.telefone = "(11)4588-2290";
        c1.idade = 18;
        c1.imc = i1;

        c2.nome = "Loira";
        c2.email = "Loira@email.com";
        c2.telefone = "(11)4588-2290";
        c2.idade = 17;
        c2.imc = i2;

        c3.nome = "Ryan";
        c3.email = "Ryan@email.com";
        c3.telefone = "(11)4588-2290";
        c3.idade = 16;
        c3.imc = i2;

        c1.mostarDados();
        c2.mostarDados();
        c3.mostarDados();

    }
}
