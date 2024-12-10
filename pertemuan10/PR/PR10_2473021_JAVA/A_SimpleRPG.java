
/**
 * Pertemuan 10
 * [PR]  program simple RPG
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 02 Desember 2024
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A_SimpleRPG {

    public static void main(String[] args) {

        String[][] subjek = {{"Pahlawan", "100"}, {"Monster", "90"}};
        List<Integer> damagePahlawan = new ArrayList<>();
        List<Integer> damageMonster = new ArrayList<>();
        Random random = new Random();
        int hpPahlawan = Integer.parseInt(subjek[0][1]);
        int hpMonster = Integer.parseInt(subjek[1][1]);

        while (hpPahlawan > 0 && hpMonster > 0) {
            int damage = random.nextInt(20) + 5;
            while (damagePahlawan.contains(damage)) {
                damage = random.nextInt(20) + 5;
            }
            damagePahlawan.add(damage);
            hpMonster -= damage;
            System.out.println(subjek[0][0] + " menyerang " + subjek[1][0] + " dan menyebabkan " + damage + " damage.");
            System.out.println("HP " + subjek[0][0] + ": " + hpPahlawan);
            System.out.println("HP " + subjek[1][0] + ": " + Math.max(0, hpMonster) + "\n");

            if (hpMonster <= 0) {
                break;
            }

            damage = random.nextInt(20) + 5;
            while (damageMonster.contains(damage)) {
                damage = random.nextInt(20) + 5;
            }
            damageMonster.add(damage);
            hpPahlawan -= damage;
            System.out.println(subjek[1][0] + " menyerang " + subjek[0][0] + " dan menyebabkan " + damage + " damage.");
            System.out.println("HP " + subjek[0][0] + ": " + Math.max(0, hpPahlawan));
            System.out.println("HP " + subjek[1][0] + ": " + hpMonster + "\n");
        }

        if (hpPahlawan > 0) {
            System.out.println("Pahlawan menang!");
        } else {
            System.out.println("Pahlawan kalah!");
        }
    }
}
