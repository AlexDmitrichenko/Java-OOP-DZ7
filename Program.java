public class Program {
    /**
     * TODO: Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google",  100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);
        
        Master ivanov = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Student petrov = new Student("Petrov");
        Worker zaharov = new Worker("Zaharov");
        Worker burakov = new Worker("Burakov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(zaharov);
        jobAgency.registerObserver(burakov);

        for (int i = 0; i < 3; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }
}
