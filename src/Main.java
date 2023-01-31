public class Main {
    public static void main(String[] args) {



        ATM1000 atm1000 = new ATM1000();
        ATM500 atm500 = new ATM500();
        ATM200 atm200 = new ATM200();
        ATM100 atm100 = new ATM100();
        ATM50 atm50 = new ATM50();
        ATM20 atm20 = new ATM20();
        ATM10 atm10 = new ATM10();
        ATM5 atm5 = new ATM5();
        atm1000.setNextAtm(atm500);
        atm500.setNextAtm(atm200);
        atm200.setNextAtm(atm100);
        atm100.setNextAtm(atm50);
        atm50.setNextAtm(atm20);
        atm20.setNextAtm(atm10);
        atm10.setNextAtm(atm5);
         atm1000.getMoney(735);



    }
}