package chapter5;

public class PersonTest {
    public static void main(String[] args){
        Person personLee = new Person();
        personLee.name = "이유신";
        personLee.weight = 85.5F;
        personLee.height = 180.0F;

        Person personKim = new Person("김유신",170,65);

    }
}
