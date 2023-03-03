import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("xin chào: " + name);
    }
}