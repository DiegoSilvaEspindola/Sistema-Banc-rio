package sistemabancario;

public abstract class Conta {

    protected double saldo;
    private int numero;
    private int agencia;
    private String banco;

    public Conta(double saldo, int numero, int agencia, String banco) {
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }


    public abstract double depositar(double quantia);

    public abstract boolean sacar(double quantia);

    public abstract double getSaldo();



    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                ", agencia=" + agencia +
                ", banco='" + banco + '\'' +
                '}';
    }


}
