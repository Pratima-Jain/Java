# METHOD OVERRIDING

- Method overriding is a mechanism to have non-static methods inside parent and child class with the **same name, same arguments and same return type**.
- By using method overriding we change or update the old implementation of parent class by providing new and updated implementation from child class.
- In method overriding execution will always depend on **object creation at run time**.

## Advantage of Method Overriding

→ Old feature of parent class is updated from child class through method overriding.

→ We don't have to perform downCasting.

→ Polymorphism is achieved through method overriding.

---

# Conditions for Method Overriding

- There must be inheritance or **'is a' relationship**.

- Method in parent class and child class must be **non-static**.

- A static method cannot be overridden because it belongs to class while method overriding is allowed only for a method which belongs to object.

- Method name, arguments and return type of method must be same in parent and child class.

- Method of parent class must not be **private or final** because a private or final method cannot be overridden.

- Parent class must not be **final** because a final class can't be extended.

- The access modifier on child class method must not be more restricted than the access modifier of parent class method.

---

## Can We Override Main Method of Java?

- No, we cannot override main method of Java because main method is a **static type method** but method overriding is allowed only for a **non-static type method**.
- In method overriding different forms are achieved with the same name so method overriding is also called:
  - **Run Time Polymorphism**
  - **Dynamic Polymorphism**
  - **Run Time Binding**
  - **Late Binding**
  - **Dynamic Method Dispatch**

---

#### Examples of Method Overriding

- `toString()`, `equals()` and `hashCode()` method of Object class.
- `add()`, `addAll()`, `remove()`, `removeAll()`, `get()`, `contains()` etc. are overridden methods in Collection Framework.

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

- If a class is final then it cannot be extended. In another words it cannot be parent of a class.
- We cannot override any method of a final class.
- An abstract class or interface cannot be final because abstract class or interface must have child class.
- String and all the wrapper classes are final so it cannot be extended.

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

- A final method is inherited to child class so a child class can use final method of parent class.
- A final method cannot be overridden by child class.
- We can override `toString()`, `hashCode()` and `equals()` method of Object class because these are not final type methods.
- Final method can be overloaded.
- A final variable is recommended to write in uppercase letter.

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

- Class must be declared as `final`.
- All the data members of the class must be declared as `final` and `private`.
- All the data members should be initialized with the help of constructor.
- Public type getter methods can be designed to get the private data.
- Setter methods is not allowed because we cannot modify any data members.

---

### USE OF IMMUTABLE CLASS

**IMMUTABLE CLASS** is used for various requirements where we don't want to get data modified such as **DTO (Data Transfer Object) CLASS**.

<br>

# PACKAGE

```java
javac -d . roi.java
java bank.icici.roi
```

- Package is a physical folder which contains similar types of files.
- A package is created by using `package` keyword and one package can be used inside another package by using `import` keyword.

---

## Types of Packages

1. **Pre-defined / Inbuilt Packages**
2. **User-defined / Custom Packages**

### Pre-defined / Inbuilt Packages

The packages which are provided in Java under Java library are called **inbuilt packages**.

Examples:

- `java.lang`
- `java.util`
- `java.io`
- `java.math`
- `java.time`
- `java.nio`
- etc. are built in Java.

### User-defined / Custom Packages

The packages which are created by user is called **custom package** or **user-defined package**.

---

## Package Naming Convention

- Package name should be provided in **lowercase letters**.
- If it has multiple words then from second word it should be in uppercase letter.

```java
package com.wipro.icici.loan.homeloan
```

| `com.wipro`           | `icici`     | `loan`       | `homeloan`  |
| --------------------- | ----------- | ------------ | ----------- |
| company / domain name | client name | project name | module name |

`com.wipro` is domain name and company name.

`icici` → client name

`loan` → project name

`homeloan` → module name

Examples:

```java
package com.wipro.icici.loan.carloan.interestAmount
```

```java
package com.wipro.icici.loan.homeloan.roi
```

---

## Command to Compile the Package

```java
javac -d . roi.java
```

This will create at same destination.

```java
javac -d f://folder1 roi.java
```

```text
        |
      inside f: drive
        |
      folder1
```

---

## Command to Run the Package

```java
java com.wipro.icici.loan.homeloan.roi
```

`[fully qualified class name]`

---

## Advantages of Packages

