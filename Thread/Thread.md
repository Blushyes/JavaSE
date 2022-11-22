# Thread

## 实现线程的两种方式

1. **直接继承`Thread`类**
2. **实现`Runnable`类**

直接继承`Thread`类：

~~~java
class A extend Thread{
	@Override
    public void run() {
    	...
    }
}

class B{
    public static void main(String[] args){
        A a = new A();
        //注意这里是start()而不是run()
        //单纯调用run()是做不到新建线程的
        //这里用到了代理模式，start()对run()进行了增强，即创建了线程
        //start()底层用到了一个叫start0()的native方法
        a.start();
    }
}
~~~

实现`Runnable`类：

~~~java
class A implements Runnable{
    @Override
    public void run() {
    	...
    }
}

class B{
    public static void main(String[] args){
        Thread a = new Thread(new A());
        a.start();
    }
}
~~~

## 线程同步

即当有一个线程在对内存进行操作时，其他线程都不可以对这个内存地址进行操作，直到该线程完成操作， 其他线程才能对该内存地址进行操作，而其他线程又处于等待状态，实现线程同步的方法有很多，临界区对象就是其中一种。即：

**防止多个线程同时对一块资源进行操作**。

### 线程同步的方式

1. 方法签名上用`synchronized`
2. `synchronized`代码块

方法签名上用`synchronized`：

~~~java
public synchronized void fun(){
	...
}
~~~

`synchronized`代码块：

~~~java
synchronized (Object){    //Object为作为锁的对象如this
	...
}
~~~

## 互斥锁

为了实现线程同步，java中引入了互斥锁的概念，只有得到锁的线程才有权访问资源，未得到锁的线程则处于阻塞状态即`BLOCKED`状态。

**锁其实就是一个标记，用于标记该对象同一时刻只能由一个线程来访问。**