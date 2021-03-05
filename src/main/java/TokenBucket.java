
public class TokenBucket {

    int bucketSize;
    double currentBucketSize;
    int rateToFill;
    long lastRefillTimestamp;

    public TokenBucket(int bucketSize, int rateToFill) {
        this.bucketSize = bucketSize;
        this.rateToFill = rateToFill;
        this.currentBucketSize = bucketSize;
        this.lastRefillTimestamp = System.nanoTime();
    }

    public synchronized boolean isAllowedRequest(int tokens){
        refill();
        if(currentBucketSize > tokens){
            currentBucketSize -= tokens;
            return true;
        }
        else
            return false;
    }

    private void refill() {
        double tokenToBeAdded = rateToFill * (System.nanoTime() - lastRefillTimestamp)/1e9;
        currentBucketSize = Math.min(currentBucketSize+tokenToBeAdded, bucketSize);
        lastRefillTimestamp = System.nanoTime();
    }
}
