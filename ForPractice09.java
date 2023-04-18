package kadai4;

public class ForPractice09 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1800; i <= 2000; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count++;
            }
        }
        System.out.println("1800年から2000年までの閏年の数：" + count);
    }
}
