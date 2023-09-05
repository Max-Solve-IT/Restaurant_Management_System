
public class Employee extends Salary {
    protected String name, mobile, address, sex, blood_group, position, nationality, religion;
    protected int age;
    protected Salary salary = new Salary();

    public void set_name(String name) {
        this.name = name;
    }
   /* public set_salary(String position){

    }*/
    public void set_mobile(String mobile) {
        this.mobile = mobile;
    }

    public void set_address(String address) {
        this.address = address;
    }

    public void set_sex(String sex) {
        this.sex = sex;
    }

    public void set_blood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public void set_nationality(String nationality) {
        this.nationality = nationality;
    }

    public void set_religion(String religion) {
        this.religion = religion;
    }

    public void set_age(int age) {
        this.age = age;
    }

    public void set_position(String pos) {
        position = pos;
        salary.set_position(pos);
    }

    public double get_Salary() {
        return this.salary.getSalary();
    }

    public String get_name() {
        return this.name;
    }

    public String get_mobile() {
        return this.mobile;
    }

    public String get_address() {
        return this.address;
    }

    public String get_sex() {
        return this.sex;
    }

    public String get_blood_group() {
        return this.blood_group;
    }

    public String get_nationality() {
        return this.nationality;
    }

    public String get_religion() {
        return this.religion;
    }

    public int get_age() {
        return this.age;
    }

    public String get_position() {
        return position;
    }

}
