import java.util.*;
public class matrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[][]=new int[a][a];
        int arr2[][]=new int[a][a];
        int sum=0,sum2=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++) arr[i][j]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++) arr2[i][j]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                sum+=arr[i][j];
                //System.out.print(arr[i][j]+" ");
            }
            //System.out.println();
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                sum2+=arr2[i][j];
            }
        }
        if(sum<=sum2){
            for(int i=0;i<a;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            for(int i=0;i<a;i++){
                for(int j=0;j<=i;j++){
            System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
        }
    // System.out.print(sum);
	}
}