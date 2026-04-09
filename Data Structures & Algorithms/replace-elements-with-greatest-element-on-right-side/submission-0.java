class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length - 1;
        int curr = arr[n];
        while(n > 0) {
            int swap = arr[n - 1];
            arr[n - 1] = curr;
            curr = Math.max(curr, swap);
            n--;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}