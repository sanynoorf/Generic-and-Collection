import java.util.ArrayList;

public class HealthApp {
    // Generic method untuk menghitung rata-rata dari koleksi angka
    static <T extends Number> double calculateAverage(ArrayList<T> numbers) {
        double sum = 0;
        for (T num : numbers) {
            sum += num.doubleValue();
        }
        return sum / numbers.size();
    }
}
