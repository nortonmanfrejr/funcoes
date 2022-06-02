package Exercicio_6;
import java.util.Scanner;

public class ex6 {

        public void convertTime(int h, int m) {

            String a = "AM", p = "PM";
            if((h >= 13 && h <= 24) && (m >= 0 && m <= 60)){
                switch (h){
                    case 13: h = 1; break;
                    case 14: h = 2; break;
                    case 15: h = 3; break;
                    case 16: h = 4; break;
                    case 17: h = 5; break;
                    case 18: h = 6; break;
                    case 19: h = 7; break;
                    case 20: h = 8; break;
                    case 21: h = 9; break;
                    case 22: h = 10; break;
                    case 23: h = 11; break;
                    case 24: h = 12; break;
                }
                System.out.printf("%d:%d %s%n", h, m, p);
            } else if (h < 13) {
                System.out.printf("%d:%d %s%n", h, m, a);
            } else{
                System.out.println("Entrada invalida.");
            }
        }


        public static void main(String[] args){


            Scanner sc = new Scanner(System.in);
            ex6 e = new ex6();

            int hour = 0, minute = 0;

            while(true){

                System.out.printf("Insira a hora (999 para efetuar flag).");
                hour = sc.nextInt();

                if(hour == 999){
                    System.out.printf("Encerrando o conversor de horas.");
                    break;
                } else {

                    System.out.printf("Insira os minutos: ");
                    minute = sc.nextInt();

                    e.convertTime(hour, minute);
                }
            }
        }
}
