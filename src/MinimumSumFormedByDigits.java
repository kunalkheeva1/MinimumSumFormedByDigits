import java.util.PriorityQueue;

public class MinimumSumFormedByDigits {

    //get a minimum heap to always access the smallest element first
    public long minimumSumFormedByDigits(int arr[], int n){

        int count =0;
        long a =0, b= 0;
        //add the elements of given array in minimum heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        //first element will make a digit with a, and second with b, then count increases, and finally return
        //the sum of a and b
        while(!pq.isEmpty()){
            // if the element is at the odd position append it in a, otherwise in b
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
