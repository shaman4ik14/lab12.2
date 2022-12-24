package chainofresponsebility;

public class Handler10 extends Handler{
    public Handler10(int nominal) {
        super(nominal);
    }

    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
