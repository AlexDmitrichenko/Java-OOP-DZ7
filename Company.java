import java.util.Random;

public class Company implements GetVacancy{
    private static Random random;
    private String nameCompany;
    private double maxSalary;
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        random = new Random();
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }
    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */
    public void needEmployee(){
        String vacancy = getVacancy();
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(nameCompany, vacancy, salary);
    }
}