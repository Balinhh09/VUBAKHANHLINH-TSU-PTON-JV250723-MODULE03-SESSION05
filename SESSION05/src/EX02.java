public class EX02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuoi ban dau: " + sb);

        sb.delete(5,9);
        System.out.println("Chuoi sau khi xoa: " + sb);

        int startIndex = sb.indexOf("World");
        int endIndex = startIndex + 5;
        sb.replace(startIndex, endIndex, "Universe");
        System.out.println("Chuoi sau khi thay the: " + sb);
    }
}
