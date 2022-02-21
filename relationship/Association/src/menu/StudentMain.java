package menu;

import java.util.Scanner;
public class StudentMain 
{
	public static void main(String[] args) 
	{
		 int size=0;
		int ch,m,i;
		String n;
		long d;
		Student s[]=new Student[3];
		for(i=0; i<3;i++)
		{
			s[i]=new Student();
		}
		Scanner sc=new Scanner(System.in);
		boolean a=true;
		while(a)
		{
			System.out.printf("1.Add student\n2.Search ID\n3.search Name\n4.Sort by Id\n5.Sort by total\n6.Update name based on ID\n7.Display");
			System.out.printf("\nEnter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
					System.out.println("�nter Student Details");
					System.out.println("Enter name:");
					n=sc.next();
					System.out.println("Enter Student ID:");
					d=sc.nextLong();
					System.out.println("�nter Student Tm");
					m=sc.nextInt();
					s[size].addStudent(n,d,m);
					size++;
					break;
			case 2:
					System.out.println("Enter id to search:");
					d=sc.nextLong();
					if(Student.searchById(s, size, d)==true)
						System.out.println("id Found");
					else
						System.out.println("id Not Found");
					break;
			case 3:
					System.out.println("Enter name to Search:");
					n=sc.next();
					if(Student.searchByName(s, size, n))
						System.out.println("Found");
					else
						System.out.println("Not Found");
					break;
			case 4:
					Student.sortById(s, size);
					break;
			case 5:
					Student.sortByTm(s, size);
					break;
			case 6:
				System.out.println("Enter id number:");
				d=sc.nextLong();
				System.out.println("Enter name to update:");
				n=sc.next();
				if(Student.updateNameById(s, size, n, d))
						System.out.println("Updated");
				else
					System.out.println("Not updated");
				break;	
			case 7:
					for(i=0;i<size;i++)
					{
						System.out.println(s[i]);
					}
					break;
				default:
					a=false;
			}
		//	sc.close();
		}

	}

}
