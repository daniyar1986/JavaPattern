package creational.factory.refactoring_guru;

import creational.factory.refactoring_guru.factory.Dialog;
import creational.factory.refactoring_guru.factory.HtmlDialog;
import creational.factory.refactoring_guru.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
       configure();
       runBusinessLogic();
    }

    static void configure(){
        if (System.getProperty("os.name").equals("Linux")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
