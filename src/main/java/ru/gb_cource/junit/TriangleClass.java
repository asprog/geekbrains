package ru.gb_cource.junit;

public class TriangleClass {
    public static void main(String[] args) {
        int a = 3,b = 4, c = 5;
        System.out.printf("%.1f",theArea(poluperimetr(a,b,c),a,b,c));

    }
     public static int poluperimetr(int a, int b, int c){
      return (a+b+c)/2;
    }
     public static double theArea(double poluperimetr,int a,int b,int c) {
      return Math.sqrt(poluperimetr*(poluperimetr-a)*(poluperimetr - b)*(poluperimetr - c));
    }

}