1. Package helps to store similar types of file at one location which makes it easy retrieve or access.
2. Package helps in better management of code.
3. Package helps in easy maintenance and debugging of the application or the code.
4. Package helps to avoid naming conflict in the code.
5. Package helps to control access of member from one package to another package.

---

# ACCESS MODIFIERS

Access modifiers in Java are provided to control the access of different types of members.

Java provides:

- `public`
- `protected`
- `default` (no keywords) **[package private]**
- `private`

to control the access of members.

Example:

```text
Inside pack1:
    tree
    fruit

Inside pack2:
    mango
    employ
```

---

## Public Access Modifier

- If a member is declared as `public` then it can be accessed **inside package or outside the package**.
- Public members can be a **class, interface, constructor, a variable or a method**.
- If a class is declared as `public` then only it can be imported inside another package.

---

## Protected Access Modifier

- If a member is declared using `protected` keyword then it can be used inside same package.
- Outside the package it can be used only by **child class**.
- Protected members can be a **variable, constructor or a method**.
- A class or interface can never be `protected`.

---

## DEFAULT ACCESS MODIFIER

* If a member is not declared by any keyword then it is called a **default**.
* A default member is accessible only inside the **same package**.
* It cannot be accessed outside the package so it is also called **package private**.
* A class, interface, constructor, variable or method can be default type members.

---

## PRIVATE ACCESS MODIFIER

* If a member is declared using `private` keyword then it is allowed only inside the **same class**.
* A private member cannot be accessed outside the class.
* A variable, method or constructor can be private members.
* A class or interface cannot be declared private.
* Inner class can be private but private keyword is not allowed for outer class.

---

# ACCESS MODIFIERS

| Access Modifier | Same Class | Different Class Same Package | Child Class Different Package | Different Class Different Package |
| --------------- | ---------- | ---------------------------- | ----------------------------- | --------------------------------- |
| **public**      | yes        | yes                          | yes                           | yes                               |
| **protected**   | yes        | yes                          | yes                           | no                                |
| **default**     | yes        | yes                          | no                            | no                                |
| **private**     | yes        | no                           | no                            | no                                |

```text
public < protected < default < private
  |                              |
least                         most
restricted                  restricted
```

---

# PRIVATE CONSTRUCTOR

Private constructor is used to make a **Singleton Class and Object**.

### Q. Can we have private constructor?

**Yes**, we can have a private constructor.

It is used for a special design pattern called **Singleton Design Pattern**.

---

## SINGLETON CLASS

* A class is called **Singleton Class** if only one object of the class is allowed to be created.
* Singleton class is designed by using **private constructor**.

### Singleton is designed in three ways:

a. **Eager Initialization**

b. **Lazy Initialization**

c. **Synchronized Singleton / Initialization**

---

## EAGER INITIALIZATION

* If the singleton object is created at the time of **class loading process itself** then it is called **Eager Initialization Singleton**.

---

## LAZY INITIALIZATION

* If the object of singleton is created at the time of **method execution** then it is called **Lazy Initialization**.

---

## SYNCHRONIZED SINGLETON / INITIALIZATION

* If the singleton object is allowed for only **one thread at a time** then it is called **Synchronized Singleton**.
* It is used in **multi threading** to allow only one thread at a time on the resource.

---

### ADVANTAGE / USES OF SINGLETON

1. Only one database connection per thread is provided through singleton.
2. Only one configuration manager for application configuration is achieved through singleton.
3. Cache should be only one per application.
4. Loggers should be only one for an application.

___
# METHOD CHAINING

It is a process of chaining one method with another method. It is achieved by using `.` (dot) operator.

```java
m1().m2().m3().....;
```

## Important Points

1. If the return type of the method is `void` then such method cannot be used in method chaining process.
2. If the return type of the method is primitive type data then it cannot be used in method chaining process.
3. A method can chain in method chaining process only if the return type of the method is not primitive type or object type.

---

# GENERICS

* Parameterized type is called **Generics**.
* Generics is recommended to use because it provides **type safety**.
* It is added in Java in **Java 5 update** to work with collection of data in safety manner.

## Advantage of Generics

1. It provides **type safety**.
2. It helps to avoid **Class Cast Exception**.
3. Typecasting operation is not required in generics.

# Note:

* In generics, primitive type is not allowed.
* Generics type must be **non-primitive**.
* Generics can be a **class**.
* Generics can be on **methods**.
