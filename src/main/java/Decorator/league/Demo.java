package Decorator.league;

public class Demo {
    public static void main(String[] args) {
        Haro haro = new BlindMonk("盲僧");

        Skills q = new Skill_Q(haro,"天音波");
        Skills w = new Skill_W(haro,"金钟罩");
        Skills e = new Skill_E(haro,"天雷破");
        Skills r = new Skill_R(haro,"猛龙摆尾");

        q.learnSkills();
    }
}


