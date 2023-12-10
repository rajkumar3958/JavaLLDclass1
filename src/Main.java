
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        s.name = "Raj";
        s.age = 24;
        s.batchName = "2k16";
        s.gender = "Male";
        System.out.println(s.toString());
    }
}