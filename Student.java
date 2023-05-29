public class Student implements Observer{
    private  String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String companyName, String vacancyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [Компания %s предлагает вакансию - %s, с заработной платой - %.2f руб.]\n", name, companyName, vacancyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [Компания %s предлагает вакансию - %s, с заработной платой - %.2f руб.]\n", name, companyName, vacancyName, salary);
        }        
    }  
}
