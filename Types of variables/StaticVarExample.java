/* 
Static (or class) variable

They are associated with the class and common 
for all the instances of class.

Ej: We create 3 objects of a class and access
this static variable, it would be common for all
The changes made to the variable using only one
object would reflect when you access it through
other objects.

*/
public class StaticVarExample {
	public static String myClassVar = "class or static variable";

	public static void main(String args[]) {
		StaticVarExample obj = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();

		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		obj2.myClassVar = "Changed text";

		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}
}