package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {

        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push(5);
        st.push(2);
        st.push(3);
        st.push(7);

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("== Stack ==");
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st);

        System.out.println("== Queue ==");
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);



    }
}
