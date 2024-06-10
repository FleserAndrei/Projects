package Objects.p2;

import java.util.Stack;

public class Tank {

    private Stack<Double> stack;

    public Tank() {
        this.stack = new Stack<>();
    }

    public void Fill(double Fuel) {
        stack.push(Fuel);
    }

    public void EmptyALL() {
        stack.clear();
    }

    public void EmptyOneElement() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if (!stack.isEmpty()) {
            System.out.println("Tank is not empty");
        }
        super.finalize();
    }


    }



