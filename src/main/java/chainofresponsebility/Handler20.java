package chainofresponsebility;

public class Handler20 extends Handler{
    public Handler20(int nominal) {
        super(nominal);
    }
    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
