/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

/**
 *
 * @author User
 */
public class MultiThread implements Runnable {
    public static void main(String[] args){
        Thread MThread1 = new Thread("Percobaan 1");
        Thread MThread2 = new Thread("Percobaan 2");
        Thread MThread3 = new Thread("Percobaan 3");
        MThread1.start();
        MThread2.start();
        MThread3.start();
        System.out.println("MULTITHREAD SEDANG JALAN NIH");
        System.out.println(MThread1.getName());
        System.out.println(MThread2.getName());
        System.out.println(MThread3.getName());
    }
    
    public void run() {}
}
