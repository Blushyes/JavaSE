public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        //没有实现线程同步
        System.out.println("未实现线程同步：");
        ThreadTestNotSynchro threadTestA = new ThreadTestNotSynchro();
        Thread threadA = new Thread(threadTestA);
        Thread threadB = new Thread(threadTestA);
        threadA.start();
        threadB.start();
        /*
            未实现线程同步：
            1
            2
            4
            3
            5
            6
            7
            7
            8
            8
            9
            10
            11
            12
            13
            14
            15
            15
            16
            16
        */

        //等待ThreadA和ThreadB执行完
        threadA.join();
        threadB.join();

        //实现了线程同步
        System.out.println("实现线程同步：");
        ThreadTestSynchro threadTestB = new ThreadTestSynchro();
        Thread threadC = new Thread(threadTestB);
        Thread threadD = new Thread(threadTestB);
        threadC.start();
        threadD.start();
        /*
            实现线程同步：
            1
            2
            3
            4
            5
            6
            7
            8
            9
            10
            11
            12
            13
            14
            15
            16
            17
            18
            19
            20
        */
    }
}

class ThreadTestNotSynchro implements Runnable{
    private int count = 0;

    private void increaseOne(){
        System.out.println(++count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            increaseOne();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadTestSynchro implements Runnable{
    private int count = 0;

    private synchronized void increaseOne(){
        System.out.println(++count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            increaseOne();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}