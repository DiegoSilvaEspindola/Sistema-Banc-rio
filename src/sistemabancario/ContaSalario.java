package sistemabancario;

public class ContaSalario extends Conta {
    private int qunatiaDeSaque;

    public ContaSalario(double saldo, int numero, int agencia, String banco, int qunatiaDeSaque) {
        super(saldo, numero, agencia, banco);
        this.qunatiaDeSaque = qunatiaDeSaque;
    }

    @Override
    public boolean sacar(double quantia) {
        while (this.qunatiaDeSaque > 0) {
            if (quantia <= this.saldo) {
                this.saldo -= quantia;
                System.out.println("Saque realizado");
                this.qunatiaDeSaque--;
                return true;

            } else {
                System.out.println("Quantia indisponivel para saque");
                return false;
            }
        }
        return true;
    }

    @Override
    public double depositar(double quantia){
        return this.saldo += quantia;

    }



    @Override
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "qunatiaDeSaque=" + qunatiaDeSaque +
                ", saldo=" + saldo +
                '}';
    }
}
