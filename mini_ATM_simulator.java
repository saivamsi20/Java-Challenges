import java.util.*;

class ATM
{
    private double Balance = 1000.0;
    Scanner bank = new Scanner(System.in);

    // method 1
    public void checkBalance(){
    System.out.print("Balance: \n"+ Balance);
    }

    //method 2
    public void Deposit(){
        System.out.print("Enter amount");
        double amount = bank.nextInt();
        System.out.print("Enter amount: "+ amount);
        if(amount > 0){
            Balance += amount;
            System.out.print("\nSuccessfully Deposited\n");
        }else{
            System.out.println("\nEnter valid amount");
        }
    }

    //method 3
    public void withDraw(){
        System.out.print("Enter amount: ");
        double amount = bank.nextInt();
        if(amount > Balance){
            System.out.print("Insuficient Balance");
        }else if(amount<=0){
            System.out.print("Enter valid amount");
        }else{
            Balance -= amount;
            System.out.print("successfull transaction");

        }
    } 

    //method 4
    // public boolean login(){
    //     int pin;
    //     System.out.print("Enter PIN: ");
    //     pin = bank.nextInt();
    //     return pin == 1234;
    //     }




    public void menu(){
        int choice;
        do{
            System.out.println("1. check balance");
            System.out.println("2. Deposit");
            System.out.println("3. withdraw");
            System.out.println("4. exit");
            System.out.print("Enter your choice: ");
            
            
            choice = bank.nextInt();
            
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                    case 2:
                    Deposit();
                    break;
                    case 3:
                    withDraw();
                    break;
                case 4:
                System.out.println("Thanks!");
                    break;
                default:
                    System.out.println("Enter valid choice!");
                    break;
            }
        }while(choice != 4);
        // System.out.print("Enter your PIN: ");
    }
}

public class mini_ATM_simulator{
    public static void main(String[] args){
        ATM atm = new ATM();
        atm.menu();
    }
}

