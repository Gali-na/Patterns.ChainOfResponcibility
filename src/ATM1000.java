public class ATM1000 implements ATM {
     public ATM NextAtm;

    public void setNextAtm(ATM nextAtm) {
        NextAtm = nextAtm;
    }

    public void getMoney (int amountMoney) {
        if(amountMoney/1000>0){
         int numberBanknotes=  amountMoney/1000;
         int balanceBanknotes=amountMoney-numberBanknotes*1000;
         if(balanceBanknotes!=0){
             NextAtm.getMoney(balanceBanknotes);
         }
         System.out.println(numberBanknotes +" notes worth 1000 were issued");
         return;
       }
        NextAtm.getMoney(amountMoney);
    }
}
