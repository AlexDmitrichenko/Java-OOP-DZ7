public interface GetVacancy {
    public default String getVacancy(){
        Vacancy vacancy = new Vacancy();
        return vacancy.vacancyName;
    }
}
