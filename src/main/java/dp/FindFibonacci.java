package dp;

import java.util.HashMap;
import java.util.Map;

public class FindFibonacci {
    //using backtracking
    public long getFibUsingBackTracking(long n){
        if (n <= 1){
            return n;
        }
        long fibNMinusTwo = 0;
        long fibNMinusOne = 1;
        long result = fibNMinusOne + fibNMinusTwo;

        for(int i=2; i< n; i++){
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = result;
            result = fibNMinusOne+fibNMinusTwo;
        }
        return result;
    }

    /**
     *
     * @param n
     * @return fibonacci value
     */
    public long getFibLookUp(long n){
        if(n<=1){
            return n;
        }
        Map<Long, Long> lookup = new HashMap<>();
        lookup.put(0l, 0l);
        lookup.put(1l, 1l);
        long index = 2;
        long result = 1;

        while(index <= n){
            result = lookup.get(index -2)+lookup.get(index -1);
            lookup.put(index++, result);
        }
        return result;
    }
}
