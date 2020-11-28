package lesson1;

public class Lesson1HomeWork {
    public static void main(String[] args) {

        System.out.println("Task1:");
        System.out.println(task1(0));

        System.out.println();
        System.out.println("Task2:");
        System.out.println(task2(2,9));

        System.out.println();
        System.out.println("Task3:");
        System.out.println(task3(2,2,4));

        System.out.println();
        System.out.println("Task4:");
        ResultSet result = task4(2,-1,0);
        System.out.println("Number of positive: " + result.value1);
        System.out.println("Number of negative: " + result.value2);

        System.out.println();
        System.out.println("Task5:");
        System.out.println(task5(-1000000000));
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

    public static int task2(int a, int b){
        return Math.max(a, b);
        //return a < b ? b : a;
    }

    public static int task3(int a, int b, int c){
        int numberOfPositive = 0;
        if(a > 0){
            numberOfPositive++;
        }
        if (b > 0){
            numberOfPositive++;
        }
        if (c > 0){
            numberOfPositive++;
        }
        return numberOfPositive;
    }

    public static ResultSet task4(int a, int b, int c){
        int numberOfPositive = 0;
        int numberOfNegative = 0;

        if(a > 0){
            numberOfPositive++;
        } else if (a < 0){
            numberOfNegative++;
        }
        if (b > 0){
            numberOfPositive++;
        } else if (b < 0){
            numberOfNegative++;
        }
        if (c > 0){
            numberOfPositive++;
        } else if(c < 0){
            numberOfNegative++;
        }
        return new ResultSet(numberOfPositive, numberOfNegative);
    }

    public static String task5(int number){
        String result;
        String postfix;
        int numberOfDigits  = String.valueOf(number).length();

        String numberInString = String.valueOf(number);
        if (numberInString.substring(numberInString.length()-1).equals("4") ||
                numberInString.substring(numberInString.length()-1).equals("3") ||
                numberInString.substring(numberInString.length()-1).equals("2")){
            postfix = "-х";
        }else if (numberInString.substring(numberInString.length()-1).equals("1")){
            postfix = "-о";
        } else{
            postfix = "-и";
        }

        if (number < 0){
            numberOfDigits-=1;
            result = number + " - это отрицательное " + numberOfDigits + postfix + " значное число";
        } else {
            result = number + " - это положительное " + numberOfDigits + postfix + " значное число";
        }
        return result;

    }

    static public class ResultSet {
        private int value1, value2;
        private String stringValue;

        public ResultSet(int value1, int value2){
            this.value1 = value1;
            this.value2 = value2;
        }

        public ResultSet(int value1, String stringValue){
            this.value1 = value1;
            this.stringValue = stringValue;
        }
    }
}


