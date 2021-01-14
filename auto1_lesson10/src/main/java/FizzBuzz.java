import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzz {

    public String fizzBuzzFunc(int number){
        if (number > 0){
            if (number % 3 == 0 && number % 5 == 0){
                return "TMS";
            } else if (number % 3 == 0){
                return "T";
            } else if (number % 5 == 0){
                return "M";
            } else {
                return "Number is not multiple 3 or 5";
            }
        }
        return "Not valid number";
    }

    @Test
    public void test1(){
        String result = fizzBuzzFunc(3);
        Assert.assertEquals(result, "T");
    }

    @Test
    public void test2(){
        String result = fizzBuzzFunc(2147483646);
        Assert.assertEquals(result, "T");
    }
    @Test
    public void test3(){
        String result = fizzBuzzFunc(5);
        Assert.assertEquals(result, "M");
    }

    @Test
    public void test4(){
        String result = fizzBuzzFunc(2147483645);
        Assert.assertEquals(result, "M");
    }

    @Test
    public void test5(){
        String result = fizzBuzzFunc(15);
        Assert.assertEquals(result, "TMS");
    }

    @Test
    public void test6(){
        String result = fizzBuzzFunc(2147483640);
        Assert.assertEquals(result, "TMS");
    }

    @Test
    public void test7(){
        String result = fizzBuzzFunc(11);
        Assert.assertEquals(result, "Number is not multiple 3 or 5");
    }

    @Test
    public void test8(){
        String result = fizzBuzzFunc(0);
        Assert.assertEquals(result, "Not valid number");
    }

    @Test
    public void test9(){
        String result = fizzBuzzFunc(-1);
        Assert.assertEquals(result, "Not valid number");
    }

    //как проверять такие тесты, когда число неизвестно?
    @Test
    public void test10(){
        String result = fizzBuzzFunc(Integer.MAX_VALUE + 1);
        Assert.assertEquals(result, "Not valid number");
    }


/*
* Valid equivalence partition | Invalid equivalence partition
* {3, ..., 2147483646}           2 invalid below and above
* {5, ..., 2147483645}           2 invalid below and above
* {15, ..., 2147483640}          2 invalid below and above
*
* {Number that not multiple on 3 and 5 e.g 11}
*
* */
}
