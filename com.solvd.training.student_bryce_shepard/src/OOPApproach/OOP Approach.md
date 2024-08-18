# 1
We need OOP to help encapsulate data with the methods that will use that data. 

# 2
Then everything is organized together, and you don't have to go searching for
methods related to specific piece of data

# 3
Encapsulation, inheritance, and polymorphism

# 4
Encapsulation means that data and the methods modifying that data are packaged
together in a container we call a class. It means you have everything wrapped
together nicely in a concisely organized package

# 5
Inheritance is when you can take parts or all of a class and bring it into another
class to save time writing code, or to build upon a pre-existing idea.

# 6
An abstract class is a class where it's only purpose is to be inherited from.
It lays out basic method and data requirements for a child class to follow,
and forces them to create their own versions of its methods.

# 7
An abstract method is declared in an abstract class, but not defined there.
It must be defined in every child class that extends the abstract class.

# 8
A constructor is used to define inputs for building a class, as well as doing
the work of instantiating any necessary data for the instantiation of the class.

# 9
A default constructor takes no arguments, and is used for instantiating the class
without the arguments.

# 10, 11
- access modifiers
  - public: allows anyone to access the element
  - protected: element is accessible within the same package and by subclasses
  - private: element is not accessible except within its same class
- declaration/reference modifiers
  - abstract: declares without defining - forces definition on child
  - final: prevents method from being overridden
  - static: puts the reference on the heap instead of the stack, so it can be referenced 
  without instantiation, or wasting memory on multiple definitions in the stack

# 12
Object is the superclass of everything. It gives basic definitions like toString()
so that anything can be compared, read, or converted to what you need to modify any given data

# 13
equals() compares the hash of any two objects when it compares them. This why it's a good
idea to override both if you are going to override one. changing how one gets called already
changes the other, so you want to make sure they both are doing what you want them to.

# 14
Overloading is done at run-time whereas overriding is done at compile-time. Overriding changed the
function definition given to the linker and overloading changes the instantiation, or specific call
depending on the data given while the program is running.