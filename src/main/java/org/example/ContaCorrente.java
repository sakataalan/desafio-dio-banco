package org.example;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("---\tExtrato Conta Corrente---\t");
        imprimirAtributos();
    }
}
