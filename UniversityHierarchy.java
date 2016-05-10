
package universityhierarchy;


public class UniversityHierarchy {

    
    public static void main(String[] args) {
        
    }
    
}
class Community{
    private String Department;
    private String Institute;
    Community(String S1,String S2)
    {
        Department=S1;
        Institute=S2;
    }
    String getDept(){
        return Department;
        
    }
    String getInst()
    {
        return Institute;
    }
    void Show()
    {
        System.out.println("Name of the Department: "+getDept());
        System.out.println("Name of the institution: "+getInst());
    }
}
class Employee extends Community{
    private String name;
    private String employeeID;
    private double salary;
    private double increment;
    Employee(String dept,String Inst,String n,String eId,double s,double i)
    {
        super(dept,Inst);
        name=n;
        employeeID=eId;
        salary=s;
        increment=i;
    }
    String getName()
    {
        return name;
        
    }
    String getEmployeeId()
    {
        return employeeID;
    }
    double getSalary()
    {
        return salary;
    }
    double getIncrement()
    {
        return increment;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Name of the Employee: "+getName());
        System.out.println("Employee Id: "+getEmployeeId());
        System.out.println("salary: "+getSalary());
        System.out.println("Increment: "+getIncrement());
    }
}
class Alumny extends Community{
    private String name;
    private int passYear;
    Alumny(String dept,String inst,String n,int y)
    {
        super(dept,inst);
        name=n;
        passYear=y;
    }
    String getName(){
        return name;
        
    }
    int getPassYear()
    {
        return passYear;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Name of the Community member: "+getName());
        System.out.println("Pass year: "+getPassYear());
    }
}
class Student extends Community{
    private String name;
    private int StudentId;
    private String Status;
    Student(String dept,String inst,String n,int id,String s)
    {
        super(dept,inst);
        name=n;
        StudentId=id;
        Status=s;
    }
    String getName()
    {
        return name;
        
    }
    String getStatus()
    {
        return Status;
    }
    int getId()
    {
        return StudentId;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Name of the community member: "+getName());
        System.out.println("Student Id: "+getId());
        System.out.println("Status: "+getStatus());
    }
    
    
}
class Faculty extends Employee{
    
    private int facultyCode;
    private String designation;
    private int joinYear;
    Faculty(String dept,String Inst,String n,String eId,double s,double i,int fc,String desig,int Jyear)
    {
        super(dept,Inst,n,eId,s,i);
        facultyCode=fc;
        designation=desig;
        joinYear=Jyear;
    }
    int getfacultyCode()
    {
        return facultyCode;
    }
    String getDesig()
    {
        return designation;
        
    }
    int getYear()
    {
        return joinYear;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Faculty Code: "+ getfacultyCode());
        System.out.println("Designation: "+ getDesig());
        System.out.println("Join Year: "+getYear());
    }
    
}
class Stuff extends Employee{
    private int joinYear;
    private int duration;
    Stuff(String dept,String Inst,String n,String eId,double s,double i,int Jyear,int time)
    {
        super(dept,Inst,n,eId,s,i);
        joinYear=Jyear;
        duration=time;
    }
    int getYear(){
        return joinYear;
        
    }
    int getDuration()
    {
        return duration;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Join Year: "+getYear());
        System.out.println("Duration: "+getDuration());
    }
}
class Administrator extends Faculty{
    
    private String position;
    private double duration;
    Administrator(String dept,String Inst,String n,String eId,double s,double i,int fc,String desig,int Jyear,String pos,double time)
    {
        super(dept,Inst,n,eId,s,i,fc,desig,Jyear);
        position=pos;
        duration=time;
    }
    String getPos()
    {
        return position;
    }
    double getDuration()
    {
        return duration;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Position: "+ getPos());
        System.out.println("Duration: "+getDuration());
        
    }
}
class Teacher extends Faculty{
    private int noCourses;
    private double weeklyHour;
    Teacher(String dept,String Inst,String n,String eId,double s,double i,int fc,String desig,int Jyear,int cors,double hour)
    {
        super(dept,Inst,n,eId,s,i,fc,desig,Jyear);
        noCourses=cors;
        weeklyHour=hour;
        
    }
    int getNoCourses()
    {
        return noCourses;
    }
    double getHour()
    {
        return weeklyHour;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("NO of courses: "+getNoCourses());
        System.out.println("weekly hour: "+getHour());
    }
}