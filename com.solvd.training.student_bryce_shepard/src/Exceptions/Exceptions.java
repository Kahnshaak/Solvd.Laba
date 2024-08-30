package Exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exceptions {
    private static final Logger logger = LogManager.getLogger(Exceptions.class);

    public static void main(String[] args) {
        //  try-catch block
        try {
            checkAge(-1);
        } catch (InvalidAgeException e) {
            logger.error("Caught Exception: {}", e.getMessage(), e);
        }

        // try-catch with multiple catch blocks
        try {
            withdraw(500, 1000);
            accessRestrictedArea(false);
        } catch (InsufficientFundsException e) {
            logger.error("Caught InsufficientFundsException: {}", e.getMessage(), e);
        } catch (UnauthorizedAccessException e) {
            logger.error("Caught UnauthorizedAccessException: {}", e.getMessage(), e);
        } catch (Exception e) {
            logger.error("Caught unexpected exception: {}", e.getMessage(), e);
        }

        // try-catch with resources
        try (FileWriter fileWriter = new FileWriter("log.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            parseInput("123abc");
            performOperation(false);
        } catch (InvalidInputException | OperationFailedException e) {
            // log messages to the console and file
            logger.error("Caught Exception: {}", e.getMessage(), e);
            try (FileWriter fileWriter = new FileWriter("error_log.txt", true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {
                e.printStackTrace(printWriter);
            } catch (IOException ioException) {
                logger.error("Failed to write to error log file: {}", ioException.getMessage(), ioException);
            }
        } catch (IOException e) {
            logger.error("IOException occurred: {}", e.getMessage(), e);
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Age must be between 0 and 100.");
        }
    }

    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for this operation.");
        }
    }

    public static void accessRestrictedArea(boolean authorized) throws UnauthorizedAccessException {
        if (!authorized) {
            throw new UnauthorizedAccessException("Access denied. Authorization required.");
        }
    }

    public static void parseInput(String input) throws InvalidInputException {
        try {
            int age = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid input format. Only digits are allowed.");
        }
    }

    public static void performOperation(boolean success) throws OperationFailedException {
        if (!success) {
            throw new OperationFailedException("Operation failed due to an unknown error.");
        }
    }
}