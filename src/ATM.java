import java.util.Scanner;

public class ATM {
   static  Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
      System.out.println("Please add Card Number and password");
      String pinCod = scanner.nextLine();
      int numKart = scanner.nextInt();
      start(pinCod, numKart);
   }
   public static void start(String pinCod, int numKart ){
      for (Account account:DataBase.list) {
         if(numKart == account.getNumKart()){
            if (pinCod.equals(account.getPinCod())) {
               menu();
               chooseOption(account);
            }
            else {
               System.out.println("Error, you wrote wrong pincod");
            }
         }

      }

   }
   public static void menu(){
      System.out.println("PRESS [1] TO CASH WITHDRAW\n" +
                      "PRESS [2] TO WATCH BALANCE\n" +
                      "PRESS [3] TO CHANGE PASSWORD \n" +
                      "PRESS [4] TO TOP UP THE CARD\n" +
                      "PRESS [5] TO VIEW CLIENT PROFILE DATA\n" +
                      "PRESS [6] TO EXIT\n");

   }
   public static void chooseOption(Account account){
      int option = scanner.nextInt();
      int cash;
      String passWord;
      int money;
      String text;
      switch (option){
         case 1:
            System.out.println(account.getBalance());
            System.out.println("HOW MUCH MONEY DO YOU WANT TO TAKE FROM YOUR CARD");
            cash = scanner.nextInt();
            System.out.println(account.getBalance() - cash);
            break;
         case 2:
            System.out.println(account.getBalance());
            break;
         case 3:
            System.out.println("PLEASE ENTER A NEW PASSWORD");
            passWord = scanner.next();
            account.setPinCod(passWord);
            System.out.println(account.getPinCod());
            break;
         case 4:
            System.out.println(account.getBalance());
            System.out.println("PLEASE ENTER HOW MUCH MONEY DO YOU WANT TO ADD ON YOUR CARD");
            money = scanner.nextInt();
            System.out.println(account.getBalance() + money);
            break;
         case 5:
            System.out.println(account.getName());
            System.out.println(account.getBalance());
            System.out.println(account.getNumKart());
            System.out.println(account.getPinCod());
            break;
         case 6:
            System.out.println("Are you sure to finish?(Enter + or -)");
            text = scanner.next();
         case '+' :
            break;
         case '-' :
            chooseOption(account);
      }

   }
}
