
# 1. What is an exception’s hierarchy? / 2. Why do we need the exception hierarchy? 
From object, you get Throwable which allows the compiler and JRE to throw errors and exceptions
From throwable you get Error, which is not something controlled by the developer, and also
Exception. Error means there's a problem with the code fundamentally, Exception means there's a
problem with the execution and implementation. Under Exception, you have RuntimeException which
are not thrown by code we write typically, and we should not try to. This hierarchy allows you to
inherit behavior

# 3. What exception types do you know?
NullPointerException
IOException

# 4. How we can throw an exception in Java?
static public void main(String args[]) throws Exception {}

# 5. How we can handle exceptions in Java (2 ways)?
with a try/catch. The catch can do multiple exceptions, it can also do file logging 

# 6. When we can use try-catch with resources? What is the requirement?

# 7. When finally block will be executed?

# 8. Will you handle RuntimeExceptions in try-catch block?

# 9. How to create a custom exception?
# 10. What is a logger? Logger levels? What log aggregators do you know?