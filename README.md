# Java Programming 

This repository contains a collection of Java programs written to practice and solidify understanding of fundamental concepts, Object-Oriented Programming (OOP), and logical problem-solving through pattern generation.

## 📂 Directory Structure

The repository is organized into three main categories:

```
.
├── javaa/      # Programs covering Java fundamentals
├── oops/       # Object-Oriented Programming examples
│   ├── task1/
│   └── task2/
└── pattern/    # Pattern printing programs using nested loops
    ├── level1/
    ├── level2/
    └── level3/
```
> *Folder names may vary as the repository grows.*

---

## ✨ Core Concepts Demonstrated

### 1. Java Fundamentals (`javaa`)

This section covers the basics of Java programming, including data types, operators, arrays, and string manipulation.

**Example: Array and String Manipulation (`javaa/p2.java`)**
```java
public class p2 {
    public static void main(String[] args) {
        String[] names = { "Mohan", "Sohan", "john", "rohan" };

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println("length of " + (i + 1) + " is: " + names[i].length());
        }
        System.out.println("-------------");
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i] + " starts with " + names[i].charAt(0));
        }
    }
}
```

### 2. Object-Oriented Programming (`oops`)

These examples demonstrate fundamental OOP principles such as classes, objects, methods, and the `this` keyword to create simple models of real-world entities.

**Example: User Class (`oops/task2/user.java`)**
```java
package oops.task2;

public class user {
    String uname;
    int uage;
    int uid;

    public void setData(String uname, int uage, int uid) {
        this.uname = uname;
        this.uage = uage;
        this.uid = uid;
    }

    public void getData() {
        System.out.println("============USER============");
        System.out.println("User name is: " + uname);
        System.out.println("User age is: " + uage);
        System.out.println("User ID is: " + uid);
    }
}
```

### 3. Pattern Programming (`pattern`)

This section is dedicated to improving logical thinking and control flow skills by using nested loops to generate various geometric and numerical patterns. The patterns are divided into two levels of complexity.

**Example: Simple Right-Angled Triangle (`pattern/level2/q12.java`)**
```java
public class q12 {
    public static void main(String[] args){
        int n =5;
        printPattern(n);
    }
    public static void printPattern(int n){
        int PatternSize = 1;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=PatternSize; j++){
                System.out.print("* ");
            }
            PatternSize+=1;
            System.out.println();
        }
    }
}
```
**Output:**
```
*
* *
* * *
* * * *
* * * * *
```

**Example: Diamond Pattern (`pattern/level2/q24.java`)**
```java
public class q24 {
    public static void main(String[] args) {
        int n = 7;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int space = n / 2;
        int patternSize = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("  *");
            }
            if (i < mid) {
                patternSize += 2;
                space -= 1;
            } else {
                patternSize -= 2;
                space += 1;

            }
            System.out.println();
        }
    }
}
```
**Output:**
```
           *
        *  *  *
     *  *  *  *  *
  *  *  *  *  *  *  *
     *  *  *  *  *
        *  *  *
           *
```

## 🚀 How to Run

To run any of the programs in this repository:

1.  Clone the repository to your local machine.
2.  Navigate to the directory containing the file you want to run.
3.  Compile the Java file using the Java compiler (`javac`).
    ```bash
    javac FileName.java
    ```
4.  Run the compiled code.
    ```bash
    java ClassName
    ```
    
    **Note:** For files with a `package` declaration (like those in the `oops` directory), you should compile and run from the parent directory (`Java/`). For example, to run `oops/task2/p1.java`:
    ```bash
    # From the root project directory
    javac oops/task2/p1.java
    java oops.task2.p1
    ```

## 🎯 Learning Outcomes

Through this repository, I have learned:

- Java program structure
- Variables and data types
- Creating and calling methods
- Working with basic classes and objects
- Understanding basic OOP implementation
- Logic building through pattern programming
- Writing clean and organized Java code

---
## 🛠️ Technologies Used

- Java
- JDK
- VS Code

---

## 🤝 Contribution

This repository is primarily created for learning and practice.

If you have suggestions for improving the code or learning better Java practices, feel free to fork this repository, open an issue, or submit a pull request.

---

⭐ **If you find this repository helpful, consider giving it a Star!**
   
