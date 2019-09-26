package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int h = 0;
         h = a / 3600;
         int m = 0;
         m = a% 3600;
        m = m/60;
        int s =0;
         s = a%3600;
        s = s % 60;

        int i = 0;
        if (h>=24){
            h = h % 24;
        }
        if (m<=9) {
            if (s<=9) {
                System.out.println(h+":"+i+""+m+ ":"+i+""+s);
                System.exit(0) ;
            }


            System.out.println(h+":"+i+""+m+ ":"+s);
            System.exit(0);

        } else if (s<=9){
            System.out.println(h+":"+m+ ":"+i+""+s);
            System.exit(0);
        }
        System.out.println(h+":"+m+ ":"+s);

    }
}
