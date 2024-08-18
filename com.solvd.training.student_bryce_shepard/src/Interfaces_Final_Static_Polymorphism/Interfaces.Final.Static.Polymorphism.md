# 1
An interface allows control over distributing different attributes and methods
outside direct class inheritance. Like in the example with my zoo animals,
I can group together attributes and methods such as the ability to swim, or the kinds of
food eaten when those would not normally be a part of an inheritance hierarchy.

# 2
Static means that a reference is created and placed in the heap when the program starts up
The anything can reference that static variable/method, as long as it has proper access, even
if no objects of that class have been instantiated.

# 3
You cannot call non-static methods from static since there is a possibility it had not been
instantiated yet. However, you can always call static methods from a non-static method since
static methods are always in memory for the life of the program

# 4
1. A subclass can only extend 1 super or abstract class, but can implement multiple interfaces.
2. When the abstract class gets modified, you typically need to modify every single subclass in the hierarchy. Interfaces can use 'default' to make sure to not break API compatibility 
3. Abstract classes can have a constructor, so you can have more control over each instance if needed, interfaces cannot be instantiated.
4. Abstract classes can have concrete methods if needed ( and be overridden ), whereas interfaces are either abstract, or default and can't be overridden
5. Abstract classes can go through polymorphism, so if you have a child 3 or more layers deep, you can customize more thoroughly. Interfaces cannot do inheritance, so don't allow as much fine-tuning
6. Abstract classes can have a mix of mutable, static, final, protected, private, and public variables, according to the needs of the program. Interfaces are only public, static, and final for all.

# 5
Polymorphism means that I can add or override methods in subclasses to be more specific to wat they need.
For example, in my zoo, I made an Orca that extended a whale class, even though it's a carnivore. So I was able
to modify methods that stated it ate both meat and plants, to saying it just ate meat.

# 6
Final means nothing can modify it. So I can make a method final, and even if a subclass inherits the method,
it cannot be overridden.

# 7 & 8
Functional programming is paradigm where state is transferred between functions. You can use functions as values,
pass outputs and function calls between functions, and have more fluid movement between states.

I would say the primary differences between OOP and FP, are state management and encapsulation.
OOP is concerned almost entirely with encapsulation, making sure that all data is held in the same
place where the methods interacting with it are. OOP also has very concrete states, and moving between
them is very rigid.

It's hard to say which is better, since they are trying to tackle different problems. While FP can be difficult
to design and plan, difficult to follow and debug, and difficult to learn in general, OOP is difficult to refactor
once you have gone far enough into a project, which can be a real hassle. OOP also has a lot of boilerplate typically,
and it's rigid structure makes it difficult to tackle some problems.