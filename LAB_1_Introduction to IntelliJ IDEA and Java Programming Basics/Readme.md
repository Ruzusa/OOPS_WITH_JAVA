# Lab 1: Introduction to IntelliJ IDEA and Java Programming Basics

## 🎯 Objectives
- Get familiar with **Java basics** (data types, variables, operators, type casting).  
- Learn to use **IntelliJ IDEA** for creating and running Java projects.  
- Explore **String, Math, and Character classes** with their commonly used methods.  
- Practice problem-solving by writing small Java programs.  

---

## 📌 Quick Summary
To solve the exercises in this lab, you should know:

### 🔹 Data Types
- Primitive types: `int`, `byte`, `short`, `long`, `float`, `double`, `char`, `boolean`.  
- Widening casting: small type → larger type (automatic).  
- Narrowing casting: larger type → small type (manual with `(type)`).

### 🔹 Operators
- Arithmetic: `+ - * / %`  
- Increment/Decrement: `++ --`  
- Relational: `== != > < >= <=`  
- Logical: `&& || !`  
- Assignment: `= += -= *= /= %=`  
- Ternary: `condition ? value1 : value2`

### 🔹 Strings
- `length()`, `concat()`, `toUpperCase()`, `toLowerCase()`  
- `charAt(index)`, `indexOf("text")`, `substring(start, end)`  
- Strings are **immutable** → operations create new objects.

### 🔹 Math Class
- Common methods: `sqrt()`, `pow()`, `abs()`, `ceil()`, `floor()`, `round()`, `max()`, `min()`, `PI`, `random()`.

### 🔹 Character Class
- `isDigit()`, `isLetter()`, `isUpperCase()`, `isLowerCase()`, `isWhitespace()`  
- `toUpperCase()`, `toLowerCase()`

---

## 📝 Exercises


1. Write a program in Java to implement the formula: Area = Length * Width and use arbitrary values to find the area of a rectangle.  
2. Write a program to calculate perimeter of a square. 
3. Suppose a student has achieved 76 marks in English, 88 in Math, 94 in Physics and 85 in History. Write a code to find the percentage of the student.  
4. Create a name variable of type String and assign it your name as value.  
5. Consider the following string:
   String hannah = "Did Hannah see bees? Hannah did.";

   a.	What is the value displayed by the expression hannah.length()?
 
   b.	What is the value returned by the method call hannah.charAt(12)?
 
6. Convert the value of txt to upper case.

   String txt = "Pakistan"

7. How long is the string returned by the following expression? What is the string?
   
  "Was it a car or a cat I saw?".substring(9, 12)

8. Show two ways to concatenate the following two strings together to get the string "Hi, Mom.".

   String stringOne = “Hi”;

   String stringTwo = “Mom”

9. Write a program to find the ASCII code of a character..
10. Create byte variables and assign values like 30, -25 (which are in the byte range) and values like 7000, -1500 (which are outside the byte range) and see what will be the output and discuss it.
11. Write a program to calculate the roots of a Quadratic equation.
   
