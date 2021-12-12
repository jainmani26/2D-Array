import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        
        int dir=0,row=0,col=0;
        while(row>=0 && row<n && col>=0 && col<m)
        {
            dir=(dir+arr[row][col])%4;
            if(dir==0)
            {
                col++;
            }
            else if(dir==1)
            {
                row++;
            }
            else if(dir==2)
            {
                col--;
            }
            else if(dir==3)
            {
                row--;
            }
            
            if(row<0)
            {
                row++;
                break;
            }
            else if (col<0)
            {
                col++;
                break;
            }
            else if(row==arr.length)
            {
                row--;
                break;
            }
            else if(col==arr[0].length)
            {
                col--;
                break;
            }
            
        }
        System.out.println(row);
        System.out.println(col);
        
    }

}
