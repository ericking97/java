/* 
Instance variable

Each instance of class has its own copy of the 
instance variable.

*/

public class InstanceVarExample {
    String myInstaceVar = "Instance variable";

    public static void main(String args[]) {
        InstanceVarExample obj = new InstanceVarExample();
        InstanceVarExample obj2 = new InstanceVarExample();
        InstanceVarExample obj3 = new InstanceVarExample();

        System.out.println(obj.myInstaceVar);
        System.out.println(obj2.myInstaceVar);
        System.out.println(obj3.myInstaceVar);

        obj2.myInstaceVar = "Changed Text";

        System.out.println(obj.myInstaceVar);
        System.out.println(obj2.myInstaceVar);
        System.out.println(obj3.myInstaceVar);
    }
}