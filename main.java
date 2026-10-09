import java.util.Scanner;
void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number of students: ");
    int studentsNum = scanner.nextInt();

    String name;
    String facNum;
    double grade;

    Student[] students = new Student[studentsNum];

    for (int i = 0; i < studentsNum; i++) {

        name = scanner.next();
        facNum = scanner.next();
        grade = scanner.nextDouble();

        students[i] = new Student(name,facNum,grade);
    }

    for (Student student : students)
    {

        if (student.grade>=3)
        {
            System.out.println(student.name);
            System.out.println(student.facNum);
            System.out.println(student.grade);
        }

    }

    scanner.close();
}



