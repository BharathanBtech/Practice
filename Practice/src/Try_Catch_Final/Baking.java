package Try_Catch_Final;

public class Baking {

    public static void main(String[] args) {
        String type = "System failure";

        Oven obj = new Oven();

        obj.switchOn();

        try {
            obj.cook(type);
        } catch (ArithmeticException A_ex) {
            System.err.println("ArithmeticException: " + A_ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
        } finally {
            obj.switchOff();
        }

    }

}
