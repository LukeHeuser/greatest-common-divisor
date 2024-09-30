public class Main {
    public static void main(String[] args) {
        greatestCommonDivisor(45,-432);
        greatestCommonDivisor(89+45,987);
        greatestCommonDivisor(50,100);
        greatestCommonDivisor(770,680);
        greatestCommonDivisor(600,432);
        greatestCommonDivisor(-95,432);
        greatestCommonDivisor(Integer.MAX_VALUE,1025);
    }

    public static int greatestCommonDivisor(int first, int second) {

        if(first < 10 || second < 10 ) {
            System.out.println("Must be greater than 9");
            return -1;
        }

        int greatestDivisor = 0;
        for (int i = 1; i <= first && i <= second; i++){

            if (first % i == 0 && second % i == 0) {
                greatestDivisor = i;
            }
        }
        System.out.println(greatestDivisor);
        return greatestDivisor;

    }
}

