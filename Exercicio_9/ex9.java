package Exercicio_9;

import java.util.Scanner;

public class ex9 {


    public void reverse(String n){
        System.out.println(n + " --> "+ new StringBuilder(n).reverse().toString());
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ex9 e = new ex9();
        while(true){

            System.out.println("Insira um numero para invertelo. ( f -- Para encerrar );");
            String numb = sc.next();
            if(numb.equals("f")){
                System.out.println("Encerrando a aplicação.");
                break;
            } else {
                e.reverse(numb);
            }
        }
    }
}
