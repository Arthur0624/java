import java.util.Scanner;

public class homeworkException {
    public static void main(String[] args) throws AgeExcetion {
        System.out.println("请输入年龄：");
        Scanner sc  = new Scanner(System.in);
        int age = sc.nextInt();
        Person person = new Person();
        person.setAge(age);
    }
}

class AgeExcetion extends Exception {
    public AgeExcetion() {
        super("年龄超出范围~");
    }

    public AgeExcetion(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age ;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) throws AgeExcetion {
       if (age <= 0 || age >= 200){
           System.out.println("输入年龄需要在0~200之内");
           throw new AgeExcetion();
       }
       else{
           this.age = age;
           System.out.println("年龄保存成功");
       }

    }
}
