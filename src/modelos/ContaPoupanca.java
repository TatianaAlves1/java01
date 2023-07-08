package modelos;
import Helpers.manipularDatas;


public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca() {
        this.taxaRendimento = 0.5;
    }

    public ContaPoupanca(int agencia, int numero, double saldo, Cliente titular, double taxaRendimento) {
        super(agencia, numero, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public ContaPoupanca(int agencia, int numero, Cliente titular, double taxaRendimento) {
        super(agencia, numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }


    public String mostrarRendimento(int qtd){
        manipularDatas md = new manipularDatas();
        String hj     = md.dataAtual();
        int ma        = md.mesAtual();
        int proxMes   = md.somarMes(qtd);
        System.out.println("Próximo mês: "+proxMes);
        double saldoFuturo = super.getSaldo() + (this.taxaRendimento*super.getSaldo());
        String rendimento = "Mês atual: \n"+ ma+" Consulta em: "+hj+"\n Saldo Atual:"+super.getSaldo()+"\nSaldo futuro será: "+saldoFuturo;
        return rendimento;
    }

   

    public static void main(String[] args) {
         ContaPoupanca cp = new ContaPoupanca();
         cp.depositar(2000);
        // cp.sacar(200);
        // cp.depositar(1000);

        System.out.println(cp.mostrarRendimento(1));
    }
}
