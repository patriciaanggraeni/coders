package Project.Project3_Inventory.Product;

public class Tamiya extends Products {

    public static Products head, tail;

    Tamiya() {}

    public static boolean kosong() {
        return head == null && tail == null;
    }

    private void tambahMainanTamiya(Products tamiya) {
        if (kosong()) {
            head = tamiya;
        } else {
            tail.next = tamiya;
            tamiya.prev = tail;
        }
        tail = tamiya;
    }

}
