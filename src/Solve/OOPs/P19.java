package Solve.OOPs;

class Personn{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age>=0) {
            this.age = age;
        }
        else{
            this.age = -1;
        }
    }
}
public class P19 {
    public static void main(String[] args) {
        Personn a = new Personn();
        a.setName("Priyam");
        System.out.println(a.getName());

        a.setAge(-12);
        System.out.println(a.getAge());
    }
}
