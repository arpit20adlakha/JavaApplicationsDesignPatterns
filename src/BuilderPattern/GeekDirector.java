package BuilderPattern;

import java.util.ArrayList;

public class GeekDirector {
    public void buildAdmin(Builder builder) {
        builder.setType("Admin");
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Perl");
        languages.add("PowerShell");
        builder.setLanguages(languages);
        builder.setExperience(10);
    }
}
