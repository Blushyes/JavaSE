import java.util.*;

public class QueueDemo {
    /**
     * 用于测试插入以及删除的位置
     * 结论：在尾部插入，在头部删除
     */
    public void test01(){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue); //[1, 2, 3]

        queue.poll();

        System.out.println(queue); //[2, 3]

        queue.offer(1);

        System.out.println(queue); //[2, 3, 1]

        System.out.println(queue.peek());   //2

        System.out.println(queue); //[2, 3, 1]
    }

    /**
     * 测试Deque
     */
    public void test02(){
        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);

        System.out.println(deque);  //[3, 2, 1]

        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);

        System.out.println(deque);  //[3, 2, 1, 1, 2, 3]

        System.out.println(deque.peek());   //3

        System.out.println(deque.contains(3));  //true

        System.out.println(deque.size());   //6

        Iterator<Integer> iterator = deque.iterator();
        while(iterator.hasNext()){
            Integer it = iterator.next();
            System.out.print(it + " ");
        }
    }
}
