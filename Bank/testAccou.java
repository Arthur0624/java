public class testAccount {
    public static void main(String[] args) {
        Account account1 = new Account("tom");//开辟新用户
        account1.saveMoney(5000);//存入金额
        account1.getMoney(2000);//取出金额
        System.out.println(  account1.talk());//输出剩余金额
    }
}
