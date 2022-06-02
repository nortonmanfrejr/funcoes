package Exercicio_5;

public class ex5 {


    public static void main(String[] args){

        ex5 fun5 = new ex5();


        System.out.printf("Soma Imposto: %.2f ", fun5.somaImposto(320, 15));
    }
    public ex5(){
        super();
    }


    public double somaImposto(double custo,double taxaImposto){
        return (0.01 * taxaImposto) * custo + custo;
    }
}
