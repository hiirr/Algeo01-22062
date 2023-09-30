package mylib;
import java.util.Scanner;

public class Util {
    /* Prosedur untuk  */
    // public Matriks createMatriks(){
    //     Scanner inMat = new Scanner(System.in);
    //     System.out.print("Masukkan jumlah baris matriks: ");
    //     int nRows = inMat.nextInt();
    //     System.out.print("Masukkan jumlah kolom matriks: ");
    //     int nCols = inMat.nextInt();
    //     Matriks M = new Matriks(nRows,nCols);
    //     inMat.close();
    //     return M;
    // }

    public void displayMenu(){
        System.out.println("Selamat datang di program pemanfaatan operasi matriks!");
        System.out.println("---------------------MENU-------------------");
        System.out.println("1. Sistem Persamaan Linier");
        System.out.println("2. Determinan");
        System.out.println("3. Invers");
        System.out.println("4. Interpolasi Polinom");
        System.out.println("5. Interpolasi Bicubic Spline");
        System.out.println("6. Regresi Linear Berganda");
        System.out.println("7. Perbesaran Citra");
        System.out.println("8. Keluar");
    }

    public void displayMenuSPL(){
        System.out.println("---------------------MENU SPL-------------------");
        System.out.println("1. Metode Eliminasi Gauss");
        System.out.println("2. Metode Eliminasi Gauss-Jordan");
        System.out.println("3. Metode Matriks Balikan");
        System.out.println("4. Kaidah Cramer");
    }

    public void displayMenuDet(){
        System.out.println("---------------------MENU DETERMINAN-------------------");
        System.out.println("1. Metode Reduksi Baris");
        System.out.println("2. Metode Ekspansi Kofaktor");
    }

    public void displayMenuInvers(){
        System.out.println("---------------------MENU INVERS-------------------");
        System.out.println("1. Metode Matriks Balikan");
        System.out.println("2. Metode Adjoin");
    }


    
}