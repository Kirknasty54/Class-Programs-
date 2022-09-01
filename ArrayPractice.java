package apps;
public class ArrayPractice {
    static void printArray(int[] nums) {
        // This function is complete. Here to help your test
        System.out.print("printArray(): ");
        for(int i=0; i<nums.length;i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }

    static void shiftRightArray(int[] nums) {
        // make change to nums.
        // Shift the elements to the right by 1 position. left most elements goes to the right most pos.
        // nums = [10,2,3,-5]. shiftRightArray(nums) will change it to [-5, 10, 2,3]
        //do opposite of shiftLeftArray, start at last position in array, iterating through element by minusing 1 until reaching index 1
        //create int variable with value of the value of the last element in the array
        int f = nums[nums.length-1];
        for(int i = nums.length-1; i >= 1; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = f;

    }

    static int[] generateEvenNumbers(int count) {
        // Return a new int array filled with n even numbers starting from 2.
        // eg) generateEvenNumbers(3) returns [2,4,6]
        // eg) generateEvenNumbers(5) returns [2,4,6,8,10]
        //create new array of size = to count parameter
        //use for loop to iterate through each element, then add 1 to the position of that element position then times it by 2
        int[] evenNumsArray = new int[count];
        for(int i = 0; i < count; i++){
            evenNumsArray[i] = (i + 1) * 2;
        }
        return evenNumsArray;
    }

    static int[] insertKeepOrder(int[] nums, int idx, int val) {
        // Return a new int array.
        // insert the given 'val' at index 'idx' pushing numbers to the right.
        //		insertKeepOrder([10,20,30],0,5) will return [5, 10, 20, 30]
        //		insertKeepOrder([10,20,30],1,5) will return [10, 5, 20, 30]
        //create and initalize new array with length of nums + 1 to fit the new int
        //also copied all ints from nums into newNumsOrder using System.arraycopy() instead of using for loop to manually copy them
        int[] newNumsOrder = new int[nums.length+1];
        System.arraycopy(nums, 0, newNumsOrder, 0, nums.length);

        //if statement to handle if the idx is 0, if it is 0, simply shift elements to right, similar to shiftRightArray function, except there is an 0 element spot at the end of the array to fill in already
        //if idx != 0, then we start the for loop at the end of the list (similar to previous case), then iterate until we hit the idx position in the array
        if(idx == 0){
            for(int i = newNumsOrder.length-1; i >= 1; i--){
                newNumsOrder[i] = newNumsOrder[i-1];
            }
            newNumsOrder[idx] = val;
        }else{
            for(int i = newNumsOrder.length-1; i >= idx; i--){
                newNumsOrder[i] = newNumsOrder[i-1];
            }
            newNumsOrder[idx] = val;
        }
        return newNumsOrder;
    }

    static int[] reverseNew(int[] nums) {
        // Return a new int array that is reversed version of nums
        // eg) reverseNew([1,2,3]) returns [3,2,1]
        // eg) reverseNew([5,1,2,3]) returns [3,2,1,5]
        int[] reversedNums = new int[nums.length];
        for(int i = 0; i < reversedNums.length; i++){
            reversedNums[i] = nums[(nums.length-1)-i];
        }
        return reversedNums;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {10,2,3,-5,20,10,4};
        int[] nums2 = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        printArray(nums1); // expected {10,2,3,-5,20,10,4}
        shiftRightArray(nums1);
        printArray(nums1); //expected {4, 10, 2, 3, -5, 20, 10}
        printArray(generateEvenNumbers(5)); // expected 2, 4, 6, 8, 10
        printArray(insertKeepOrder(nums1, 0, 5)); // expected {5, 4, 10, 2, 3, -5, 20, 10}
        printArray(insertKeepOrder(nums2, 1, 5)); // expected {10, 5, 20, 30, 40, 50, 60, 70, 80, 90, 100}
        printArray(reverseNew(nums2)); // expected {100, 90, 80, 70, 60, 50, 40, 30, 20, 10}
    }
}
