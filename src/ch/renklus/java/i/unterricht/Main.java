package ch.renklus.java.i.unterricht;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Test<String> test = new Test<String>();
        Test<String> test2 = new Test<>();
        Test<String> test3 = new Test();

        String testName = test.getClass().getName();
        String test2Name = test2.getClass().getName();
        String test3Name = test3.getClass().getName();

        test.calc(4);

        System.out.println(testName);
        System.out.println(test2Name);
        System.out.println(test3Name);
    }
}
