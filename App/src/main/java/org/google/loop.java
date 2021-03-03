package org.google;

import java.sql.SQLOutput;

public class loop {
    /*
    public static void main (String[] args)
    {
        //Bài 1: Viết method tính tổng các số chẵn từ 1 đến 100;
/*
        int tong=0;
        for (int i = 1; i < 100; i++) {
            if(i%2==0) {
                tong = tong + i;
            }
        }
        System.out.println(tong);

 */
        //Bài 2: Viết method tính tổng các số từ 1 đến 100 mà chia hết cho 3
        /*
        int tong=0;
        for (int i = 1; i < 100; i++) {
            if(i%3==0) {
                tong = tong + i;
            }
        }
        System.out.println(tong);

         */

/*
//Bài 3: Viết method nhận vào một số sau đó tỉnh tổng các số nhỏ hơn số đó.
    public static void main (String[] args)
    {
        int tong =tinhtong(100);
        System.out.println(tong);
    }
    public static int tinhtong (int input)
    {
        int tong = 0;
        int NUM = input;
        // cách 1
        for (int i = 0; i < input; i++) {
            tong=tong+i;
        }
         //cách 2
        /*
        int i=0;
        while (i<input)
        {
            tong=tong+i;
            i++;
        }

         */
        // cách 3
        /*
        int i=0;
        do {
            tong=tong+i;
            i++;
        }while (i<input);

         */
    /*
        return tong;
    }
    */
/*
    //Bài 4: Viết method nhận vào một số sau đó kiểm tra xem số đó có phải là số nguyên tố không?
    public static void main (String[] args)
    {
        boolean snt =checksonguyento(2);
        System.out.println(snt);
    }
    public static boolean checksonguyento (int input)
    {
        int num = input;
        if (num <2) {
            return false;
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
 */
    //Bài 5: Viết method tính tổng tất cả các số nguyên tố có 2 chữ số sử dụng method viết ở bài 4.
    public static void main (String[] args)
    {
        int tongsonguyento = tinhtongsonguyento();
        System.out.println("Tong các so nguyen to có 2 chu so nho hon 100 la "+tongsonguyento);
    }
    public static int tinhtongsonguyento()
    {
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if (checksonguyento(i)) {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static boolean checksonguyento (int input)
    {
        int num = input;
        if (num <2) {
            return false;
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
