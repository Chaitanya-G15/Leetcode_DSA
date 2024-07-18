class Solution {
    public void sortColors(int[] a) {
    int s = 0,e = a.length - 1,i = 0;
    for(i = 0 ; i <= e;){
        if (a[i] == 0){
            int temp = a[i];
            a[i] = a[s];
            a[s] = temp;

            i++;
            s++;
        }
        else if(a[i] == 2){
            int temp = a[i];
            a[i] = a[e];
            a[e] = temp;
            e--;
        }
        else i++;
    }
}
}
