import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Membuat objek HealthRecord untuk pasien pertama
        HealthRecord<String> patient1Health = new HealthRecord<>();
        patient1Health.addData("Blood Pressure", "120/80");
        patient1Health.addData("Heart Rate", "75 bpm");
        patient1Health.addData("Temperature", "36.5°C");

        // Menampilkan data kesehatan pasien pertama
        System.out.println("Patient 1 Health Record:");
        patient1Health.displayData();
        System.out.println();

        // Membuat objek HealthRecord untuk pasien kedua
        HealthRecord<Integer> patient2Health = new HealthRecord<>();
        patient2Health.addData("Blood Pressure", 130);
        patient2Health.addData("Heart Rate", 72);
        patient2Health.addData("Temperature", 37);

        // Menampilkan data kesehatan pasien kedua
        System.out.println("Patient 2 Health Record:");
        patient2Health.displayData();
        System.out.println();

        // Membuat ArrayList untuk menyimpan data tinggi badan pasien dalam cm
        ArrayList<Integer> heightData = new ArrayList<>();
        heightData.add(170);
        heightData.add(165);
        heightData.add(180);

        // Menghitung rata-rata tinggi badan pasien
        double averageHeight = HealthApp.calculateAverage(heightData);
        System.out.println("Average Height: " + averageHeight + " cm");
    }
}
