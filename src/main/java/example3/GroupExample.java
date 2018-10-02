package example3;

import org.testng.annotations.Test;

public class GroupExample {
    @Test(groups = "Regression")
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(groups = "Regression")
    public void test2(){
        System.out.println("Test 2");
    }

    @Test(groups = "Regression")
    public void test3(){
        System.out.println("Test 3");
    }

    @Test(groups = "Regression")
    public void test4(){
        System.out.println("Test 4");
    }
}
