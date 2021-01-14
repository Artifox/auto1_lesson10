public class Runner {
    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println(number);
        System.out.println(multipleByFiveAndThree(Integer.MAX_VALUE));
        System.out.println(multipleByFive(Integer.MAX_VALUE));
        System.out.println(multipleByThree(Integer.MAX_VALUE));
    }

    public static int multipleByFiveAndThree(int number){
        if (number > 0){
            for (int i = number; i > 0; i--){
                if (i % 3 == 0 && i % 5 == 0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int multipleByThree(int number){
        if (number > 0){
            for (int i = number; i > 0; i--){
                if (i % 3 == 0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int multipleByFive(int number){
        if (number > 0){
            for (int i = number; i > 0; i--){
                if (i % 5 == 0){
                    return i;
                }
            }
        }
        return -1;
    }



}
