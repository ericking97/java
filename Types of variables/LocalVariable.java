/*
Local Variable

Their scope is limited to the method which means
that you can't change their values and access
them outside of the method.
*/

public class LocalVariable {
    public String myVar = "instance variable";

    public void myMethod() {
        String myVar = "Inside Method";
        System.out.println(myVar);
    }

    public static void main(String args[]) {
        LocalVariable obj = new LocalVariable();

        /* 
        We are calling the method, that changes
        the value of myVar. We are displaying myVar
        again after the method call, to demostrate 
        that the local variable scope is limited 
        to the method itself. 
        */

        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);

    }
}