import java.util.Scanner;
public class FoodOrder {

        int frenchfries = 100;
        int burger = 120;
        int pastry = 100;
        int pizza = 200;
        int coldcoffe = 100;
        int colddrink = 80;
        int icedtea = 80;
        int ch;
        int quantity;
        int total;
        String again;


        Scanner sc = new Scanner(System.in);

        public void displayMenu()
        {
            System.out.println("*********************Welcome to KTM Cafe************************");
            System.out.println("*******************************************************************");
            System.out.println("         1.Frenchffries        100/-");
            System.out.println("         2.Burger              120/-");
            System.out.println("         3.Pastry              100/-");
            System.out.println("         4.Pizza               200/-");
            System.out.println("         5.Coldcoffe           100/-");
            System.out.println("         6.Colddrink            80/-");
            System.out.println("         7.iced tea             80/-");
            System.out.println("         8.Exit                     ");
            System.out.println("*****************************************************************");
            System.out.println("What do you want to order Today??");
        }

        public void generateBill()
        {
            System.out.println();
            System.out.println("***************Thankyou for ordering*******************************");
            System.out.println("***************Your Bill is : "+total+"****************************");
        }

        public void Order()
        {
            while(true)
            {
                System.out.print("Enter Your Choice: ");
                ch = sc.nextInt();
                switch (ch) {
                    case 1 -> {//Frenchfries
                        System.out.println("You have Selected French Fries");
                        System.out.println();
                        System.out.println("Enter the desired Quantity: ");
                        quantity = sc.nextInt();
                        total = total + quantity * frenchfries;
                    }
                    case 2 -> {//Burger
                        System.out.println("You have Selected Burger");
                        System.out.println();
                        System.out.println("Enter the desired Quantity: ");
                        quantity = sc.nextInt();
                        total = total + quantity * burger;
                    }
                    case 3 -> {//Pastry
                        System.out.println("You have Selected Pastry");
                        System.out.println();
                        System.out.println("Enter the desired Quantity: ");
                        quantity = sc.nextInt();
                        total = total + quantity * pastry;
                    }
                    case 4 -> {//Pizza
                        System.out.println("You have Selected Pizza");
                        System.out.println();
                        System.out.println("Enter the desired Quantity");
                        quantity = sc.nextInt();
                        total = total + quantity * pizza;
                    }
                    case 5 -> {//Coldcoffe
                        System.out.println("You have Selected Coldcoffe");
                        System.out.println();
                        System.out.println("Enter the desired Quantity: ");
                        quantity = sc.nextInt();
                        total = total + quantity * coldcoffe;
                    }
                    case 6 -> {//Colddrink
                        System.out.println("You have Selected Cold Drink");
                        System.out.println();
                        System.out.println("Enter the desired Quantity: ");
                        quantity = sc.nextInt();
                        total = total + quantity * colddrink;
                    }
                    case 7 -> {//icedtea
                        System.out.println("You have Selected IcedTea");
                        System.out.println();
                        System.out.println("Enter the desired Quantity: ");
                        quantity = sc.nextInt();
                        total = total + quantity * icedtea;
                    }
                    case 8 -> System.exit(1);
                    default -> {
                    }
                }
                System.out.println();
                System.out.print("Do you wish to order anything else(Y/N): ");
                again = sc.next();
                if(again.equalsIgnoreCase("Y"))
                {
                    Order();
                }
                else if(again.equalsIgnoreCase("N"))
                {
                    generateBill();
                    System.exit(1);
                }
                else{System.out.println("Invalid Choice");
            }

        }
    }

}
