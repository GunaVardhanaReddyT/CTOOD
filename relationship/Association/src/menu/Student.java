package menu;

public class Student 
{
	String name;
	long id;
	int tm;
	void addStudent(String name, long id,int tm)
	{
		this.name=name;
		this.id=id;
		this.tm=tm;
	}
	static boolean searchById(Student s[],int size,long n)
	{
		int i=0;
		for(i=0; i<size;i++)
		{
			if(s[i].id==n)
			{
				return true;
			}
		}
		return false;
	}
	static boolean searchByName(Student s[], int size,String nam)
	{
		int i=0;
		for(i=0; i<size; i++)
		{
			if(s[i].name.equals(nam))
				return true;
		}
		return false;
	}
	static void sortById(Student s[], int size)
	{
		Student temp;
		int i,j;
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(s[j].id>s[j+1].id)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	}
	static void sortByTm(Student s[], int size)
	{
		Student temp;
		int i,j;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(s[j].tm>s[j+1].tm)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	}
	static boolean updateNameById(Student s[],int size,String n,long d)
	{
		for(int i=0; i<size; i++)
		{
			if(s[size].id==d)
			{
				s[size].name=n;
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", tm=" + tm;
	}
	
	
}
