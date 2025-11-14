package bai4cham2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John","New York");
        System.out.println(p1.toString());

        Student s1 = new Student("Michael","Los Angeles","Computer Science",2022,15000.0);
        System.out.println(s1.toString());

        Staff st1 = new Staff("Sarah","Chicago","High School",50000.0);
        System.out.println(st1.toString());
    }       
    
}
