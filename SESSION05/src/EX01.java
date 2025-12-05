import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi van ban: ");
        String text = input.nextLine().trim();

        System.out.println("Nhap tu can tim: ");
        String word = input.nextLine().trim();

        boolean wordToFind = text.contains(word);
        if (wordToFind) {
            int index = text.indexOf(word);
            System.out.println("Tu \"" + word + "\" xuat hien tai vi tri " + index + " trong chuoi.");
        } else {
            System.out.println("Khong tim thay tu \"" + word + "\" trong chuoi.");
        }

        input.close();
    }
}
