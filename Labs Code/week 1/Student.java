class Student
{
	int roll;
	String name,branch,university;
	void set(int r,String n,String b,String u)
	{
		roll=r;
		name=n;
		branch=b;
		university=u;
	}
	void show()
	{
		System.out.println("Name="+name+"\nRoll no. ="+roll+"\nBranch="+branch+"\nUniversity="+university);
	}
	public static void main(String args[])
	{
		Student a=new Student();
		a.set(1,"Kinshuk","CSE","GEHU");
		a.show();
	}
	
}
