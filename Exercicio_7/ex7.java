package Exercicio_7;

import java.util.*;

public class ex7 {

    public double valuePayment(double value, int daysDelay){
        if(daysDelay > 0){
            value += value * 0.03 + (value * (0.001 * daysDelay));
        }
        return value;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Date actualDate = new Date();
        ex7 e = new ex7();
        List<Double> payments = new ArrayList<Double>();

        double sumPayments = 0;
        while(true){
            System.out.print("Value of payment: ");
            double payment = sc.nextDouble();

            if(payment == 0){
                break;
            } else {
                System.out.printf("%nDays in delay: ");
                int daysDelay = sc.nextInt();

                double value = e.valuePayment(payment, daysDelay);
                payments.add(value);

                sumPayments += value;
                }
            }

        System.out.println("\n" + actualDate.toString());
        System.out.println("Amount of payment - Total");
        System.out.printf(Locale.US,"%17d - R$%.2f", payments.size(), sumPayments);
        }

    }

