package creational.factory.refactoring_guru.factory;

import creational.factory.refactoring_guru.button.Button;
import creational.factory.refactoring_guru.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
