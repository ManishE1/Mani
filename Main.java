import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup p=new StudentGroup(5);

	Date d=new Date(1997,02,05);
	Student p1=new Student(20,"Mani",d,89.0);

                p.addFirst(p1);

              System.out.println(p.getStudent(0).getId());






	}

}
