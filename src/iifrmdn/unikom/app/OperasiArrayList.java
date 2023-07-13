package iifrmdn.unikom.app;

import java.util.ArrayList;

public class OperasiArrayList {

    public static void main(String[] args){

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Ani");
        nama.add("Budi");
        nama.add("Elsa");
        nama.add("Herti");

        System.out.println("List nama setelah add");
        for (String name : nama) {
            System.out.println(name);
        }

        // Menyipsipkan Zaenal
        nama.add(2,"Abdul");

        System.out.println("\nList nama setelah ditambah zaenal");
        for (String name : nama) {
            System.out.println(name);
        }

        // Mendapatkan Budi
        System.out.println("\nMengambil indeks ke 3");
        System.out.println(nama.get(3));

        // Operasi remove
        nama.remove(4);
        System.out.println("\nList setelah indeks ke 4 dihapus");
        for (String name : nama) {
            System.out.println(name);
        }

        // Menampilkan size array
        System.out.println("\nUkuran list array " + nama.size());

    }


}
