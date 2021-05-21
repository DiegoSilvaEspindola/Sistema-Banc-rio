package sistemabancario;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(double saldo, int numero, int agencia, String banco, int diaAniversario, double taxaJuros) {
        super(saldo, numero, agencia, banco);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getSaldo(){
        return this.saldo + this.saldo*taxaJuros;
    }

    @Override
    public boolean sacar(double quantia){
        if (quantia <= this.saldo){
            this.saldo -= quantia;
            System.out.println("Saque realizado");
            return true;
        }else {
            System.out.println("Quantia indisponivel para saque");
            return false;
        }
    }

    @Override
    public double depositar(double quantia){
        return this.saldo += quantia;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaJuros=" + taxaJuros +
                ", saldo=" + saldo +
                '}';
    }
}
