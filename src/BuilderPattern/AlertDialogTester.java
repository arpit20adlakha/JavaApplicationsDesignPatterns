package BuilderPattern;

public class AlertDialogTester {
    public static void main(String[] args) {
//        AlertDialog alertDialog = new AlertDialog("title", "text", "applyButton", "cancelButton", "footer", "pathToPicture");
    AlertDialog twoButtonsDialog = new AlertDialog.Builder()
                                                  .setTitle("Two Buttons dialog")
                                                  .setText("You can use either Okay or Cancel")
                                                  .setApplyButton("Okay")
                                                  .setCancelButton("Cancel")
                                                  .build();

    System.out.println(twoButtonsDialog);
    AlertDialog oneButtonDialog = new AlertDialog.Builder()
                                                  .setTitle("One Button Dialog")
                                                  .setText("You can use `Close` only")
                                                  .setCancelButton("Close")
                                                  .build();
        System.out.println(oneButtonDialog);
    }
}
