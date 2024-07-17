class Solution {
    public int trap(int[] arr) {
         int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        int leftmax = 0;
        for (int i = 0; i < n; i++) {
           if(leftmax<arr[i]){
            leftmax = arr[i];
           }   
           left[i] = leftmax;   
        }

        int rightmax = 0;
        for(int i = n-1;i>=0;i--) {
           if(rightmax<arr[i]){
            rightmax = arr[i];
           } 
           right[i] = rightmax;     
        }
        int trapwater = 0;
        for(int i = 0;i<n;i++){
            trapwater += (Math.min(left[i], right[i])-arr[i]);
           
        }
    return trapwater;
        
    }
}
