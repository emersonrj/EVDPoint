
package calculahora;

public class CalculaHora {
    public static void main(String[] args) {
        
      // Apontamento das horas marcadas!
        int hora1 = 10, minuto1 = 30;
        int hora2 = 14, minuto2 = 30;

        
      // Entrada de banco de horas.
        int bhdia = 0, bmdia = 0;
        
      // Horas a compensar no dia!
        int horascomp = 4;
        long hrcompConv = (horascomp)*60;
        
      // Calculo da entrada dos 2 turnos!        
        long entManha = (((hora2*60)+minuto2)-((hora1*60))-minuto1);
//        long entTarde = (((hora4*60)+minuto4)-((hora3*60))-minuto3);
      
      // Calculo da compensação do dia!
        long horaDia = ((entManha)-hrcompConv)/60;
        long minDia = ((entManha)-hrcompConv)%60;
        
      // Total do banco de horas!   
        long bHd = (bhdia+horaDia)*60;
        long bMd = (bmdia+minDia);
        long bancoHora = (bHd+bMd)/60;
        long bancoMin = (bHd+bMd)%60;
      
      // Horas realizadas no dia!  
        System.out.println(horaDia+":"+minDia);
     
      // Banco de horas!
        System.out.println(bancoHora+":"+bancoMin);
        



        
//         System.out.println(horaDia);
//         System.out.println(minDia);

         
                       
         
         
         
         
         
         
//        int segundo1 = 20;
//        int segundo2 = 20;
//        int segundo3 = 30;
//        int segundo4 = 00;
        
        
//        long totalSegundos = (segundo1+segundo2)+(segundo3+segundo4);
//        long segundoAtual = totalSegundos%60;

//        long cadHpositiva = 0;
//        long cadMpositivo = 0;
//        long cadHnegativa = 10;
//        long cadMnegativo = 55;
        
//        long totalMinuto = (minuto1+minuto2)+(minuto3+minuto4);
//        long minutoAtual = totalMinuto%60;
//        
//        long totalHora = (((hora2-hora1)+(hora4-hora3))*60);
//        long horaAtual = ((totalHora+totalMinuto)/60)- horascomp;

       
         
        
//        long totalMinuto = (minuto1+minuto2)+(minuto3+minuto4);
//        long totalHora = (((hora2-hora1)+(hora4-hora3))*60);
//        
//        
//        long hrcompConv = (horascomp)*60; 
//        long totHcomp = (totalHora+totalMinuto)/60;
//        long totMcomp = (totalHora+totalMinuto)%60;
//        
//        long bancoHoras = ((totalHora+totalMinuto)-hrcompConv)/60;
//        long bancoMin = ((totalHora+totalMinuto)-hrcompConv)%60;
        
        
                  
        
        
//        System.out.println(totHcomp);
//        System.out.println(totMcomp);
//        System.out.println(totalSegundos);
//        System.out.println(segundoAtual);
//        System.out.println(totalMinuto);
//        System.out.println(minutoAtual);
//        System.out.println(totalHora);
//        System.out.println(horaAtual);
//        System.out.println(bancoHoras);
//        System.out.println(entManha);
//        System.out.println(horaDia);
//        System.out.println(minDia);
        
        
        
//        System.out.println(totHcomp+":"+totMcomp);
//        System.out.println(bancoHoras+":"+bancoMin);
//        System.out.println(horaDia+":"+minDia);
        
    }
   
    
}
