package all_collections.queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class MyDelayQueue implements Delayed {
    private String name;
    private long time;

    // Constructor of DelayObject
    public MyDelayQueue(String name, long delayTime)
    {
        this.name = name;
        this.time = System.currentTimeMillis()
                + delayTime;
    }

    // Implementing getDelay() method of Delayed
    @Override
    public long getDelay(TimeUnit unit)
    {
        long diff = time - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    // Implementing compareTo() method of Delayed
    @Override
    public int compareTo(Delayed obj)
    {
        if (this.time < ((MyDelayQueue)obj).time) {
            return -1;
        }
        if (this.time > ((MyDelayQueue)obj).time) {
            return 1;
        }
        return 0;
    }

    // Implementing toString()
    // method of Delayed
    @Override
    public String toString()
    {
        return "\n{"
                + "name=" + name
                + ", time=" + time
                + "}";
    }

}

public class MyDelayQOperation {
    private DelayQueue<MyDelayQueue> DQ
            = new DelayQueue<>();

    public void delayOperation() {


        // Add numbers to end of DelayQueue
        // using add() method
        DQ.add(new MyDelayQueue("A", 1));
        DQ.add(new MyDelayQueue("B", 2));
        DQ.add(new MyDelayQueue("C", 3));
        DQ.add(new MyDelayQueue("D", 4));
        DQ.add(new MyDelayQueue("E", 6));

        // print queue
        System.out.println("DelayQueue: "
                + DQ);

        // print the head using peek() method
        System.out.println("Head of DelayQueue: "
                + DQ.peek());

        // print the size using size() method
        System.out.println("Size of DelayQueue: "
                + DQ.size());

        // remove the head using poll() method
        System.out.println("Head of DelayQueue: "
                + DQ.poll());

        // print the size using size() method
        System.out.println("Size of DelayQueue: "
                + DQ.size());

        // print queue
        System.out.println("DelayQueue: "
                + DQ);

    }

}
