package Tugas1;

public class LinkedListMahasiswa_29 {
    private LinkedListNode_29 head;

    public void tambahMahasiswa(Mahasiswa_29 mhs) {
        LinkedListNode_29 newNode = new LinkedListNode_29(mhs);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode_29 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void hapusMahasiswa(String nim) {
        if (head == null)
            return;

        if (head.data.getNim().equals(nim)) {
            head = head.next;
            return;
        }

        LinkedListNode_29 temp = head;
        while (temp.next != null && !temp.next.data.getNim().equals(nim)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Mahasiswa_29 cariMahasiswa(String nim) {
        LinkedListNode_29 temp = head;
        while (temp != null) {
            if (temp.data.getNim().equals(nim)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        LinkedListNode_29 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
