package _0406_;

public class HistoricPerson {
    private String name;
    private String achievement;
    private String country;

public HistoricPerson(String name, String achievement, String country) {
    this.name = name;
    this.achievement = achievement;
    this.country = country;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String toString() {
        return String.format("%s(%s, %s)", name, achievement, country);
    }
    public String getPersonInfo(String achievement) {
        if(achievement.equals(this.achievement))
        return this.name;
        else return null;
    }


}
