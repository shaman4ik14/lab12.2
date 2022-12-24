package chainofresponsebility;

public class Handler5 extends Handler{

    public Handler5(int nominal) {
        super(nominal);
    }

    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
