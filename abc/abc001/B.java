package abc.abc001;
import java.util.Scanner;

/*
 * 問題URL
 * https://atcoder.jp/contests/abc001/tasks/abc001_2
 */
public class B {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();

        double km = m / 1000.0;
        int vv;

        if (km < 0.1) {
            vv = 0;
        } else if (km <= 5.0) {
            vv = (int)Math.floor(km * 10);
        } else if (km <= 30.0) {
            vv = (int)(km + 50);
        } else if (km <= 70.0) {
            vv = (int)((km - 30) / 5.0 + 80);
        } else {
            vv = 89;
        }

        // 出力は必ず2桁にしないといけない
        System.out.println(String.format("%02d", vv));
   }
}
