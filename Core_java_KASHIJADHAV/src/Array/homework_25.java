package Array;
//25)Write a program to create Student classhaving rollno, name, marks. Create 10 objects
//Using Array of Objects display information of student who got highest marks .

class student
{
	int roll;
	String name;
	int marks;
	
	public student(int roll,String name,int marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("name :"+name+" \nroll"+roll+"\nmarks"+marks);
	}
}
public class homework_25 {

	public static void main(String[] args)
	{
		student ss=new student(12,"dipak",88);
		student s1=new student(12,"shubham",99);
		student s2=new student(11,"adii",100);
		student s4=new student(11,"kashi",40);
		
		
		student arr[]= {ss,s1,s2};
		int max=Integer.MIN_VALUE;
		int index=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i].marks>max)
			{
				max=arr[i].marks;
				index=i;

			}
		}
		System.out.println(arr[index].marks+" "+arr[index].name+" "+arr[index].roll);

		
	}

}
