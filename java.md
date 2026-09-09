# METHOD OVERRIDING

* Method overriding is a mechanism to have non-static methods inside parent and child class with the **same name, same arguments and same return type**.
* By using method overriding we change or update the old implementation of parent class by providing new and updated implementation from child class.
* In method overriding execution will always depend on **object creation at run time**.

## Advantage of Method Overriding

→ Old feature of parent class is updated from child class through method overriding.

→ We don't have to perform downCasting.

→ Polymorphism is achieved through method overriding.

---

# Conditions for Method Overriding

* There must be inheritance or **'is a' relationship**.

* Method in parent class and child class must be **non-static**.

* A static method cannot be overridden because it belongs to class while method overriding is allowed only for a method which belongs to object.

* Method name, arguments and return type of method must be same in parent and child class.

* Method of parent class must not be **private or final** because a private or final method cannot be overridden.

* Parent class must not be **final** because a final class can't be extended.

* The access modifier on child class method must not be more restricted than the access modifier of parent class method.

---

## Can We Override Main Method of Java?

* No, we cannot override main method of Java because main method is a **static type method** but method overriding is allowed only for a **non-static type method**.
* In method overriding different forms are achieved with the same name so method overriding is also called:

  * **Run Time Polymorphism**
  * **Dynamic Polymorphism**
  * **Run Time Binding**
  * **Late Binding**
  * **Dynamic Method Dispatch**

---

#### Examples of Method Overriding

* `toString()`, `equals()` and `hashCode()` method of Object class.
* `add()`, `addAll()`, `remove()`, `removeAll()`, `get()`, `contains()` etc. are overridden methods in Collection Framework.

---

# FINAL KEYWORD

`final` is a keyword which is used to restrict modification of a member.

`final` can be a **class, a method and a variable**.

---

## Final Class

If a class is declared by `final` keyword then it is called a **final class**.

#### Example:

```java
final class Circle{

}
```

### Important Points

* If a class is final then it cannot be extended. In another words it cannot be parent of a class.
* We cannot override any method of a final class.
* An abstract class or interface cannot be final because abstract class or interface must have child class.
* String and all the wrapper classes are final so it cannot be extended.

---

## Final Method

If a method is declared by using `final` keyword then it is called a **final method**.

#### Example:

```java
class Employ{

    public void work(){

        SOP("employ is working");

    }

    public final void talk(){

        SOP("employ is talking");

    }

}
```

### Important Points

* A final method is inherited to child class so a child class can use final method of parent class.
* A final method cannot be overridden by child class.
* We can override `toString()`, `hashCode()` and `equals()` method of Object class because these are not final type methods.
* Final method can be overloaded.
* A final variable is recommended to write in uppercase letter.

---

## Final Variable

If a variable is declared using `final` keyword, then it is called **final variable**.

A final variable cannot be modified or changed.

#### Example:

```java
final int x = 10;

x = 50; // compilation error
```

```java
final int y; // basic final variable

y = 50;
```

---

### 1) STATIC FINAL VARIABLE

If a static variable is declared by using `final` keyword then such variable is called **STATIC FINAL VARIABLE**.

A **STATIC FINAL VARIABLE** should be initialized at the time of creation or by using static block.

---

### 2) NON-STATIC FINAL VARIABLE

If non-static variable of a class is declared by using `final` keyword then it is called **NON-STATIC FINAL VARIABLE**.

A **NON-STATIC FINAL VARIABLE** must be initialized with the help of constructor.

A final non-static final variable must be initialized with the help of every constructor which is designed otherwise it'll cause compilation error on constructor.

---

# IMMUTABLE CLASS

If a class is designed in such a way that once its object is created then it cannot be modified or changed, then such class is called **IMMUTABLE CLASS**.

The object created for **IMMUTABLE CLASS** is called **IMMUTABLE OBJECT**.

---

### STEPS TO CREATE IMMUTABLE CLASS

* Class must be declared as `final`.
* All the data members of the class must be declared as `final` and `private`.
* All the data members should be initialized with the help of constructor.
* Public type getter methods can be designed to get the private data.
* Setter methods is not allowed because we cannot modify any data members.

---

### USE OF IMMUTABLE CLASS

**IMMUTABLE CLASS** is used for various requirements where we don't want to get data modified such as **DTO (Data Transfer Object) CLASS**.
