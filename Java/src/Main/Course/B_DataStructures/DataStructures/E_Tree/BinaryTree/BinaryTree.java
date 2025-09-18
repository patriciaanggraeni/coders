package Course.B_DataStructures.DataStructures.E_Tree.BinaryTree;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {

    Node root;

    BinaryTree() {
        this.root = null;
    }

    protected void createBinaryTree() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // jadikan node1 menjadi rootnya (1)
        root = node1;

        node1.left = node2;  // hubungkan sampul kiri dengan node2 (2)
        node1.right = node3; // hubungkan sampul kanan dengan node3 (3)

        node2.left = node4;  // hubungkan sampul kiri dengan node4 (4)
        node2.right = node5; // hubungkna sampul kanan dengan node5 (5)
    }

    protected void add(int data) {
        if (root == null) { // apakah rootnya null
            root = new Node(data); // jika kosong, maka isi root
        } else { // jika tidak
            Node current = root; // buat variabel temp
            while (true) { // buat perulangan while
                if (data < current.getData()) { // jika data yang dimasukkan lebih kecil dari root
                    if (current.left != null) { // dan jika root sebelah kiri tidak kosong
                        current = current.left; // lakukan kunjungan subtree sebelah kiri
                    } else { // jika sudah mencapai null atau kosong
                        current.left = new Node(data); // isi node yang kosong tadi dengan data inputan
                        break;
                    }
                } else if (data > current.getData()) { // jika data yang dimassukkan lebih besar dari root
                    if (current.right != null) { // dan jika root sebelah kanan tidak kosong
                        current = current.right; // lakukan kunjungan pada subtree kanan
                    } else { // jika sudah mencapai null atau kosong
                        current.right = new Node(data); // isi node yang kosong tadi dengan data inputan
                        break;
                    }
                } else {
                    break; // jika tidak menginputkan data, maka keluar dari perulangan
                }
            }
        }
        System.out.println(" ");
        System.out.println(data + " berhasil ditambahkan!");
        System.out.println(" ");
    }

    // buat fungsi print secara preOrder
    // Alur: root --> node kiri --> node kanan
    // Pre Order menggunakan rekursif
    protected void preOrderRecursive(Node data) {
        // membuat kondisi base casenya, karena menggunakan fungsi rekursif
        if (data == null) { // jika sudah mencapai null
            return; // keluar dari rekursif
        }
        System.out.print(data.getData() + " "); // tampilkan data root
        preOrderRecursive(data.left);  // lakukan rekursif ke simpul kiri
        preOrderRecursive(data.right); // lakukan rekursif ke simpul kanan
    }

    protected void inOrderRecursive(Node data) {
        // membuat base casenya (rekurfis)
        if (data == null) { // cek apakah root kosong
            return; // keluar dari rekursif
        }
        inOrderRecursive(data.left);  // lakukan rekursif ke simpul kiri
        System.out.print(data.getData() + " "); // tampilkan rootnya
        inOrderRecursive(data.right); // lakukan rekursif ke simpul kanan
    }

    // buat fungsi print secara postOrder
    // Alur: node kiri --> node kanan --> root
    // Post Order menggunakan rekursif
    protected void postOrderRecursive(Node data) {
        if (data == null) {
            return;
        }
        postOrderRecursive(data.left);  // lakukan rekursif ke node kiri
        postOrderRecursive(data.right); // laukan rekursif ke node kanan
        System.out.print(data.getData() + " "); // tampilkan data rootnya
    }

    // Pre Order menggunakan iterative
    protected void preOrderIterative() {
        if (root == null) { // cek apakah root masih kosong
            System.out.println("Root masih kosong");
        } else { // jika tidak
            Stack<Node> stack = new Stack<>(); // buat stack baru
            stack.push(root); // push root ke stack
            while (!stack.isEmpty()) { // cek apakah stack kosong / selama stack tidak kosong
                Node temp = stack.pop(); // jika tidak, maka pop data top
                System.out.print(temp.getData() + " "); // tampilkan data
                if (temp.right != null) { // cek jika temp.right tidak kosong
                    stack.push(temp.right); // push
                }
                if (temp.left != null) { // cek jika temp.left tidak kosong
                    stack.push(temp.left); // push
                }
            }
        }
    }

    protected void inOrderIterative() {
        if (root == null) { // cek apakah root kosong
            System.out.println("Root masih kosong");
        } else { // jika tidak, maka
            Stack<Node> stack = new Stack<>(); // buat stack baru
            Node temp = root; // simpan nilai root ke temp
            while (!stack.isEmpty() || temp != null) { // cek kondisi jika stack tidak kosong atau temp tidak kosong
                if (temp != null) { // cek lagi apakah temp tidak kosong
                    stack.push(temp); // jika tidak, maka push ke stack
                    temp = temp.left; // lakukan traverse ke simpul sebelah kiri
                } else { // jika temp kosong
                    temp = stack.pop(); // lakukan pop, data yang dipop disimpan ke variabel temp
                    System.out.print(temp.getData() + " "); // tampil data yang di pop dari stack tadi
                    temp = temp.right; // lakukan traverse ke simpul sebelah kanan
                }
            }
        }
    }

    protected void postOrderIterative() {
        if (root == null) { // cek apakah root masih kosong
            System.out.println("Root kosong");
        } else { // jika tidak, eksekusi block program di bawah ini
            Node current = root; // buat variabel current untuk menampung nilai dari root
            Stack<Node> stack = new Stack<>(); // buat stack baru
            while (current != null || !stack.isEmpty()) { // cek apakah current tidak kosong atau stack juga tidak kosong
                 if (current != null) { // jika posisi current tidak kosong, maka
                     stack.push(current);    // push current ke stack
                     current = current.left; // lakukan kunjungan ke node kiri
                } else { // jika tidak, maka
                     Node temp = stack.peek().right; // simpan nilai referensi dari data peek sebelah kanan
                     if (temp == null) { // cek apakah variabel temp adalah null
                         temp = stack.pop(); // jika iya, pop stack dan simpan data ke variabel temp
                         System.out.print(temp.getData() + " "); // tampilkan data
                        while (!stack.isEmpty() && temp == stack.peek().right) { // ketika stack tidak kosong dan temp sama dengan data referensi yang ada di sebelah data saat ini
                            temp = stack.pop(); // maka, pop stack dan taruh hasil ke variabel temp
                            System.out.print(temp.getData() + " "); // tampilkan data
                        }
                     } else { // jika temp tidak null
                         current = temp; // pindah posisi current ke temp
                     }
                }
            }
        }
    }

    protected void levelOrder() {
        if (root == null) { // cek apakah rootnya kosong
            return;
        }
        // jika tidak, maka
        Queue<Node> queue = new LinkedList<>(); // buat sebuah antrian baru
        queue.offer(root); // masukkan data root ke antrian pertama
        while (!queue.isEmpty()) { // cek apakah ada antrian
            Node temp = queue.poll(); // jika iya, keluarkan data root dari antrian
            System.out.print(temp.getData() + " "); // tampilkan data yang dikeluarkan barusan
            if (temp.left != null) { // cek apakah subtree sebelah kiri tidak kosong
                queue.offer(temp.left); // jika iya, masukkan data yang ada di subtree kiri ke antrian
            }
            if (temp.right != null) { // begitu juga dengan kanan
                queue.offer(temp.right); // masukkan data yang ada di subtree kanan ke antrian
            }
        }
    }

    protected int findMax(Node data) {
        if (data == null) {
            return Integer.MIN_VALUE;
        }
        int result = data.getData();
        int left = findMax(data.left);
        int right = findMax(data.right);

        if (left > result) {
            result = left;
        }

        if (right > result) {
            result = right;
        }

        return result;
    }
}