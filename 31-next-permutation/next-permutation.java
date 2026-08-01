class Solution {
    public void swap(int[] arr, int a, int b) {
        if (a == b) return;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void reverse(int[] arr, int a, int b){
        while(a<b){
            if (a == b) continue;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int i,j;
        for(i = n-2; i >=0; i--){
            if(arr[i] < arr[i+1])break;
        }
        if(i<0)reverse(arr, 0, n-1);
        else{
            for(j = n-1; j >= 0; j--){
                if(arr[i]<arr[j])break;
            }
            swap(arr, i, j);
            reverse(arr, i+1, n-1);
        }
    }
}