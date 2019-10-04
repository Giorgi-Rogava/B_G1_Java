package btu;

public class TestException {
    public void exceptionOne(){
        int [] m = {1, 2, 3, 4, 5};

        try {
            System.out.println(m[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Finally Block");
        }
    }
    public void exceptionTwo() throws Exception{
        Thread.sleep(3000);
        System.out.println("This message from Ex");
    }
}
