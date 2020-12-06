package leet;

public class AbleToAttendAllMeeting {

    public static void main(String[] args) {
        int [] start = {0, 10, 15};
        int [] end = {10, 15, 20};
        boolean isPossible = true;

        for(int i =0; i< start.length -1 ; i++){
            if(start[i+1] < end[i]){
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible);
    }
}
