import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {
       Endereco end01 = new Endereco();
       Endereco end02 = new Endereco();
       Telefone[] tfs = new Telefone[2];

       Telefone tf1 = new Telefone();
       tf1.setDdd(92);
       tf1.setNumero("99978787");
       tf1.setDesc("Casa");

       Telefone tf2 = new Telefone();
       tf2.setDdd(91);
       tf2.setNumero("45789777");
       tf2.setDesc("Comercial");
       tfs[0] = tf1;
       tfs[2] = tf2;

       Cliente cli01  = new Cliente("Maria de Souza",end01,"maria@gmail.com");
       Cliente cli02  = new Cliente("John Martinelle",end02,"johnjohn@gmail.com");
    
       cli01.setTelefones(tfs); 

       Conta c1 = new Conta(2587,456789, 2000, cli01);
       Conta c2 = new Conta(2587,457894, 1500, cli02); 
        //mostrar dados da composição
       System.out.println(c1.getTitular().getNome());
       System.out.println(c1.getTitular().getEmail());
       System.out.println(c2.getTitular().getNome());
       System.out.println(c2.getTitular().getEmail());
       //Alterar dados da composição
       c1.getTitular().setNome("Mariana de Souza"); 
       System.out.println(c1.getTitular().getNome());
       cli01.setNome("Vanessa de Souza");
       System.out.println(c1.getTitular().getNome());
       //fazer transferência de valores
       c2.transferirSaldo(c1, 150);
       //formatação de saída de valores
       DecimalFormat df = new DecimalFormat("##,##.00");
       //Mostrar resultados da transferência
       System.out.println(c1.getTitular().getNome()+"O saldo atual de R$"+df.format(c1.getSaldo()));
       System.out.println(c2.getTitular().getNome()+"O saldo atual de R$"+df.format(c2.getSaldo()));
       //Mostrar dados representados pelo toString
       System.out.println(c1);
       System.out.println(c2);
       System.out.println(cli01);
       System.out.println(cli02);
    }
}
