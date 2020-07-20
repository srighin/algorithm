import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Program {
    public static void main(String[] args) {
        int [][] nums = {
                {1,2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [] array = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        System.out.println(longestPeak(array));
        //spiralTraverse2(nums).stream().forEach(System.out:: print);
    }


    public static int maxSubsetSumNoAdjacent(int[] array) {
        int maxSumOdd = 0;

        if(array == null || array.length==0){
            return maxSumOdd;
        }

        int index = 0;
        while(index+3 < array.length){
            maxSumOdd += array[index];
            if(array[index+2] > array[index+3]){
                index = index+2;
            } else{
                index = index+3;
            }
        }
        if(index < array.length){
            maxSumOdd += array[index];
        } else{
            maxSumOdd += array[index-1];
        }

        //
        int maxSumEven = 0;

        index = 1;
        while(index+3 < array.length){
            maxSumEven += array[index];
            if(array[index+2] > array[index+3]){
                index = index+2;
            } else{
                index = index+3;
            }

        }
        if(index < array.length){
            maxSumEven += array[index];
        } else{
            maxSumEven += array[index-1];
        }

        return Math.max(maxSumOdd, maxSumEven);
    }


    public static int longestPeak(int[] array) {
        int longestPeak = -1;
        int index = 1;

        if(array == null || array.length < 3){
            return -1;
        }
        while(index < array.length-1){
            boolean isPeak = false;
            if(array[index-1] < array[index] && array[index] > array[index+1]){
                isPeak = true;
            }

            if(!isPeak){
                index++;
                continue;
            }

            int leftInd = index - 1;
            while(leftInd >= 0 && array[leftInd] > array[leftInd-1]){
                leftInd--;
            }

            int rightIndex = index + 1;
            while(rightIndex < array.length && array[rightIndex] > array[rightIndex+1]){
                rightIndex++;
            }

            int currentMax = rightIndex - leftInd + 1;
            if(currentMax > longestPeak){
                longestPeak = currentMax;
            }
            index++;
        }
        return longestPeak;
    }


    public static List<Integer> spiralTraverse2(int[][] array) {

        int left = 0;
        int right = array[0].length -1;
        int top = 0;
        int bottom = array.length-1;
        int size = array.length * array[0].length;

        List<Integer> result = new ArrayList<>();

        while(result.size() < size){

            for(int i=left; i<=right && result.size() < size; i++ ){
                System.out.print(array[top][i] +"-> ");
                result.add(array[top][i]);
            }
            top++;
            for(int i=top; i<= bottom && result.size() < size; i++){
                System.out.print(array[i][right]+"-> ");
                result.add(array[i][right]);
            }

            right--;

            for(int i=right; i>= left && result.size() < size; i--){
                System.out.print(array[bottom][i]+ "-> ");
                result.add(array[bottom][i]);
            }

            bottom--;
            for(int i=bottom; i>=top && result.size() < size; i--){
                System.out.print(array[i][left]+"-> ");
                result.add(array[i][left]);
            }
            left++;

        }
        return result;
    }



    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        int top = 0;
        int bottom = array.length-1;
        int left = 0;
        int right = array[0].length-1;
        int size =  array.length* array[0].length;

        List<Integer> result  = new ArrayList<>();

        while(result.size() < size){

            for(int i= left; i <= right && result.size() < size; i++){
                System.out.print(array[top][i]+ "-> ");
                result.add(array[top][i]);
            }

            top++;

            for(int i=top; i <= bottom && result.size() < size; i++){
                System.out.print(array[i][right]+ "-> ");
                result.add(array[i][right]);
            }

            right--;

            for(int i=right; i>= left && result.size() < size; i--){
                System.out.print(array[bottom][i]+ "-> ");
                result.add(array[bottom][i]);
            }

            bottom--;

            for (int i=bottom; i>= top && result.size() < size; i--){
                System.out.print(array[i][left]+ "-> ");
                result.add(array[i][left]);
            }
            left++;
        }

        return result;
    }



    public static boolean isMonotonic(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for(int i=0; i+1 < array.length; i++){
            if(array[i] < array[i+1] ){
                isDecreasing = false;
            }

            if(array[i] > array[i+1]){
                isIncreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }


    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int index = 0;
        for (int i = 0; i< array.size(); i++){
            if(array.get(i) != toMove){
                int temp = array.get(index);
                array.set(index++,  array.get(i));
                array.set(i, temp);
            }
        }
        return array;
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int arrayOneIndex = 0;
        int arrayTwoIndex = 0;
        int min = Integer.MAX_VALUE;
        while(arrayOneIndex < arrayOne.length && arrayTwoIndex < arrayTwo.length){

            if(Math.abs(arrayOne[arrayOneIndex] - arrayTwo[arrayTwoIndex]) < min){
                min = Math.abs(arrayOne[arrayOneIndex] - arrayTwo[arrayTwoIndex]);
                result[0] = arrayOne[arrayOneIndex];
                result[1] = arrayTwo[arrayTwoIndex];
            }

            if(arrayOne[arrayOneIndex] < arrayTwo[arrayTwoIndex]){
                arrayOneIndex++;
            } else {
                arrayTwoIndex++;
            }


        }

        return result;
    }


    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        List<Integer[]> result = new ArrayList<>();
        // nlogn
        Arrays.sort(array);

        for (int i = 0; (i+1)< array.length; i++){
            int start = i+1;
            int end = array.length -1;

            while(start < end){
                if((array[i] + array[start]+array[end]) > targetSum){
                    end --;
                }else if((array[i] + array[start]+array[end]) < targetSum){
                    start ++;
                } else {
                    Integer [] newArray = {array[i], array[start], array[end]};
                    result.add(newArray);
                    end --;
                }
            }
        }
        return result;
    }

    public static int[] findThreeLargestNumbers2(int[] array) {

        int [] result = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for(int num: array){

            if(num > result[2]){
                adjust(result, 2, num);
            } else if(num > result[1]){
                adjust(result, 1, num);
            } else if(num > result[0]){
                adjust(result, 0, num);
            }

        }
        // Write your code here.
        return result;
    }

    private static void adjust(int []result, int index, int num)
    {
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                result[i] = result[i + 1];
            }
        }
        result[index] = num;
    }


    public static int[] selectionSort(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int j = 0; j< array.length-1; j++){
            int index = 0;
            for (int i=j+1; i<array.length; i++){
                if (array[i] < min){
                    min = array[i];
                    index = i;
                }
            }
            int temp = array[j];
            array[j] = array[index];
            array[index]= temp;
        }


        return array;
    }

    public static int[] bubbleSort(int[] array) {

        for(int j=0; j<array.length; j++){
            for (int i = 0; i< array.length-j; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }

    public static String caesarCypherEncryptor2(String str, int key) {
       char [] chars = str.toCharArray();
       char [] result = new char[str.length()];
       int i = 0;
       for(char ch: chars){
           int unicode = ch +key;
           if(unicode >= 122){
               unicode = 97 + (unicode%122 - 1);
           }
           char tempchar = (char) unicode;
           result[i++] = tempchar;
       }
       return new String(result);
    }

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char [] result = new char[str.length()];
        for (int i=0; i< str.length(); i++){
            int currentIndex = (i+key)>= str.length() ? (i+key)%key : (i+key);
            result[currentIndex] = str.charAt(i);
        }

        return new String(result);
    }

    private static void rotateByOnePosition(String str) {
        char [] characters = str.toCharArray();
        char endCharacter = str.charAt(str.length()-1);

    }


    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int start = 0;
        int end = array.length -1;

        while (start < end){
            int mid = start + (end - start);
            if(array[mid] == target){
                return mid;
            } else if(array[mid] < target){
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }



    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.

        int [] result = new int[3];
        for (int num: array){
            shiftAndAdd(num, array);
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.

        int start =0;
        int end = str.length() -1;

        while(start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static void shiftAndAdd(int num, int[] array) {

        for(int i = 0; i<3; i++){

        }
    }

    public static int getNthFib(int n) {
        int result = 0;
        if (n==0){
            return 0;
        }
        if (n==1 || n == 2){
            return 1;
        }

        int ith = 1;
        int ithMinOne = 1;
        for(int i=3; i< n; i++){
            result = ith+ithMinOne;
            ithMinOne = ith;
            ith = result;
        }
        return ith;
    }

    public static int productSum(List<Object> array) {

        return productSum(array, 0);
    }


    private static int productSum(List<Object> array, int height){

        int sum = 0;
        for (Object num : array) {
            if(num instanceof List){
                sum+=height*productSum((List<Object>) num, height+1);
            } else {
                sum += (int)num;
            }
        }
        return  sum;
    }

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            Stack<Node> nodeStack = new Stack<>();
            nodeStack.add(this);

            while(!nodeStack.isEmpty()){
                Node currentNode = nodeStack.pop();
                List<Node> neighbour = currentNode.children;
                for(Node node: neighbour){
                    nodeStack.add(node);
                }
                array.add(currentNode.name);
            }

            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }

    }


    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static int nodeDepths(BinaryTree root) {
        if (root == null)
            return -1;
        return bfs(root, 0);
    }

    private static int bfs(BinaryTree root, int currentHeight){
        if (root == null)
            return 0;
       return currentHeight + bfs(root.left, currentHeight+1)+bfs(root.right, currentHeight+1);
    }



    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sumArray = new ArrayList<>();
        if(root == null){
            return sumArray;
        }
        dfs(root, 0, sumArray);
        return sumArray;
    }

    private static void dfs(BinaryTree root, int runningSum, List<Integer> sums) {
        if(root == null){
            return;
        }

        int currentSum = runningSum+root.value;

        if(root.left == null && root.right == null){
            sums.add(currentSum);
        }

        dfs(root.left, currentSum, sums);
        dfs(root.right, currentSum, sums);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }


    public static int findClosestValueInBst(BST tree, int target) {
        int minDiff = Integer.MAX_VALUE;
        int result = -1;

        while(tree != null){
            if(Math.abs(tree.value - target) < minDiff){
                minDiff = Math.abs(tree.value - target);
                result = tree.value;
            }
            if(tree.value < target){
                tree = tree.right;
            }else {
                tree = tree.left;
            }
        }
        return result;
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int index = 0;

        for(int i = 0; i< array.size(); i++){
            if (index < sequence.size() && array.get(i) == sequence.get(index)) {
                index++;
            }
        }

        if(Math.abs(sequence.size()-index) !=0 ){
            return false;
        }
        return true;
    }


    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Set<Integer> lookup = new HashSet<>();
        int [] result = new int[0];
        for(int num: array){
            int diff = targetSum - num;
            if (lookup.contains(diff)){
                result = new int[2];
                result[0] = num;
                result[1] = diff;
            } else{
                lookup.add(num);
            }
        }
        return result;
    }

    // nlogN

    private int [] twoNumberSum2(int[] array, int targetSum){

        Arrays.sort(array);

        int start = 0;
        int end = array.length - 1;

        while(start < end) {
            int currentSum = array[start] + array[end];
            if (currentSum == targetSum){
                return new int[]{array[start], array[end]};
            } else if(currentSum < targetSum){
                start ++;
            } else {
                end --;
            }
        }
        return new int[0];

    }
}
