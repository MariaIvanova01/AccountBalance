package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        String input = scan.nextLine();
        double totalMoney = 0.0;
        while(true){
            if(input.equals("NoMoreMoney")){
                break;
            }
            double price = Double.parseDouble(input);
            if (price < 0){
                System.out.printf("Invalid operation! %n");
                break;
            }else{
                totalMoney += price;
                System.out.printf("Increase: %.2f %n", price);
            }

            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
