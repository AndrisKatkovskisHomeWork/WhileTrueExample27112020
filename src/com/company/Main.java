public class Main {

    public static void main(String[] args) {

        int loopCounter = 0;

        while (true) {
            System.out.println("loopCounter: " + loopCounter);

            if (loopCounter == 5) {
                break;
            }
            loopCounter++;
            System.out.println("while loop is still runing...");
        }
    }
}