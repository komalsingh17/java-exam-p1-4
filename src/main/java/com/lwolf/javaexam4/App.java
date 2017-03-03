package com.lwolf.javaexam4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int n = 0, result = 0;
        String operation = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter n ( > 0 ): ");
            n = Integer.parseInt(reader.readLine());
            while (n < 1) {
                System.out.println("n must be greater than 0");
                System.out.print("Enter n ( > 0 ): ");
            }

            System.out.print("Compute\n'sum' or 'product': ");
            operation = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (operation) {
            case "sum":
                result = computeSum(n);
                break;
            case "product":
                result = computeProduct(n);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.println(result);
    }

    private static int computeSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static int computeProduct(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
