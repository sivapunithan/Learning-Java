package OOPS.Introduction;

public class Main {
    public static void main(String[] args) {
       
        Student punithan = new Student();
        System.out.println(punithan);

    }

    static class Student{
        int rno;
        String name;
        float marks;

        // public Student(int rno, String name, float marks){
        //     this.rno = rno;
        //     this.name = name;
        //     this.marks = marks;
        // }
    }
}
