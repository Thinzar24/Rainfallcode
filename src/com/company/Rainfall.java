package com.company;

import java.util.Scanner;

public class Rainfall {

    public static void main(String[] args) {
	// write your code here

        double width, height, rainfall;
        Scanner input =new Scanner (System.in);

     System.out.print("Enter Height :");
     height=input.nextDouble();

     System.out.print("Enter Width :");
     width = input.nextDouble();

        System.out.print("Enter Rainfall :");
        rainfall = input.nextDouble();

        double totalRainfall =(width *12)*(height*12)* rainfall/231;
        System.out.print ("The number of gallons is :" + totalRainfall );

    }
}
