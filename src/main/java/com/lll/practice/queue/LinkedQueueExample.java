package com.lll.practice.queue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/4 17:11
 **/
public class LinkedQueueExample {

    private static LinkedBlockingQueue queue = new LinkedBlockingQueue<String>(2);

    /**
     * 原则：都是先入先出
     * add  添加成功返回true，失败抛异常
     * poll 获取一个队列数据并删除，不存在返回null
     * put 阻塞试的放入队列，队列满了则阻塞等待别的线程取走数据才能放入
     * take 队列有数据则直接获取并删除一个，没数据阻塞等待其它线程放入数据
     * offer 添加数据，队列满了不阻塞，直接返回false表示添加失败
     * peek 获取队列数据且不删除，获取不到则返回null
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println(queue.poll());

        queue.add("2");
//        queue.put("1");
        boolean offer = queue.offer("3");
        System.out.println(offer);
        Object peek = queue.peek();
        System.out.println(peek);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.take());
    }
}
