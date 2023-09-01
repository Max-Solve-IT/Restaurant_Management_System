public class Employee extends Salary {
    protected String name,mobile,address,sex,blood_group,position,nationality,religion;
    protected int age;
    protected double salary = new Salary(position).getSalary();


    public void set_name(String name){
        this.name =  name ;
    }

    public void set_position(String pos){
        position = pos;
    }
    public double get_Salary(){
        return this.salary ;
    }
    
}
