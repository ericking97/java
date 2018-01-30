public class SwitchStatement { 
    public static void main(String args[]) {
        int num = 2;

        // Can be a variable or an integer expression
        switch(num + 2) {
            case 1:
                System.out.println("Case 1: Value is: " + num);
                break;
            case 2:
                System.out.println("Case 2: Value is: " + num);
                break;
            case 3:
                System.out.println("Case 3: Value is: " + num);
                break;
            case 4:
                System.out.println("Case 4: Value is: " + num);
                break;
            default: // Default is defined in as a backup case.
                System.out.println("Default. Value is: " + num);
                break;
        }
    }
}