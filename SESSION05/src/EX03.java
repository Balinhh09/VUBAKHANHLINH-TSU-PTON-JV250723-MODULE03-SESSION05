import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi:");
        String text = input.nextLine();

        String replaced = text.replaceAll("[0-9]","*");
        System.out.println(replaced);

        input.close();
    }
}
