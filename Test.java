import java.io.File;
import java.io.IOException;

public class Test {
    File file;
    public Test(File file){
        this.file = file;
    }

    public void findFile(){
        synchronized(this){
            while(!file.exists()){
                try {
                    System.out.println("before wait:");
                    this.wait();
                    System.out.println("after wait:");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void createFile(){
        synchronized(this){
            try {
                System.out.println("before create a new file:");
                file.createNewFile();
                System.out.println("after create a new file:");
                this.notify();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Test t = new Test(new File("C:\\Users\\johnb\\Deepika\\CodingPractice\\src\\main\\resources\\junkText"));
        Thread t1 = new Thread(new FindFile(t));
        Thread t2 = new Thread(new CreateFile(t));
        t1.start();
        t2.start();
    }
}

class FindFile implements Runnable{
    Test t;
    public FindFile(Test t){
        this.t = t;
    }

    @Override
    public void run(){
        t.findFile();
    }
}

class CreateFile implements Runnable{
    Test t;

    public CreateFile(Test t){
        this.t = t;
    }

    @Override
    public void run(){
        t.createFile();
    }
}


