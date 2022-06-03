package Exercicio_12;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex12 {

    public static String embaralhar(String palavra){
        List<Character> letras = palavra.
                chars().
                    boxed().
                        map(c -> (char) c.intValue()).
                            collect(Collectors.toList());
        Collections.shuffle(letras);
        StringBuilder t = new StringBuilder(palavra.length());
        letras.forEach(t::append);
        return t.toString();

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ex12 e = new ex12();
        boolean toContinue = true;

        while(toContinue){
            while(true){

                System.out.println("Digite uma palavra (s para encerrar).");
                String s = sc.next();

                if(s.equals("s")){
                    toContinue = false;
                    break;
                } else {
                    System.out.printf("%s%n", embaralhar(s));
                }

            }
        }
    }
}
