package leet;

import java.util.HashSet;
import java.util.Set;

public class FindMaxDepthOfTreeProblem {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }


    public int countPrimes(int n) {
        boolean [] primes = new boolean[n];

        for(int i=0; i< n; i++ ){
            primes[i] = true;
        }

        for(int i = 2; i * i < n; i++ ){
            if(primes[i]){
                for(int j = i; j * j < n; j++){
                    primes[i*j]=false;
                }
            }
        }

        int count = 0;

        for(int i=2; i<n; i++ ){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }

    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        for(int i = 0; i< A.length; i++){
            if(A[i] % 2 == 0){
                int temp = A[i];
                A[i] = A[index];
                A[index++] = temp;
            }
        }
        return A;
    }

    public static boolean isHappy(int n) {

        Set<Integer> lookup = new HashSet<>();

        while (n != 1){

            int sum = 0;

            while(n != 0){
                sum += (n%10) * (n%10);
                n /= 10;
            }

            if(lookup.contains(sum)){
                return false;
            }
            lookup.add(sum);
            n = sum;
        }
        return true;

    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {

        if(left == null || right == null){
            return left == right;
        }

        if (left.val != right.val){
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}

