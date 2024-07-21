class Solution {
    public int[] twoSum(int[] arr, int target) {
       int [][] arrindex = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            arrindex[i][0] = arr[i];
            arrindex[i][1] = i;
        }

        Arrays.sort(arrindex, (a,b) -> Integer.compare(a[0],b[0]));

        int left  = 0;
        int right = arrindex.length - 1;

        while(right > left ){
            int sum = arrindex[left][0] + arrindex[right][0];
            if(sum == target){
                return new int[] {arrindex[left][1], arrindex[right][1]};   
            }
            else if(sum < target){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {};
    }
}
