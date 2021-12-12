import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int arr[][] = new int[n][m];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        arr[i][j] = scn.nextInt();
      }
    }

    int fr = 0;
    int lr = n - 1;
    int fc = 0;
    int lc = m - 1;
    int count = 0;
    while (count < n * m)
    {
      for (int i = fr; i <=lr; i++)
      {
        int j = fc;
        System.out.println(arr[i][j]);
        count++;
        if (count == n * m)
          return;
      }
      fc++;
      for (int j = fc; j <= lc; j++)
      {
        int i = lr;
        System.out.println(arr[i][j]);
        count++;
        if (count >= n * m)
          return;
      }
      lr--;
      for (int i = lr; i >= fr; i--)
      {
        int j = lc;
        System.out.println(arr[i][j]);
        count++;
        if (count >= n * m)
          return;
      }
      lc--;
      for (int j = lc; j >= fc; j--)
      {
        int i = fr;
        System.out.println(arr[i][j]);
        count++;
        if (count >= n * m)
          return;
      }
      fr++;
    }
  }

}
