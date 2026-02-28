class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] light = new boolean[101];

        for(int i : bulbs){
            light[i] = !light[i];
        }

        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(light[i]){
                result.add(i);
            }
        }
    return result;
    }
}
