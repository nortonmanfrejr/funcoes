package Exercicio_4;

public class ex4 {

    public static void main(String[] args){


        ex4 fun4 = new ex4();

        System.out.println(fun4.negPos(-2));
        System.out.println(fun4.negPos(6));
    }

    public ex4(){
        super();
    }

    public String negPos(int x){
        if(x <= 0){
            return "N";
        }
        else {
            return "P";
        }
    }
}
