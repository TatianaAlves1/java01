package teste;

import java.util.Scanner;

public class TesteArray {
    public static void main(String[] args) {
        String [] pc = {"Memória","processador","cooler"};
        System.out.println(pc[0]);

        for (String b : pc) {
            System.out.println(b);
        }

        String[] nomes = new String[2];
        nomes[0] = "Tatiana";
        nomes[1] = "Camila";
        //nomes[2] = "Bombom";
        System.out.println("Total de itens no array "+nomes.length);

        Double[] notas = new Double[5];
        int i = 0;
        notas[0] = 4.1;
        Scanner sc = new Scanner(System.in);
           while(i<notas.length){
            System.out.println("Informe uma nota:");
            notas[i] = sc.nextDouble();
            i++;
        }
        sc.close();
        for (Double nts : notas) {
            System.out.println(nts);
        }
    }
}
