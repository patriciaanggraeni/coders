package Course.E_CollectionsFramework.B_JavaCollections.H_HashTable;

import java.util.Map;
import java.util.Set;
import java.util.Hashtable;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) { 

        // 1a. deklarasi sebuah HashTable (Heterogeneous Data)
        Hashtable<Object, Object> map = new Hashtable<Object, Object>(11, 0.75f);
        Hashtable temp = new Hashtable();

        // 1b. deklarasi sebuah Hashtable (Hmogeneous Data)
        // Hashtable<[type of key], [type of value]> integerMap = new Hashtable<[same], [same]>();
        Hashtable<Integer, String> tempMap = new Hashtable<Integer, String>();

        // 2a. penggunaan method put(key, values);
        map.put(100, "Angga");
        map.put(101, "Anggi");
        map.put(102, "Hendra");
        map.put(103, "Malik");
        map.put(104, "Intan");
       
        System.out.println("\nMenggunakan Method put(): ");
        System.out.println("Hasil: " + map);

        // 2b. penggunaan method putAll(Map C)
        temp.putAll(map);
        System.out.println("\nMenggunakan Method putAll():");
        System.out.println("Hasil: " + temp);

        // 3. penggunaan method get(key);
        var getValue = map.get(100);
        System.out.println("\nMenggunakan Method get():");   
        System.out.println("Hasil: " + getValue);
        
        // 4. penggunaan method remove(key) 
        var removeKey = map.remove(101);
        System.out.println("\nMenggunakan Method remove():");
        System.out.println("Hasil: " + removeKey);

        // 5. penggunaan method containsKey() -> return boolean
        boolean containKey = map.containsKey(100);
        System.out.println("\nMenggunakan Method containsKey():");
        System.out.println("Hasil: " + containKey);

        // 6. penggunaan method containsValues() -> return boolean
        boolean containValues = map.containsValue("Angga");
        System.out.println("\nMenggunakan Method containsValues():");
        System.out.println("Hasil: " + containValues);

        // 7. penggunaan method isEmpty() -> return boolean
        boolean isEmpty = map.isEmpty(); 
        System.out.println("\nMenggunakan Method IsEmpty():");
        System.out.println("Hasil: " + isEmpty);

        // 8. penggunaan method size() -> return integer
        int length = map.size();
        System.out.println("\nMenggunakan Method size():");
        System.out.println("Hasil: " + length);

        // 9a. penggunaan method setKey() -> return set object
        var getAllKey = map.keySet();
        System.out.println("\nMenggunakan Method keySet():");
        System.out.println("Hasil: " + getAllKey);

        // 10. penggunaan method values() -> return collections values
        var getAllValue = map.values();
        System.out.println("\n\nMenggunakan Method values():");
        System.out.println("Hasil: " + getAllValue);

        // 11. penggunaan method entrySet()
        var getAllEntry = map.entrySet();
        System.out.println("\n\nMenggunakan Mrthod setEntry():");
        System.out.println("Hasil: " + getAllEntry);

        // 12a. menampilkan key menggunakan for each 
        System.out.println("\nMenggunakan For Each (key):");
        System.out.print("Hasil: ");
        for (var i : getAllKey) { 
            System.out.print(i + " ");
        }

        // 12b. menampilkan nilai menggunakan for each 
        System.out.println("\nMenggunakan For Each (values):");
        System.out.print("Hasil: ");
        for (var i : getAllValue) {
            System.out.print (i + " ");
        }

        // 12c. meanmpilkan kunci beserta nilainya menggunakan kombinasi for each dan method get
        System.out.println("\n\nMenggunakan For Each dengan method get():");
        System.out.println("Key\tValues");
        System.out.println("--------------");
        for (var i : getAllKey) {
            System.out.println(i + "\t" + map.get(i));
        }

        // penggunaan method entry
        // syarat: tipe data dari key dan vlues harus sudah terdefinisikan
        tempMap.put(201, "Bola Ping-Pong");
        tempMap.put(202, "Kelerang");
        tempMap.put(203, "Bowling");
        tempMap.put(204, "Bola Basket");
        tempMap.put(205, "Bola Tenis");

        System.out.println("\n\nMneggunakan Method Entry : 1");
        System.out.println("Key\tValues");
        System.out.println("-----------------");
        for (Map.Entry entry : tempMap.entrySet()) { 
            
            // ekstrak masing masing entry (key dan valuenya) 
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println("\nMenggunakan Method Entry : 2");
        System.out.println("Key\tValues");
        System.out.println("-----------------");
        
        Set set = tempMap.entrySet();
        Iterator print = set.iterator();

        while (print.hasNext()) {
            Map.Entry entry = (Map.Entry) print.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }   
}