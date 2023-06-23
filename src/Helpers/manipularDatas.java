package Helpers;

import java.util.Calendar;

public class manipularDatas {
     
    public int mesAtual(){
        Calendar cl = Calendar.getInstance();
        int ma = cl.get(Calendar.MONTH)+1;
        return ma;
    }

    public String dataAtual(){
        Calendar cl = Calendar.getInstance();
        String   hj = cl.get(Calendar.DAY_OF_MONTH)+"/"+(cl.get(Calendar.MONTH)+1)+"/"+cl.get(Calendar.YEAR);
        return hj;
    }

    public int somarMes(int qtdMeses){
         Calendar cl  = Calendar.getInstance();
         cl.add(Calendar.MONTH, qtdMeses);
         int proxMes  = cl.get(Calendar.MONTH)+1;
         return proxMes;
    }
}
