package Decorator.league;

public class Skill_W extends Skills {

    private String skillName;

    public Skill_W(Haro haro, String skillName) {
        super(haro);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能"+skillName);
        super.learnSkills();
    }
}
