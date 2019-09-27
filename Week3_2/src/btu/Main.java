package btu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestClass test1 = new TestClass();
        test1.name = "Sandro";
        test1.lastName = "Chkadua";
        test1.setAge(20);
        test1.printNameAndLastname();
        System.out.println(test1.returnAgeAfterFourYear());

        TestClass test2 = new TestClass();
        test2.name = "Sandro";
        test2.lastName = "Melia";
        test2.printNameAndLastname();
    }
}
