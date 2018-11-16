package com.rizan;

public class Main {

    public static void main(String[] args) {
        //panggil class
        interpolasi li = new interpolasi();

        //input data dalam bentuk array
        double[] x = new double[]{10, 20, 30, 40, 50, 60, 70};
        double[] y = new double[]{120, 322, 643, 997, 1232, 1558, 1721};
        double[] xi = {35};

        //panggil fungsi interpLiner dan hasilnya langsung dimasukkan ke array hasil
        double[] hasil = li.interpLinear(x,y,xi);

        //cetak hasil
        for (int i = 0; i < hasil.length; i++)
            System.out.println(hasil[i]);
    }
}
