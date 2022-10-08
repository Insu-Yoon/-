private static boolean binarySearch(int num, int[] has) {
    int leftIndex = 0;
    int rightIndex = has.length - 1;

    while(leftIndex <= rightIndex){
        int midIndex = (leftIndex + rightIndex) / 2;
        int mid = has[midIndex];

        if(num < mid) rightIndex = midIndex - 1;
        else if(num > mid) leftIndex = midIndex + 1;
        else return true;
    }
    return false;
}
