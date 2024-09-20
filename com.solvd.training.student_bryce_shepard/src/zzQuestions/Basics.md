## JDK vs JRE
The Java Development Kit is what gives you the tools to build Java applications:
- LSP
- Compiler
- Virtual Machine
- Library source code
- etc etc

The Java Runtime Environment allows users to run Java applications without the overhead of having all the development tools. It includes:
- Virtual Machine
- Library machine code

While the JDK needs a JRE to run and test applications, having a JRE makes running apps for users significantly easier and simpler.

## How does Java support multi-platform?
Through the use of the JVM, you only need to compile Java source code to Java machine code, instead of to machine code for a specific platform.
Since the JVM can interpret the machine code for its build requirements, you only need to make code readable by the JVM on the compile step.
This 'compile once, run anywhere' build philosophy allows for the easy distribution of an application that made Java famous, and the standard for years.

## What is JAVA_HOME? PATH?
PATH is a file or group of files that determine where your OS looks for applications it needs to access. JAVA_HOME is one of the file paths
located here, and it indicates where your JDKs are stored for easy access for the IDE or terminal. Since you typically have more than one
JDK on your system, you want the whole folder rather than a direct file path to one of them.

## What is the starting point of a Java application?
You should have a .java file with a main. Main is the entry point into any application. After you write the source code, you compile your .java
file into the bytecode, and it becomes a .class file.

## What primitive types do you know?
byte, int, short, long, float, double, bool, char

## Is String a primitive type?
No, it is a char array. Primitives are objects that don't extend anything. Since it extends a primitive it is not one itself.

## How to extend String?
You can't because it is final. You can write your own String class if you wanted to though.

## What operators do you know?
- Math:
  - +, -, *, /, %
  - x++, ++x, x--, --x
  - +=, -=, *=, /=, %=
- Boolean:
  - <, >, ==, instanceof, !=, <=, >=, &&, ||
  - (also) !
- Bitwise:
  - &, |, ^, >>, <<, >>>
  - &=, |=, ^=, <<=, >>=, >>>=
- Other:
  - Ternary ('? :')
  - Assignment ('=')
  
## When will you choose to use switch over if?
Switch is useful if you have many cases, and a simple condition. Currently, I like using it for a terminal menu that can
call different functions, and have complex branching in it from the simple input. Switch is generally faster than if, and
the syntax is much better for a large amount of options.

If is better if you only have a couple options to pick from, or have to do some complex validation. You can do a quick
boolean check on a value, or some more complex input validation, and have a break or some other operation to change variables.

When it comes down to it, you can write either for any situation, but it is more difficult to do input validation with a switch
than an if, and its more difficult to do multiple cases with ifs and else ifs.

## What are your lecturer's name and title?
My practical lecturer is Yevhenii Kolchyba, Manager of Talents Efficiency

My general lecturer is Vladislav Boltrukanis, Head of JavaScript Competency Center