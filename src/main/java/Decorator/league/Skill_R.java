package Decorator.league;

public class Skill_R extends Skills {

    private String skillName;

    public Skill_R(Haro haro, String skillName) {
        super(haro);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能"+skillName);
        super.learnSkills();
    }
}
