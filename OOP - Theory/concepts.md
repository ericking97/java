# Object
Is a bundle of data and its behaviour, they have two characteristics: They have states and behaviors.

Ex:
**Object**: House
**State**: Address, Color, Area
**Behavior**: Open door, close door

```
class House {
    String address;
    String color;
    double area;
    void openDoor() {
        // Close door function
    }
    void closeDoor() {
        // Close door function
    }
}
```

## Characteristics
### Abstraction
Abstraction is a process where you show only "relevant" data and "hide" unnecessary details of an object from the user.

### Encapsulation
Encapsulation simply means binding object state (fields) and behaviour (methods) together. If you are creating a class, you are doing encapsulation.

### Message passing
A single object by itself may not be very useful. An application contains many objects. One object interacts with another object by invoking methods on that object. It is also referred to as Method Invocation.

# Class
A class can be considered as a blueprint using which you can create as many objects as you like.
For example we have a class *Website* that has two fields. This is just a blueprint, it does not represent any website, however using this we can create website objects that represents the websites.

```
public class Website {
    // fields
    String webName;
    int webAge;
    // constructor
    Website(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String args []) {
        // Creating objects
        Website obj1 = new Website("beginnersbook", 5);
        Website obj2 = new Website("google", 18);

        // Accessing object data through reference
        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);
    }

}
```

# Constructor
Contructor looks like a method but it's in fact not a method. It's a name is same as class name and it does not return any value.
Ex:
```
MyClass obj = new MyClass();
```
If you look at the right side of this statement, we are calling the default contructor of class myClass to create a new object.

# Inheritance
The process by which one class acquires the properties and functionalities of another class is called inheritance. It provides the idea of reusability of code and each sub class defines only those features that are unique to it.

1.- Inheritance is a process of defining a new class based on an existing class by extending its common data members and methods.

2.- Inheritance allows us to reuse code, it improves reusability in your java application.

3.- The parent class is called the base class or super class. The child class that extends the base class is called the derived class or subclass or child class.


NOTE: Multi-level inheritance is allowed in Java but not multiple inheritance.

## Types of Inheritance

### Single Inheritance
Refers to a child and parent class relationship where a class extends another class.
### Multilevel inheritance
Refers to a child and parent class relationship where a class extends the child class. Ex Class A extends class B extends class C.
### Hierarchical inheritance
Refers to a child and parent class relationship where more than one classes extends the same class. Ex class B extends class A and class C extends class A.
### Multiple inheritance
Refers to the concept of one class extending more than one classes, which means a child class has two parent classes.

# Polymorphism
Is an object oriented programming feature that allows us to perform a single action in different ways. For example, lets say we have a class Animal that has a method animalSound(), here we cannot give implementation to this method as we do not know which Animal class would extend Animal class.
So, we make this method abstract like this:

```
public abstract class Animal {
    ...
    public abstract void animalSound();
}
```
Now suppose we have two Animal classes Dog and Lion that extends Animal class. We can provide the implementation detail there.

```
public class Lion extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Roar");
    }
}

public class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Bork");
    }
}
```

## Types of polymorphism

### Static Polymorphism

Polymorphism that is resolved during compiler time is known as static polymorphism.
Method overloading can be considered as static polymorphism example, this allow us to have more than one methods with the same name in a class that differs in signature. (See ExampleOverloading).

### Dynamic Polymorphism
It's also known as Dynamic Method Dispatch, is a process in which a call to an overriden method is resolved at runtime rather. (See Dog).

# Abstract Class and methods in OOPs Concepts

## Abstract method
1) A method that is declared but not defined.
2) Declared using the **abstract** keyword.
```
abstract public void method();
```
3) Used to put some kind of compulsion on the class who inherits the class has abstract methods. The class that inherits must provide the implementation of all the abstract methods of parent class.
