// Student ID : BC190200440
package main;

public class Employee
{
private Integer empID;
private String empName;
private String empDept;
private String empQualf;
private String empExperience;
private String empSalary;

public Employee()
{
}

public Employee(Integer empID, String empName, String empDept,String empQualf,String empExperience,String empSalary)
{
this.empID = empID;
this.empName = empName;
this.empDept = empDept;
this.empQualf = empQualf;
this.empExperience = empExperience;
this.empSalary = empSalary;
}

 // EMP_ID
public void setEmpId(Integer empID)
{
    this.empID = empID;
}
public Integer getEmpID()
{
return empID;
}

 // EMP_Name
public void setEmpName(String empName)
{
    this.empName = empName;
}
public String getEmpName()
{
return empName;
}

// EMP_Department
public void setEmpDept(String empDept)
{
    this.empDept = empDept;
}
public String getEmpDept()
{
return empDept;
}

// EMP_Qualification
public void setEmpQualf(String empQualf)
{
    this.empQualf = empQualf;
}
public String getEmpQualf()
{
return empQualf;
}

// EMP_Experience
public void setEmpExperience(String empExperience)
{
    this.empExperience = empExperience;
}
public String getEmpExperience()
{
return empExperience;
}

// EMP_Salary 
public void setEmpSalary(String empSalary)
{
    this.empSalary = empSalary;
}
public String getEmpSalary()
{
return empSalary;
}

}
