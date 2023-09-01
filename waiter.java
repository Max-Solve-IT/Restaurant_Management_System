import java.util.Scanner;

class waiter extends Employee {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        waiter[] Waiters = new waiter[3];
        for(int i = 0; i < 3; i++){
            Waiters[i] = new waiter();
            System.out.print("Waiter " + (i+1) + " Position: ");
            String pos = cin.nextLine();
            Waiters[i].set_position(pos);
        }

        System.out.println("--------------------------------");

        for(int i = 0; i < 3; i++){
            System.out.print("Waiter " + (i+1) + " Position: ");
            System.out.println(Waiters[i].position);
            System.out.print("Salary: ");
            System.out.println(Waiters[i].get_Salary());
        }
    }
}