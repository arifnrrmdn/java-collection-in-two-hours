package iifrmdn.unikom.app;

import java.util.HashMap;
import java.util.Map;

public class OperasiHashMap {

    public static void main(String[] args){

        HashMap<String, String> provinsi = new HashMap<>();

        provinsi.put("Banten", "Serang");
        provinsi.put("Jawa Barat", "Bandung");
        provinsi.put("Jawa Tengah", "Semarang");
        provinsi.put("Jawa Timur", "Surabaya");
        provinsi.put("Bali", "Denpasar");

        // menampilkan data provinsi tapi teracak
        System.out.println("Menampilkan data hashmap");
        for (Map.Entry data : provinsi.entrySet()){
            System.out.println(data.getKey() + " " + data.getValue());
        }

        // operasi get
        System.out.println("\nOperasi Get");
        System.out.println(provinsi.get("Jawa Barat"));

        System.out.println("\nOperasi ContainsKey() dan ContainsValue()");
        System.out.println(provinsi.containsKey("Jawa Utara"));
        System.out.println(provinsi.containsValue("Semarang"));

    }

}
