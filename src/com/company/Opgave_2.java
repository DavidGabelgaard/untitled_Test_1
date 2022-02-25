package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Opgave_2 {
    /*
     Den skal modtage 2 ints
     Den retunere den mindste af de 2 ints
     Funktionen gør brug af Math og min funktionen i Math
    */
    public int returnTheSmallestNumber(int a, int b) {

        return Math.min(a, b);
    }
    /*
 Den skal modtage 2 ints
 Den retunere den største af de 2 ints
 Funktionen gør brug af Math og max funktionen i Math
*/
    public int returnTheLargestNumber(int a, int b) {

        return  Math.max(a ,b);
    }
    public int returnTheSmallestNumber(int a, int b , int c) {

        int smalletsOf2 = Math.min(a , b );
        return  Math.min(smalletsOf2 , c );
    }
    public int returnTheLargestNumber(int a, int b , int c) {

        int largestOf2 = Math.max(a , b );
        return  Math.max(largestOf2 , c );
    }
    public int returnTheSmallestNumber( ArrayList<Integer> arrayList    ) {
        Collections.sort(arrayList);
        return arrayList.get(0);
    }

    public int returnTheLargestNumber( ArrayList<Integer> arrayList   ) {

        int largest = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {

            if (largest < arrayList.get(i)) {
                largest = arrayList.get(i);
            }

        }

        return largest;
    }

    public int returnTheSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i : arrayList ){
            sum += i;
        }
        return sum;
    }
    public double returnAverage(ArrayList<Integer> arrayList) {

        double sum = 0;
        for (int i : arrayList ){
            sum += i;
        }


            return  sum / arrayList.size();


    }


}
