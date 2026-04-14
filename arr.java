class arr{
    public static void main(String [] args){
        // Find Max number 
        // int arr[] = {2,12,4322,-22,32};
        // int res = Integer.MIN_VALUE;
        
        // for(int i = 0;i < arr.length;i++){
        //     if(arr[i] > res){
        //         res = arr[i];
        //     }
        // }
        // System.out.println(res);

        // Print reverse a array.
        // int arr1[] = {1,2,3,4,5,6};
        
        // for(int i = arr1.length - 1;i >= 0;i--){
        //     System.out.println(arr1[i]);
        // }



        // Sum of array.
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}