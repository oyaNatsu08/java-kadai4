package kadai4;
import java.util.Scanner;
public class WhilePractice02 {
    public static void main(String[] args) {

        var sum = 0;
        var sc = new Scanner(System.in);

        while(true){
            System.out.println("数値を入力してください");
            var s1 = sc.nextLine();
            var num = Integer.parseInt(s1);
            if (num != 0) {
                sum += num;
            } else {
                break;
            }
            System.out.println("現在は " + sum);
        }
        sc.close();

        System.out.print(sum);

    }
}
