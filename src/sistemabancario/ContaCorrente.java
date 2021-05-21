package sistemabancario;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(double saldo, int numero, int agencia, String banco, double chequeEspecial) {
        super(saldo, numero, agencia, banco);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double quantia){
        double disponivel = this.saldo + this.chequeEspecial;
        if(quantia <= disponivel){
            this.saldo -= quantia;
            System.out.println("Saque realizado");
            return true;

        }else{
            System.out.println("Saldo insuficiente !");
            return false;
        }
    }



    @Override
    public double getSaldo(){
        return this.saldo + this.chequeEspecial;
    }

    @Override
    public double depositar(double quantia){
        return this.saldo += quantia;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                ", saldo=" + saldo +
                '}';
    }
}
