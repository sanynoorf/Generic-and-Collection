import java.util.HashMap;

public class HealthRecord<T> {
    private HashMap<String, T> healthData;

    // Constructor
    public HealthRecord() {
        healthData = new HashMap<>();
    }

    // Method untuk menambahkan data kesehatan pasien
    public void addData(String key, T value) {
        healthData.put(key, value);
    }

    // Method untuk mendapatkan data kesehatan pasien berdasarkan key
    public T getData(String key) {
        return healthData.get(key);
    }

    // Method untuk menampilkan seluruh data kesehatan pasien
    public void displayData() {
        System.out.println("Health Record:");
        for (String key : healthData.keySet()) {
            System.out.println(key + ": " + healthData.get(key));
        }
    }
}
