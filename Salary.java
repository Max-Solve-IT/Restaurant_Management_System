
public class Salary {
    private double Salary_Waiter ,Salary_Manager, Salary_Cleaner, Salary_Receptionist,
                   Salary_Security_guard, Salary_Chief;
    private String position ;
    public Salary(double Salary_Waiter , double Salary_Manager , double Salary_Cleaner ,double Salary_Receptionist,
    double Salary_Security_guard , double Salary_Chief ){
        this.Salary_Waiter = Salary_Waiter ;
        this.Salary_Manager = Salary_Manager ;
        this.Salary_Cleaner = Salary_Cleaner ;
        this.Salary_Receptionist = Salary_Receptionist ;
        this.Salary_Security_guard = Salary_Security_guard ;
        this.Salary_Chief = Salary_Chief ;
    }
    /* this Constructor is create to test the program. next we will build a program that
     * will store all salary in DB
     */
    public Salary(){
        this.Salary_Waiter = 10 ;
        this.Salary_Manager = 20 ;
        this.Salary_Cleaner = 30 ;
        this.Salary_Receptionist = 40;
        this.Salary_Security_guard = 50;
        this.Salary_Chief = 60 ;
    }
    public void set_position(String position){
        this.position = position ;
    }
    public void set_Waiter_Salary(double sal){
        Salary_Waiter = sal ;
    }
    public void set_Manager_Salary(double sal){
        Salary_Manager = sal ;
    }
    public void set_Cleaner_Salary(double sal){
        Salary_Cleaner = sal ;
    }
    public void set_Receptionist_Salary(double sal){
        Salary_Receptionist = sal ;
    }
    public void set_Security_guard_Salary(double sal){
        Salary_Security_guard = sal ;
    }
    public void set_Chief_Salary(double sal){
        Salary_Chief = sal ;
    }

    public double getSalary(){
        if(position.equals("Waiter")){
            return Salary_Waiter ;
        }else if(position.equals("Manager")){
            return Salary_Manager ;
        }else if(position.equals("Cleaner")){
            return Salary_Cleaner ;
        }else if(position.equals("Receptionist")){
            return Salary_Receptionist ;
        }else if(position.equals("Security guard")){
            return Salary_Security_guard;
        }else if(position.equals("Chief")){
            return Salary_Chief ;
        }else if(position==null){
            return 0 ;
        }
        else{
            return -1 ;
        }
 
    } 
}
