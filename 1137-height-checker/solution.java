class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = heights.clone();
        int count = 0;
        for(int i=0;i<heights.length - 1;i++){
            boolean swap = false;
            for(int j=0;j<heights.length-1;j++){
                if(heights[j] > heights[j+1]){
                    swap = true;
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                }
            }
            }
        for(int i=0;i<heights.length;i++){
            if (heights[i] != exp[i]){
                count++;
            }
        }
        return count;
        }
    }
