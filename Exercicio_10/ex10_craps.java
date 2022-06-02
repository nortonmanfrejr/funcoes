package Exercicio_10;


import java.util.Random;

public class ex10_craps {

    public int dados(){
        Random gerador1 = new Random();
        Random gerador2 = new Random();
        return gerador1.nextInt(6 + 1) + gerador2.nextInt(6 + 1);
    }

    public static void main(String[] args){

        ex10_craps e = new ex10_craps();

        int count = 0, pontos = 0;

        while(true){

            int valor = e.dados();
            count++;
            System.out.printf("%dº Jogo.%n", count, pontos);



            if(count == 1){
                if(valor == 7 || valor == 12){
                    System.out.printf("%d foi rodado.%n-------%nGanhador Natural.", valor);
                    break;
                } else if (valor == 2 || valor == 3 || valor == 12) {
                    System.out.printf("CRAPS, %d rodado você perdeu.%n-------%n", valor);
                    break;
                } else {
                    System.out.printf("-------%n%d é o seu ponto.%n-------%n", valor);
                    pontos = valor;
                }
            } else {
                if(valor == 7){
                    System.out.printf("Você tirou %d, perdeu.%n-------%n", valor);
                    break;
                } else if (valor == pontos) {
                    System.out.printf("Você atingiu seu ponto %d novamente, você ganho.%n-------%n", pontos);
                    break;
                } else{
                    System.out.printf("%d foi rodado.%n-------%n", valor);
                }
            }
        }
    }
}
