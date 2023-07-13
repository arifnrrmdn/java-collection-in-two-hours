package iifrmdn.unikom.app;

import java.util.Stack;

public class OperasiStack {

    public static void main(String[] args){

        Stack<String> top_cheater_pubgm = new Stack<>();

        top_cheater_pubgm.push("Bang Alpian");
        top_cheater_pubgm.push("Bang Noken");
        top_cheater_pubgm.push("Bang Ragnar");
        top_cheater_pubgm.push("Vergil");
        top_cheater_pubgm.push("Bang Farid");

        System.out.println("Menampilkan data stack setelah push()");
        for (String cheater_pubgm : top_cheater_pubgm){
            System.out.println(cheater_pubgm);
        }

        System.out.println("\nOperasi pop()");
        System.out.println(top_cheater_pubgm.pop());

        System.out.println("\nSetelah operasi pop()");
        for (String cheater_pubgm : top_cheater_pubgm){
            System.out.println(cheater_pubgm);
        }


    }

}
