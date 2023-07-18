import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Removal{
    public static int findCost(int[] arr){
        Arrays.sort(arr);
        int j=1,cost=0;
        int ar[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ar[i]=arr[(arr.length)-j];
            j++;
        }
        for (int i=0;i<arr.length;i++){
            cost+=ar[i]*(i+1);
        }
        return cost;

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Cost: "+findCost(arr));
    }

}
