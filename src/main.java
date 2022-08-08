import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String args[]) {
        String reverseString="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverseString = reverseString + inputString.charAt(i);
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng!");
        else
            System.out.println("Đây không phải là chuỗi đối xứng!");
    }
}
