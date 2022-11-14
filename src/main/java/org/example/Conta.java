package org.example;

public abstract class Conta implements ICONTA{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino ) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirAtributos() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }
}
