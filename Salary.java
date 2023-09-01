public class Salary {
    private double Salary_Waiter = 100 ,Salary_Manager = 200 , Salary_Cleaner , Salary_Receptionist ,
                   Salary_Security_guard , Salary_Chief = 300;
    private String position ;

    public Salary(){}
    public Salary(String pos){
        position = pos ;
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
        if(position=="Waiter"){
            return Salary_Waiter ;
        }else if(position=="Manager"){
            return Salary_Manager ;
        }else if(position=="Cleaner"){
            return Salary_Cleaner ;
        }else if(position=="Receptionist"){
            return Salary_Receptionist ;
        }else if(position =="Security guard"){
            return Salary_Security_guard;
        }else if(position == "Chief"){
            return Salary_Chief ;
        }else if(position==null){
            return 0 ;
        }
        else{
            return -1 ;
        }
 
    } 
}
