package chainofresponsebility;

public class Handler1000 extends Handler{
    public Handler1000(int nominal) {
        super(nominal);
    }

    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
