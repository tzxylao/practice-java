package com.lll.practice.stack;

import com.lll.practice.entity.User;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @author: laoliangliang
 * @description:
 * @create: 2020/6/5 17:50
 **/
public class PhantomRefrence {

    public static void main(String[] args) throws InterruptedException {
        User user = new User();
        user.setAge(12);
        user.setName("tom");
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference<User> phantomReference = new PhantomReference<User>(user, queue);
        while (true) {
            user = null;
            System.out.printf("get:%s,isEnqueued:%b\r\n", phantomReference.get(), phantomReference.isEnqueued());
            if (phantomReference.isEnqueued()) {
                break;
            }
            System.gc();
            Thread.sleep(1000);
        }
    }
}
