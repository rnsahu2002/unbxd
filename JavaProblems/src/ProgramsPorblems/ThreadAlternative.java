package ProgramsPorblems;

public class ThreadAlternative extends Thread
{
static StringBuffer  object = new StringBuffer("");

public static void main(String[] args) throws InterruptedException {



    Thread t1 = new ThreadAlternative();
    Thread t2 = new ThreadAlternative();

    t1.setName("1");
    t2.setName("2");

    t1.start();
    //System.out.println();
    t2.start();
}

@Override
public void run() {
    try {
		working();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

void working() throws InterruptedException {
    while (true) {
        synchronized (object) {
            System.out.println("old:"+Thread.currentThread().getName());
		//	System.out.println();
			object.notify();
            //System.out.println("new :"+Thread.currentThread().getName());

            object.wait();
        }
    }
}  
}

