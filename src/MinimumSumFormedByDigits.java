import java.util.PriorityQueue;

public class MinimumSumFormedByDigits {

    public long minimumSumFormedByDigits(int arr[], int n){

        int count =0;
        long a =0, b= 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            if(count%2 == 1){
                a = a*10 + pq.poll();
            }
            else
            {
             b = b*10 +pq.poll();
            }
            count++;
        }return a+b;

    }
    public static void main(String[] args) {

    }
}
