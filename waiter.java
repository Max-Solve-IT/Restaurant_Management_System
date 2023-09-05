import java.util.Scanner;
class waiter extends Employee{
    waiter(){
        this.set_position("Waiter");
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("------------------ Add Waiter --------------");
        waiter[] Waiters = new waiter[3];
            for(int i = 0; i < 3; i++){
            Waiters[i] = new waiter();
            System.out.print("------------------- Waiter " + (i+1) + " -------------------");
            String s = new String();
            System.out.print("\nName : ");
            s = cin.nextLine();
            Waiters[i].set_name(s);

            System.out.print("\nAddress : ");
            s = cin.nextLine();
            Waiters[i].set_address(s);

            System.out.print("\nPhone : ");
            s = cin.nextLine();
            Waiters[i].set_mobile(s);

            System.out.print("\nSex : ");
            s = cin.nextLine();
            Waiters[i].set_sex(s);

            System.out.print("\nBlood Group : ");
            s = cin.nextLine();
            Waiters[i].set_blood_group(s);

            System.out.print("\nNationality : ");
            s = cin.nextLine();
            Waiters[i].set_nationality(s);

            System.out.print("\nReligion : ");
            s = cin.nextLine();
            Waiters[i].set_religion(s);

            System.out.print("\nAge : ");
            int num;
            num = cin.nextInt();
            Waiters[i].set_age(num);
            cin.nextLine();
        }

        System.out.println("--------------------------------\n");

        for(int i = 0; i < 3; i++){
            System.out.print("Waiter " + (i+1) + " Name : "+Waiters[i].get_name()+"\n");
            System.out.print("Waiter " + (i+1) + " Age : "+Waiters[i].get_age()+"\n");
            System.out.print("Waiter " + (i+1) + " Address : "+Waiters[i].get_address()+"\n");
            System.out.print("Waiter " + (i+1) + " Sex : "+Waiters[i].get_sex()+"\n");
            System.out.print("Waiter " + (i+1) + " Nationality : "+Waiters[i].get_nationality()+"\n");
            System.out.print("Waiter " + (i+1) + " Religion : "+Waiters[i].get_religion()+"\n");
            System.out.print("Waiter " + (i+1) + " Blood Group : "+Waiters[i].get_blood_group()+"\n");
            System.out.print("Waiter " + (i+1) + " Mobile : "+Waiters[i].get_mobile()+"\n");
            System.out.print("Waiter " + (i+1) + " Salary : "+Waiters[i].get_Salary()+"\n");
            System.out.print("Waiter " + (i+1) + " Position : "+Waiters[i].get_position()+"\n \n");

        }
    }
}
