package Exercicio_8;

import java.util.*;

public class ex8 {

    public void tamanhoDigito(String n){
        System.out.printf("O numero --> %s, tem %d caracteres.%n", n, n.length());
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ex8 e = new ex8();


        String num;
        while(true){

            System.out.println("Insira um numero para testa-lo ( - Para encerrar ).");
            num = sc.next();
            if(num.equalsIgnoreCase("-")){
                System.out.printf("Encerrando a aplicação.");
                break;
            } else {
                e.tamanhoDigito(num);
            }

        }
    }
}
