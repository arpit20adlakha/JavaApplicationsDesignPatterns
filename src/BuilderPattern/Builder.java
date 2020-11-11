package BuilderPattern;

import java.util.List;

public interface Builder {
    public void setType(String type);
    public void setLanguages(List<String> languages);
    public void setExperience(int experience);
}
