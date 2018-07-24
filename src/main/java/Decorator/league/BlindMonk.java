package Decorator.league;

public class BlindMonk implements Haro {

    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name+"学习了技能");
    }
}
