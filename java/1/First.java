//creating array of objects
class Students{
    String name;
    int rollno;
    int marks;
}
public class First{
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name="sagar";
        s1.rollno=21;
        s1.marks=80;

        Students s2 = new Students();
        s2.name="rounak";
        s2.rollno=22;
        s2.marks=85;

        Students s3 = new Students();
        s3.name="utkarsh";
        s3.rollno=23;
        s3.marks=90;

        Students students[]=new Students[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+ " "+students[i].rollno+" "+students[i].marks);
        }

        //enhanced for loop
        for (Students student : students) {
                    System.out.println(student.name+ " "+student.rollno+" "+student.marks);
                }


    }
}