package thelazyguy.learnjava.solidprinciple.dip;

public class ShoppingMall {private BankCard bankCard;public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }public static void main(String[] args) {
        BankCard bankCard= (BankCard) new CreditCard();
        ShoppingMall shoppingMall =new ShoppingMall(bankCard);
        shoppingMall.doPayment("do some order", 10000);
    }
}