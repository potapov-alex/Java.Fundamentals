package JavaFundamentals;

import java.util.Random;
import java.util.Scanner;

/**
 * @author potap; Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
 */

public class OptTask0104 {
        public static void main(String[] args) {
            System.out.println("ведите кол-во случайных чисел");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < arr.length; i++) {
                Random rnd = new Random();
                arr[i] = rnd.nextInt(1000);
            }
            System.out.println("ваш набор случайных чисел");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            int i,d,m,k;
            m=numDifDig(arr[0]);
            d=arr[0];
            for (i=1; i<arr.length; i++)
            {
                k=numDifDig(arr[i]);
                if (k<m)
                {
                    m=k;
                    d=arr[i];
                }
            }
            System.out.println(" \n минимальный набор различных цифр в числе "+d);
        }

    public static int numDifDig(int n)  {
        int [] d = {0,0,0,0,0,0,0,0,0,0};
        int i ; //, return 0;
        if (n==0) return 1;
        while(n>0)
        {
            i=n%10;
            d[i]++;
            n=n/10;
        }
        int r=0;
        for (i=0; i<10; i++) if (d[i] > 0) r++;
        return r;
    }
}