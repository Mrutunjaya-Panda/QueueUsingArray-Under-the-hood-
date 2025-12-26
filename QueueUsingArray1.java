//Dynamic Queue making.
package queue1;

public class QueueUsingArray1 {
    private int data[];
    private int front; //index of element at the front.
    private int rear;  //index of element at the rear.
    private int size;
    //default constructor
    public QueueUsingArray1(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray1(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int elem){
        if(size == data.length){
            //throw new QueueFullException();
            doubleCapacity();
        }
        if(size == 0){
            //front++;
            //OR
            front = 0;
        }


        //rear++;
        //here we have to be vigilant about one important edge case i.e
        //if(rear == data.length){
            //set rear index to 0 else will give array_bound_index Exception.
            //i.e circular queue.
           // rear = 0;
        //}

        //now I can do the above steps i.e from rear++ in a more effecient and effective manner
        //i.e
        rear = (rear + 1) % data.length;  //rear will always between 0 to data.length - 1.      
        data[rear] = elem;
        size++;
    }

    private void doubleCapacity(){
        System.out.println("Using double capacity method ");
        int temp[] = data;
        data = new int[2*temp.length];
        //now copy all entries from temp to the data array, but this approach for queue would not be a good dicision.
        //we need to copy but at the same time we need to maintain the FIFO sequence.

        //therefore start from the front.
        int index = 0;
        for(int i = front; i<temp.length; i++){
            data[index++] = temp[i];
        }

        //now copy everything from 0 to front - 1 / rear.
        for(int i=0;i<=rear;i++){
            data[index++] = temp[i];
        }

        //now update front and rear indexes for the newly created data array.
        front = 0;
        rear = temp.length-1;
    }

    public int front() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        int temp = data[front];

        //front++;
        //check for one edge case i.e if the front crosses the array.length-1
        //if(front == data.length){
            //front = 0;
        //}

        //the above lines can be rewritten in a single line efficiently.
        front = (front + 1) % data.length;

        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
