public class Date
{
    int month;
    int day;
    int year;

    public Date()
    {
        month = 1;
        day = 1;
        year = 1000;
    }

    public Date(int m, int d, int y)
    {
        month = m;
		day = d;
		year = y;
    }

    public void setMonth(int m)
    {
		month = m;
    }

	public void setDay(int d)
	{
		day = d;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
    public int getMonth( )
    {
        return month;
    }

    public int getDay( )
    {
        return day;
    }

    public int getYear( )
    {
        return year;
    }

    public String toString( )
    {
        return (month + " " + day + ", " + year);
    }

    public boolean equals(Date otherDate)
	{
		return (getMonth() == otherDate.getMonth() && getDay() == otherDate.getDay() && getYear() == otherDate.getYear());
    }

}