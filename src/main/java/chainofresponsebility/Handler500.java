package chainofresponsebility;

public class Handler500 extends Handler{
    public Handler500(int nominal) {
        super(nominal);
    }

    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
