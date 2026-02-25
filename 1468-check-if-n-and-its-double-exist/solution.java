
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> visited = new HashSet<>();

        for(int num : arr){
            if(visited.contains(2 * num)
             || num % 2 == 0 && visited.contains(num/2)){
                return true;
            }
            visited.add(num);
        }
        return false;
    }
}
