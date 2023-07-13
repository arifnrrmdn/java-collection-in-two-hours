package iifrmdn.unikom.app;

import java.util.ArrayList;
import java.util.Iterator;

public class OperasiIterator {

    public static void main(String[] args){

        ArrayList<String> myPlayist = new ArrayList<>();

        myPlayist.add("Not Into You");
        myPlayist.add("After Dark");
        myPlayist.add("Space Song");
        myPlayist.add("505");

        /**
         * hasNext() berfungsi untuk mengecek apakah masih ada data
         * next() berfungsi untuk mengambil data
         */

        Iterator mySong = myPlayist.iterator();
        while (mySong.hasNext()){
            Object song = mySong.next();
            System.out.println(song);
        }




    }

}
