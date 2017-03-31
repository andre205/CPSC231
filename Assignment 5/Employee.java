public class Employee
{
    private String name;
    private Date hireDate;

    public Employee( )
    {
         name = "No name";
         hireDate = null;
    }

    public Employee(String theName, Date theDate)
    {
        name = theName;
		hireDate = theDate;
    }

    public String getName( )
    {
        return name;
    }

    public Date getHireDate( )
    {
        return hireDate;
    }

    /**
     Precondition newName is not null.
    */
    public void setName(String newName)
    {
        if (newName == null)
        {
             System.out.println("Fatal Error setting employee name.");
             System.exit(0);
        }
       else
            name = newName;
    }

    /**
     Precondition newDate is not null.
    */
    public void setHireDate(Date newDate)
    {
        hireDate = newDate;
    }


    public String toString( )
    {
        return (name + " " + hireDate.toString( ));
    }


    public boolean equals(Employee otherEmployee)
    {
        return (name.equals(otherEmployee.name)
                       && hireDate.equals(otherEmployee.hireDate));
    }
}
