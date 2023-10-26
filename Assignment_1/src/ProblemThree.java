import java.util.*;
class ProblemThree{
    public static void main(String[] args)
    {
        String menu = "Menu...............Price" + "\n" +
                    "1. Samosa..............Rs.20" + "\n" +
                    "2. Vadapaav.............Rs.15" + "\n" +
                    "3. Bread Pakoda..........Rs. 15" + "\n" +
                    "4. Idli...................Rs. 40" + "\n" +
                    "5. Vada Sambar............Rs. 45" + "\n" +
                    "6. Generate bill..." +"\n"+
                    "0. Exit...................";
        
        System.out.println(menu);
        int totalPrice;
        int choice = -1;
        int qty;
        int choiceCount = 0;
        //ArrayList<String> item = new ArrayList<String>(6);
        String[] itemArr = {"Samosa", "Vadapaav", "Bread Pakoda", "Idli", "Vada Sambar"};
        int[] priceArr = {20, 15, 15, 40, 45};
        //ArrayList<Integer> tpArr = new ArrayList<Integer>(6);

        
        
        while(true){
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    int priceOne = 0;
                    item.add("Samosa");
                    System.out.println("Enter the quantity: ");
                    qty = sc.nextInt();
                    //qty_arr.add(qty);
                    for(int i = 0; i < qty; i++)
                    {
                        priceOne += 20;
                    }
                    tpArr.add(priceOne);
                    choiceCount += 1;
                    break;
                
                case 2:
                    int priceTwo = 0;
                    item.add("vadapaav");
                    System.out.println("Enter the quantity: ");
                    qty = sc.nextInt();
                    for(int i = 0; i < qty; i++)
                    {
                        priceTwo += 15;
                    }
                    tpArr.add(priceTwo);
                    choiceCount += 1;
                    break;
                case 3:
                    int priceThree = 0;
                    item.add("Bread pakoda");
                    System.out.println("Enter the quantity: ");
                    qty = sc.nextInt();
                    qty_arr.add(qty);
                    for(int i = 0; i < qty; i++)
                    {
                        priceThree += 15;
                    }
                    tpArr.add(priceThree);
                    choiceCount += 1;
                    break;
                case 4:
                    int priceFour = 0;
                    item.add("Idli");
                    System.out.println("Enter the quantity: ");
                    qty = sc.nextInt();
                    qty_arr.add(qty);
                    for(int i = 0; i < qty; i++)
                    {
                        priceFour += 40;
                    }
                    tpArr.add(priceFour);
                    choiceCount += 1;
                    break;
                case 5:
                    int priceFive = 0;
                    item.add("Vada Sambar");
                    System.out.println("Enter the quantity: ");
                    qty = sc.nextInt();
                    qty_arr.add(qty);
                    for(int i = 0; i < qty; i++)
                    {
                        priceFive += 45;
                    }
                    tpArr.add(priceFive);
                    choiceCount += 1;
                    break;
                case 6:
                    System.out.println("------INVOICE------");
                    System.out.println("Item------qty------total");
                    for(int j = 0; j < choiceCount; j++){
                        System.out.println(item.get(j) + "--------------" + qty_arr.get(j)
                                        + "---------------" + tpArr.get(j));
                    }
                    break;

                    
               }
               if(choice == 0) break;
        }
        System.out.println("You are welcome...visit again!");
        System.exit(0);

    }
}