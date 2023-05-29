import java.util.Random;

public class Vacancy {
    final String[] vacancyList = {"водитель", "программист", "уборщик", "менеджер"};
    Random rand = new Random();
    int index = rand.nextInt(vacancyList.length);
    public String vacancyName = vacancyList[index];

    public Vacancy() {
    }
}
