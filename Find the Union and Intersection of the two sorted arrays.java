import java.util.*;
class M
{
    static String[] union(int arr1[],int arr2[])
    {
        int i=0,j=0;
        String union="";
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                union+=Integer.toString(arr1[i])+" ";
                i+=1;
            }
            else if(arr1[i]>arr2[j])
            {
                union+=Integer.toString(arr2[j])+" ";
                j+=1;
            }
            else
            {
                union+=Integer.toString(arr1[i])+" ";
                j+=1;
                i+=1;
            }
        }
        while(i<arr1.length)
        {
            union+=Integer.toString(arr1[i])+" ";
            i++;
        }
        while(j<arr2.length)
        {
            union+=Integer.toString(arr2[j])+" ";
            j++;
        }
        return union.split(" ");
    }
    static String[] intersection(int arr1[],int arr2[])
    {
        String intersection="";
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
                i+=1;
            else if(arr1[i]>arr2[j])
                j+=1;
            else
            {
                intersection+=Integer.toString(arr1[i])+" ";
                j+=1;
                i+=1;
            }            
        }
        return intersection.split(" ");
    }
    public static void main(String ay[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length of Set 1 --> ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter the Set Now --> ");
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();
        System.out.print("Enter the Length of Set 2 --> ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.print("Enter the Set Now --> ");
        for(int i=0;i<n2;i++)
            arr2[i]=sc.nextInt();
        String r1[]=union(arr1,arr2);
        String r2[]=intersection(arr1,arr2);
        System.out.print("Union of the Set is : ");
        for(String i:r1)
            System.out.print(i+" ");
        System.out.println();
        System.out.print("Intersection of the Set is : ");
        for(String i:r2)
            System.out.print(i+" ");
        System.out.println();
    }
}
