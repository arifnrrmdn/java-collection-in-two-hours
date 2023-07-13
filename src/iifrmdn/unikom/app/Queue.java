package iifrmdn.unikom.app;

import java.util.PriorityQueue;

public class Queue {

    public static void main(String[] args){

        PriorityQueue<String> judul_lagu = new PriorityQueue<>();

        judul_lagu.offer("Seperti Rahim Ibu");
        judul_lagu.offer("Sebelah Mata");
        judul_lagu.offer("Desember");
        judul_lagu.offer("Di Udara");

        System.out.println("Queue Setelah offer()");
        for(String lagu : judul_lagu){
            System.out.println(lagu);
        }

        System.out.println("\nOperasi peek()");
        System.out.println(judul_lagu.peek());

        System.out.println("\nSetelah Operasi peek() data tidak hilang");
        for(String lagu : judul_lagu){
            System.out.println(lagu);
        }

        System.out.println("\nOperasi pool()");
        System.out.println(judul_lagu.poll());

        System.out.println("\nSetelah Operasi poll() data hilang");
        for (String lagu : judul_lagu){
            System.out.println(lagu);
        }

    }

}
