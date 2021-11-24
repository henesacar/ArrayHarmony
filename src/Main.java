
public class Main {
    public static void main(String[] args) {
        int[] data = {10,52,34,69,85,21};
        double sum = 0;
        for (int i : data) {
        sum += 1.0/i;
        }
        System.out.println(sum);
    }
}
