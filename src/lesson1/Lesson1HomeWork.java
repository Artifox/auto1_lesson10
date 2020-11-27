package lesson1;

public class Lesson1HomeWork {
    public static void main(String[] args) {
        System.out.println("Lesson1 HomeWork");
        System.out.println(task1(0));
    }


    public static int task1(int number){
        if(number > 0) {
            number++;
        } else if(number < 0){
            number-=2;
        } else {
            number = 10;
        }
        return number;
    }
}
