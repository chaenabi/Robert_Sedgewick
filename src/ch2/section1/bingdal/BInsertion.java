package ch2.section1.bingdal;

import java.util.Date;
import java.util.Scanner;

public class BInsertion extends BSortTemplate {

    @Override
    public void sort(Comparable[] a) {
        int size = a.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                boolean flag = less(a[j], a[j-1]);
                if(flag) {
                    exch(a, j, j-1);
                }
            }
        }
    }
    // E X A M P L E
    // X P M L E E A // 최악
    // X-A P-A M-A L-A E-A E-A  6
    // X-E P-E M-E L-E   4 (+1 : E-E)
    // X-E P-E M-E L-E  4
    // X-L P-L M-L  3
    // X-M P-M   2
    // X-P  1
    // 20(+1) > 14


    public static void main(String[] args) {
        BInsertion insertion = new BInsertion();

        String[] text1 = {"E", "X", "A", "M", "P", "L", "E"};
        long startTime1 = System.nanoTime();
        insertion.sort(text1);
        assert isSorted(text1);

        show(text1);
        long endTime1 = System.nanoTime();
        long elapsed1 = endTime1 - startTime1;
        System.out.println("왼쪽 :: 걸린 시간은 "+elapsed1+ " 밀리초" );



    }
}
