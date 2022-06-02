package Exercicio_3;

public class ex3 {


    public ex3(){
        super();
    }

    public int soma(int x, int y, int z){
        return x+y+z;
    }

    public static void main(String[] args){


        ex3 fun3 = new ex3();

        System.out.printf("args = %d", fun3.soma(3,1,5));
    }
}
