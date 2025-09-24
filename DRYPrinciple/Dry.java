package DRYPrinciple;
abstract class Button {
    abstract void onClick();
}

class SubmitButton extends Button {
    @Override
    void onClick() {
        // Windows-specific click behavior
        System.out.println("Submit button");
    }
}

class CancelButton extends Button {
    @Override
    void onClick() {
        // MacOS-specific click behavior
        System.out.println("Cancel button");
    }
}

public class Dry {
    public static void main(String[] args) {
        Button submitButton = new SubmitButton();
        submitButton.onClick();

        Button cancelButton = new CancelButton();
        cancelButton.onClick();
    }
}