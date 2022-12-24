package chainofresponsebility;


public class ATM {
    public int amount;
    public ATM( int amount){
        this.amount = amount;
    }

    public static void main(String[] args){
        ATM terminal = new ATM(1025);
        Handler handler1000 = new Handler1000(1000);
        Handler handler500 = new Handler500(500);
        Handler handler200 = new Handler200(200);
        Handler handler100 = new Handler100(100);
        Handler handler50 = new Handler50(50);
        Handler handler20 = new Handler20(20);
        Handler handler10 = new Handler10(10);
        Handler handler5 = new Handler5(5);
        handler1000.setNext(handler500);
        handler500.setNext(handler200);
        handler200.setNext(handler100);
        handler100.setNext(handler50);
        handler50.setNext(handler20);
        handler20.setNext(handler10);
        handler10.setNext(handler5);
        try {
            if (terminal.amount >= 1)
                handler1000.process(terminal.amount);
            else
                System.out.println("Please change value (>= 1)");
        } catch (IllegalArgumentException e){
            System.out.println("Impossible to work with this amount");
        }
    }
}
