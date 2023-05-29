public class Master implements Observer{
    private  String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String companyName, String vacancyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [Компания %s предлагает вакансию - %s, с заработной платой - %.2f руб.]\n", name, companyName, vacancyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [Компания %s предлагает вакансию - %s, с заработной платой - %.2f руб.]\n", name, companyName, vacancyName, salary);
        }  
    } 
}
