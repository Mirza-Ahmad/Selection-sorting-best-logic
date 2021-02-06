package javaapplication138;
import java.util.Scanner;
public class JavaApplication138 
{
    public static void main(String[] args) 
    {
        Scanner is=new Scanner(System.in);
        System.out.println("Enter a size:");
        int b=is.nextInt();
        int arr[]=new int[b];
        /*BEST LOGIC OF SELECTION SORT  
        */
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++)
        {
          System.out.println("Enter the elements " + (i+1) + ": ");
          arr[i]=is.nextInt();
        }
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            int min=arr[i];
            for(int j=i+1; j<arr.length; j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting of the selection sort is = " );
        for(int i=0; i<arr.length; i++)
        {
        System.out.println(arr[i]);
        }
    }
}