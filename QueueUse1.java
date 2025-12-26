package queue1;

public class QueueUse1 {
    public static void main(String[] args) throws QueueEmptyException{
        QueueUsingArray1 queue = new QueueUsingArray1(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.enqueue(80);

        //here now rear = 0 and front =1
        //this is the edge case we have handled in doublecapacity() method.
        //i.e now we will insert another element let say 40.
        queue.enqueue(40);

        System.out.println(queue.size());
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue() + " ");
        }
        
        
    }
}
