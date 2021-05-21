package sistemabancario;

public class Main {
    public static void main (String args[]){

        ContaCorrente cc = new ContaCorrente(1000, 0101, 001, "BB", 1500);

        ContaPoupanca cp = new ContaPoupanca(500, 0202,002, "BB", 25, 2);

        ContaSalario cs = new ContaSalario(750,0303, 003, "BB", 6);

        Conta contas[] = new Conta [3];

        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cs;

        System.out.println("Obtendo saldo das contas");

        for ( Conta conta : contas ){
            System.out.println(conta);

            System.out.println("Saldo atual  " + conta.getSaldo());
        }
    }
}
