package creational.factory.refactoring_guru.factory;

import creational.factory.refactoring_guru.button.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
