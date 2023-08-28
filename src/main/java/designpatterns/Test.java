package designpatterns;

public class Test implements Runnable{
    public static void main(String[] args) {
    //EmployeeBuilder eb= EmployeeBuilder.Builder.getBuilder().id(1).name("Amit").department("HR").salary(50000).build();
    //System.out.println(eb.toString());



        Test t1 = new Test();
        Thread th1 = new Thread(t1);

        Test t2 = new Test();
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();

    }

    /**
     *
     */
    @Override
    public void run() {
        SingletonPattern sb = SingletonPattern.getSinglePatternInstance();
    }
}
