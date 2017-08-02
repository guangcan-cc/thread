package cc.blog.test;

public class Demo {

    public static class Task implements Runnable {
        public static boolean flag = true;
        private long beginTime = System.currentTimeMillis();

        @Override
        public void run() {
            int i = 0;
            while (flag) {
                i++;
                System.out.println(i);
            }
            System.out.println(System.currentTimeMillis() - beginTime + " i = " + i);
        }
    }


    public static class Task2 implements Runnable {
        public static boolean flag = true;
        private long beginTime = System.currentTimeMillis();

        @Override
        public void run() {
            int i = 0;
            while (flag) {

                i = i+1;
                i = i+1;
                if(true){
                    i++;
                }
                int b = 0;
                b = b+i;
                synchronized (this){

                }

            }
            System.out.println(System.currentTimeMillis() - beginTime + " i = " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//		new Thread(new WhyDemo.Task()).start();
//		Thread.sleep(300);
//		WhyDemo.Task.flag = false;
        new Thread(new Demo.Task2()).start();
        Thread.sleep(300);
        Demo.Task2.flag = false;

    }

}

