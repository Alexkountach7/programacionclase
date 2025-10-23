package org.example;

import java.util.Scanner;

public class impar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<20; i++){
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
