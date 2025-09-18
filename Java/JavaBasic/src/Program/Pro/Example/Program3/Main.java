package Program.Pro.Example.Program3;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("Bahasa");
        stack.push("Android");
        stack.push("Komputer");
        stack.push("Basis Data");
        stack.push("Matematika");
        stack.push("Algoritma");
        stack.push("Multimedia");
        stack.print();

        System.out.println(stack.pop() + "berhasil dihapus");
        stack.print();



    }
}
