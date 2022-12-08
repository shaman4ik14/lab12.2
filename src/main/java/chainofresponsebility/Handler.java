package chainofresponsebility;

import lombok.Getter;
import lombok.Setter;

public abstract class Handler {
    private final int nominal;
    @Setter @Getter
    private Handler next;

    public Handler(int nominal) {
        this.nominal = nominal;
    }

    public void process(int amount){
        if (amount%nominal > 0 && getNext() == null){
            throw new IllegalArgumentException();
        } else if (getNext() != null) {
            getNext().process(amount % nominal);
            if (amount/nominal >= 1) {
                System.out.println(amount / nominal + " * " + nominal);
            }
        } else if (amount/nominal != 0){
            System.out.println(amount/nominal + " * " + nominal);
        }
    }
}
