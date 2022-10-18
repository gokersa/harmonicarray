
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2};
        double sum = 0;

        for (double i : numbers ){
            sum += 1 / i;
        }
        System.out.println(numbers.length/sum);
    }
}