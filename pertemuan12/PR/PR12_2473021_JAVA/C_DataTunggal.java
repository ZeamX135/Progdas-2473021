/**
 * Pertemuan 12
 * [PR] Program yang meminta data tunggal berupa array dan dipisahkan dengan menggunakan spasi.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 15 Desember 2024
 */
package pertemuan12.PR.PR12_2473021_JAVA;

import java.util.*;

public class C_DataTunggal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input bilangan (pisahkan dengan spasi): ");
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");

        List<Integer> data = new ArrayList<>();
        for (String s : inputArray) {
            data.add(Integer.valueOf(s));
        }

        double mean = hitungMean(data);
        double median = hitungMedian(data);
        List<Integer> modus = hitungModus(data);
        int dataRange = hitungRange(data);
        double variance = hitungVariance(data, mean);
        double stdDev = Math.sqrt(variance);

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Median: %.2f\n", median);
        System.out.println("Modus (terurut): " + modus);
        System.out.printf("Range: %.2f\n", (double) dataRange);
        System.out.printf("Variance: %.2f\n", variance);
        System.out.printf("Standard deviation: %.2f\n", stdDev);
    }

    private static double hitungMean(List<Integer> data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.size();
    }

    private static double hitungMedian(List<Integer> data) {
        Collections.sort(data);
        int n = data.size();
        if (n % 2 == 0) {
            return (data.get(n / 2 - 1) + data.get(n / 2)) / 2.0;
        } else {
            return data.get(n / 2);
        }
    }

    private static List<Integer> hitungModus(List<Integer> data) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : data) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = Collections.max(frequencyMap.values());
        List<Integer> modus = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modus.add(entry.getKey());
            }
        }

        Collections.sort(modus);
        return modus;
    }

    private static int hitungRange(List<Integer> data) {
        return Collections.max(data) - Collections.min(data);
    }

    private static double hitungVariance(List<Integer> data, double mean) {
        double variance = 0;
        for (int num : data) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / data.size();
    }
}
