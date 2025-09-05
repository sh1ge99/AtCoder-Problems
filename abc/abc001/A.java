package abc.abc001;
import java.util.Scanner;

/*
 * 問題URL
 * https://atcoder.jp/contests/abc001/tasks/abc001_1
 */
public class A {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int H1 = sc.nextInt();
      int H2 = sc.nextInt();

      int diff = H1 - H2;
      System.out.println(diff);

      sc.close();
   }
}
