import java.util.Scanner;
class arr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //1. Find Max number 
        // int arr[] = {2,12,4322,-22,32};
        // int res = Integer.MIN_VALUE;
        
        // for(int i = 0;i < arr.length;i++){
        //     if(arr[i] > res){
        //         res = arr[i];
        //     }
        // }
        // System.out.println(res);

        // 2.Print reverse a array.
        // int arr1[] = {1,2,3,4,5,6};git push 
        
        // for(int i = arr1.length - 1;i >= 0;i--){
        //     System.out.println(arr1[i]);
        // }



        // 3.Sum of array.
        // int arr[] = {1,2,3,4,5};
        // int sum = 0;
        // for(int i = 0;i < arr.length;i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println(sum);

        // 4.Array input lo aur print karo
        // System.out.print("Enter size of an array : ");
        // int num = sc.nextInt();
        // int arr[] = new int[num];
        // for(int i = 0;i < num;i++){
        //     System.out.print("Enter array elements : ");
        //     System.out.print(" ");
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Array elements are --> ");
        // for(int i = 0;i < num;i++){
        //    System.out.print(arr[i]+ " ");
        // }

        // 5.Array ka sum aur average nikalo
        System.out.print("Enter array size : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0;
        int avg = 0;
        System.out.print("Enter Array Elements : ");
        for(int i = 0;i < num;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            avg = sum / num;
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+avg);
    }
}