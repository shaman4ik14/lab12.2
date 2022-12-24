package chainofresponsebility;

public class Handler50 extends Handler {

    public Handler50(int nominal) {
        super(nominal);
    }

    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
