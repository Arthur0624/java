
import java.util.Date;
public  class Account implements Item{
    private String name;
    private double balance;//余额
    private Date datetime;//开户时间
    public static int count;//记录开户数量
    private double money;
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.datetime = new Date();
    }

    public Account(String name) {
        this.name = name;
        this.datetime = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Date getDatetime(){
        return datetime;
    }


    @Override
    public void saveMoney(double money) {
        this.balance+=money;
    }

    @Override
    public void getMoney(double money) {
        this.balance-=money;
    }
    public String talk(){
        return this.name+"剩余金额为："+this.balance;
    }
}

