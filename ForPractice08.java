package kadai4;

public class ForPractice08 {
    public static void main(String[] args) {
        int rows = 10;
        //ForPractice07と同じものを縦に3つ
        for (var l = 1; l <= 3; l++) {
            for (var i = 1; i < 10; i++) {
                //ForPractice06と同じものを横に5つ
                for (var k = 1; k <= 5; k++) {
                    for (var j = 1; j <= 10; j++) {
                        if ((i < 6) && (i >= j || j >= rows + 1 - i)) {
                            System.out.print("*");
                        } else if ((i >= 6) && (i < j || j < rows + 1 - i)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
