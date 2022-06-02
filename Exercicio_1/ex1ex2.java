package Exercicio_1;

import java.util.Scanner;

public class ex1ex2 {

    Scanner sc = new Scanner(System.in);
    public ex1ex2(){
        super();
    }

    public void impress(int n){
        System.out.println("EX1 or EX2?: ");
        String choice = sc.nextLine();


        if(choice.equals("EX2")){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.printf("%d ", j);
                }
                System.out.println();
            }
        } else if (choice.equals("EX1")) {
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.printf("%d ", i);
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR 404");
        }
    }
}
