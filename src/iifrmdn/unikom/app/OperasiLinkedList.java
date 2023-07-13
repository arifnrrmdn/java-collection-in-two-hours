package iifrmdn.unikom.app;

import java.util.LinkedList;

public class OperasiLinkedList {

    public static void main(String[] args){

        LinkedList<String> judul_lagu = new LinkedList<>();

        judul_lagu.addFirst("Seperti Rahim Ibu");
        judul_lagu.addFirst("Sebelah Mata");
        judul_lagu.addLast("Desember");
        judul_lagu.addLast("Di Udara");
        judul_lagu.addFirst("Kesepian");

        System.out.println("Linkedlist judul_lagu setelah addfirst dan addlast");
        for(String tmpl_judul_lagu : judul_lagu){
            System.out.println(tmpl_judul_lagu);
        }

        System.out.println("\nLinkedlist Setelah getfirst dan getlast");
        System.out.println("Nama Pertama: " + judul_lagu.getFirst());
        System.out.println("Nama Terakhir: " + judul_lagu.getLast());

        System.out.println("\nLinkedlist Setelah removefirst dan removelast");
        judul_lagu.removeFirst();
        judul_lagu.removeLast();
        for(String tmpl_judul_lagu : judul_lagu){
            System.out.println(tmpl_judul_lagu);
        }


    }

}
