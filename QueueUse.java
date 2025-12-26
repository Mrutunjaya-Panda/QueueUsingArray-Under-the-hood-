package queue1;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        int arr[] = {10,20,30,40};
        for(int elem : arr){
            try{
                queue.enqueue(elem);
            } catch(QueueFullException e) {
                //there is nothing much to do in catch because we are cautious about the no. of 
                //elements we are inserting.
            }
            
        }
        while(!queue.isEmpty()){
            try{
                System.out.println(queue.dequeue());
            } catch(QueueEmptyException e){
                //will never reach here.
            }
        }
    }
}
