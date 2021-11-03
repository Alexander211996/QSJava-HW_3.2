public class BmiService {
    public long calculate(int m, float h) {
        int bodyMassIndex = (int) (m / (h * h));
        return bodyMassIndex;
    }

}
