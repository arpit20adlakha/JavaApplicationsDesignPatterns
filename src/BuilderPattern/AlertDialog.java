package BuilderPattern;

public class AlertDialog {
    private  String title;
    private  String text;
    private  String applyButton;
    private  String cancelButton;
//    private  String footer;
//    private  String picture;

    private AlertDialog(String title, String text, String applyButton, String cancelButton) {
        this.title = title;
        this.text = text;
        this.applyButton = applyButton;
        this.cancelButton = cancelButton;
//        this.footer = footer;
//        this.picture = picture;
    }

//    AlertDialog(String title, String text) {
//        this.title = title;
//        this.text = text;
//    }

    @Override
    public String toString() {
        String str = "";

        if (title != null) {
            str +="The title is: \"" + title + "\"\n";
        }

        if (text != null) {
            str += "The text is: \"" + text + "\"\n";
        }

        if (applyButton != null) {
            str += "The applyButton is: \"" + applyButton + "\"\n";
        }

        if (cancelButton != null) {
            str += "The cancelButton is: \"" + cancelButton + "\"\n";
        }

        return str;
    }

    static class Builder {
        private String title;
        private String text;
        private String applyButton;
        private String cancelButton;

        Builder() {}

        Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        Builder setText(String text) {
            this.text = text;
            return this;
        }

        Builder setApplyButton(String applyButton) {
            this.applyButton = applyButton;
            return this;
        }

        Builder setCancelButton(String cancelButton) {
            this.cancelButton = cancelButton;
            return this;
        }

        AlertDialog build() {
            return new AlertDialog(title, text, applyButton, cancelButton);
        }

    }
}
