public class Account {

    private int money;
    private int number;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void transferTargetTest(int amount, Account target){
        this.money = this.money - amount;
        target.money = target.getMoney() + amount;



    }

    public void transferToTarget(int amount,Account number){
        this.money = this.money - amount;



    }



}
