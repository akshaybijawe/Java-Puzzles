package com.nupurjaiswal.problems;

public class PrimeNumberOnetoHundred {


    public static void main(String[] args) {


        int i, j, isPrime, n;
        System.out.println("All prime number between 1 to 100");

        for (i = 2; i <= 100; i++) {

            isPrime = 0;

            for (j = 2; j <= i / 2; j++) {


                if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0) {
                System.out.println(i + " ");
            }


        }


    }


}