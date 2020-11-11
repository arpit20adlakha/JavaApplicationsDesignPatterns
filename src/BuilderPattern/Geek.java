package BuilderPattern;

import java.util.List;

public class Geek {
    private String type;
    private List<String> languages;
    private int experience;

    public Geek(String type, List<String> languages, int experience) {
        this.type = type;
        this.languages = languages;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Type :" + type + "\n" + "Languages : "
                + languages + "\n" + "Experience" + experience + " years";
    }
}
