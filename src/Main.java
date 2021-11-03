public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 70;
        float h = (float) 1.8;
        int bodyMassIndex = (int) service.calculate(m, h);
        System.out.println(bodyMassIndex);
    }
}
