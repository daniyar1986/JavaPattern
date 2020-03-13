package creational.factory.suleimanov;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

        DeveloperFactory developerFactory1 = new CppDeveloperFactory();
        developer = developerFactory1.createDeveloper();
        developer.writeCode();
    }
}
