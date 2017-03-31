public class Record
{
	//Member variables
	int mquiz1;
	int mquiz2;
	int mquiz3;
	int mmidterm;
	int mfinal;

	//Default constructor
	public Record()
	{
		mquiz1 = 0;
		mquiz2 = 0;
		mquiz3 = 0;
		mmidterm = 0;
		mfinal = 0;
	}
	
	//Overloaded constructor
	public Record(int quiz1, int quiz2, int quiz3, int midterm, int fin)
	{
		mquiz1 = quiz1;
		mquiz2 = quiz2;
		mquiz3 = quiz3;
		mmidterm = midterm;
		mfinal = fin;
	}
	
	//Course Score. Calculates weighted percentages and sums them for weighted course score
	public int getCourse()
	{
		int course = 0;
		double perq1 = (mquiz1 * 10);
		double perq2 = (mquiz2 * 10);
		double perq3 = (mquiz3 * 10);
		double wq = ((perq1+perq2+perq3)/3)*.25;
		
		double wm = mmidterm * .35;
		double wf = mfinal * .4;
		
		double dcourse = wq + wm + wf;
		
		//Cast the double as an int to clean it up (rounds down)
		course = (int)dcourse;

		return course;
	}
	
	//Letter grade based on getCourse
	public String getGrade()
	{
		String grade = "";
		int c = getCourse();
		if (c < 60)
		{
			grade = "F";
		}
		else if (c < 70)
		{
			grade = "D";
		}
		else if (c < 80)
		{
			grade = "C";
		}
		else if (c < 90)
		{
			grade = "B";
		}
		else if (c >= 90)
		{
			grade = "A";
		}
		return grade;
	}
	
	//Mutator Methods (Not used - I used the constructor instead)
	public void setQuiz1(int q)
	{
		mquiz1 = q;
	}
	public void setQuiz2(int q)
	{
		mquiz2 = q;
	}
	public void setQuiz3(int q)
	{
		mquiz3 = q;
	}
	public void setMidterm(int q)
	{
		mmidterm = q;
	}
	public void setFinal(int q)
	{
		mfinal = q;
	}
	
	//Accessor Methods (Not used - I used the toString method instead)
	public int getQuiz1()
	{
		return mquiz1;
	}
	public int getQuiz2()
	{
		return mquiz2;
	}
	public int getQuiz3()
	{
		return mquiz3;
	}
	public int getMidterm()
	{
		return mmidterm;
	}
	public int getFinal()
	{
		return mfinal;
	}

	//Equals method
	public Boolean equalsScore(Record a)
	{
		return (getCourse() == a.getCourse() && getGrade() == a.getGrade());
	}

	//toString method, returns all of the grade info nicely formatted
	public String toString()
	{
		return (" Q1: " + mquiz1 + "\n Q2: " + mquiz2 + "\n Q3: " + mquiz3 + "\n Midterm: " + mmidterm + "\n Final: " + mfinal + "\n Course Total: " + getCourse() + "\n Course Grade: " + getGrade());
	}
}