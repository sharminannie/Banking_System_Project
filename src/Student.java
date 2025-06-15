import java.util.Random;
public class Student 
{
	    Random rand = new Random();
		String name;
		public String id;
		double creditCom;
		double cgpa;
		public Student(String name,double creditCom ,double cgpa) 
		{
		    this.name=name;
		    this.id="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
		    this.creditCom=creditCom;
		    this.cgpa=cgpa;
	    }
		public void updateCgpa(double courseCredit,double courseGpa)
		{
	       cgpa=((cgpa*creditCom)+(courseCredit*courseGpa))/(creditCom+courseCredit);
		   creditCom+=courseCredit;
		}
		public double getCgpa()
		{
		return cgpa;
		}

		public String toString()
		{
			 return String.format("Name:%s, ID:%s,Completed Credits: %.2f,CGPA:%.2f",name,id,creditCom,cgpa);
		}

	}


