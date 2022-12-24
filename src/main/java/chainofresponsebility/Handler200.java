package chainofresponsebility;

public class Handler200 extends Handler{

    public Handler200(int nominal) {
        super(nominal);
    }

    @Override
    public Object process(int amount) {
        super.process(amount);
        return null;
    }
}
