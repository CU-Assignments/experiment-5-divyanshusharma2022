import java.util.ArrayList;
import java.util.List;

public class exp5 {
    public static void main(String[] args) {
        String[] stringNumbers = {"1", "2", "3", "4", "5"};
        List<Integer> integers = parseStringArray(stringNumbers);
        int sum = calculateSum(integers);
        System.out.println("Sum of the list of integers: " + sum);
    }

    public static List<Integer> parseStringArray(String[] stringNumbers) {
        List<Integer> integers = new ArrayList<>();
        for (String str : stringNumbers) {
            integers.add(Integer.parseInt(str));
        }
        return integers;
    }

    public static int calculateSum(List<Integer> integers) {
        int sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }
}

