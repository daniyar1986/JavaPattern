package creational.factory.refactoring_guru.factory;

import creational.factory.refactoring_guru.button.Button;
import creational.factory.refactoring_guru.button.WindowButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
