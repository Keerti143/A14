package com.tnsif.Exception;

public class AgeValidator {
    static void validateAge(int age) throws InvalidAgeException {
    if (age<18) {
         throw new InvalidAgeException("Invalid age. You are not eligible to vote.");
     }
    
  } 
}
