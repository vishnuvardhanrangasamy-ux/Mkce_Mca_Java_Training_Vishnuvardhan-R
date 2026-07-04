class Bank {
    void interest() {
        System.out.println("RBI Bank Interest Rate = 7%");
    }
}
class SBI extends Bank {
    @Override
    void interest() {
        System.out.println("SBI Interest Rate = 8%");
    }
}
class ICICI extends Bank {
    @Override
    void interest() {
        System.out.println("ICICI Interest Rate = 9%");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();
        ICICI i = new ICICI();
        
        b.interest();
        s.interest();
        i.interest();
    }
}