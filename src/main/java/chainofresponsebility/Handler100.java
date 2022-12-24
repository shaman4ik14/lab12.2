package chainofresponsebility;

public class Handler100 extends Handler{
    public Handler100(int nominal) {
        super(nominal);
    }

    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
