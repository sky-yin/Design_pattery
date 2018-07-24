package Decorator.league;

public class Skills implements Haro {

    private Haro haro;

    public Skills(Haro haro) {
        this.haro = haro;
    }

    @Override
    public void learnSkills() {
        if (haro != null)
            haro.learnSkills();
    }
}
