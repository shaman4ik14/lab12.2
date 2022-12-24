import chainofresponsebility.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {
    @Test
    public void testMain(){
        ATM terminal = new ATM(1525);
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
        Assertions.assertEquals(null, handler1000.process(terminal.amount));
    }

    @Test
    public void testATM(){
        ATM terminal = new ATM(0);
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
        Assertions.assertEquals(null, handler1000.process(terminal.amount));
    }
}
