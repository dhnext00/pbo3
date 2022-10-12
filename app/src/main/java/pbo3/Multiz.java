/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

/**
 *
 * @author User
 */
public class Multiz extends Thread{
    public void run(){
        System.out.println("thead extends is running");
    }
    public static void main(String args[]){
        Multiz t1 = new Multiz();
        t1.start();
    }
}
