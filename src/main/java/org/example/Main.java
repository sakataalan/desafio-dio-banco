package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco bancoTeste = new Banco();
        List<Cliente> contas = new ArrayList<>();
        bancoTeste.setNome("Banco Teste");

        Cliente gerson = new Cliente("Gerson");
        Cliente denilson = new Cliente("denilson");
        Cliente jonas = new Cliente("jonas");

        contas.add(gerson);
        contas.add(denilson);
        contas.add(jonas);

        bancoTeste.setClientes(contas);

        Conta ccGerson = new ContaCorrente(gerson);
        Conta poupancaGerson = new ContaPoupanca(gerson);

        Conta ccDenilson = new ContaCorrente(denilson);
        Conta poupancaDenilson = new ContaPoupanca(denilson);

        Conta ccJonas = new ContaCorrente(jonas);
        Conta poupancaJonas = new ContaPoupanca(jonas);

        ccGerson.depositar(100);
        ccGerson.imprimirExtrato();

        ccGerson.transferir(50, poupancaDenilson);
        ccGerson.imprimirExtrato();
        poupancaDenilson.imprimirExtrato();


        poupancaDenilson.transferir(25, ccJonas);
        poupancaDenilson.imprimirExtrato();
        ccJonas.imprimirExtrato();


        for (Cliente cliente : bancoTeste.getClientes()) {
            System.out.println(cliente.getNome());
        }
    }
}