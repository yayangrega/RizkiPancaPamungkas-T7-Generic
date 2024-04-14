import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Membuat objek ArrayList untuk menyimpan String
        ArrayList<String> list = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        list.add("Handphone");
        list.add("Tv");
        list.add("Kulkas");

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList:");
        for (String Electronic : list) {
            System.out.println(Electronic);
        }
    }
}