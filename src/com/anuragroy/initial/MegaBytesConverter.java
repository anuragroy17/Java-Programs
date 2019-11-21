package com.anuragroy.initial;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-1);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes>=0) {
            int KB = kiloBytes % 1024;
            int MB = kiloBytes/1024;
            System.out.println(kiloBytes + " KB = " + MB + " MB and "+KB+" KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
