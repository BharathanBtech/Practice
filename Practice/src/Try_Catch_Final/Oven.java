package Try_Catch_Final;

public class Oven {

    public void switchOn() {
        System.out.println("Oven is switched On");
    }

    public void cook(String failureType) throws ArithmeticException, Exception {
        if (failureType.equals("Power failure")) {
            System.out.println("1");
            throw new ArithmeticException("Failed to cook due to power failure");
        } else if (failureType.equals("System failure")) {
            System.out.println("2");
            throw new Exception("Failed to cook due to system failure");
        }
    }

    public void switchOff() {
        System.out.println("Oven is switched Off");
    }
}
