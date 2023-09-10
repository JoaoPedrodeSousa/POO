package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        if (!(1 <= t && t <= 4)){
            System.out.println("O numero informado deve estar entre 1 e 4");
            throw new RuntimeException();
        }
        System.out.println("Digite as entradas: ");
        int a;
        a = sc.nextInt();
        int b;
        b = sc.nextInt();
        int c;
        c = sc.nextInt();
        int d;
        d = sc.nextInt();

        int[] list = new int[4];

        for(int i = 0; i<4; i++){
            list[i] =
        }
    }
}
