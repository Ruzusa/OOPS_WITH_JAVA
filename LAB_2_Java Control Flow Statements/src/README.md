# Lab 2: Java Control Flow Statements  


This lab focuses on mastering Java **control flow statements**, including decision-making structures (`if`, `if-else`, `switch`) and iteration constructs (`for`, `while`, `do-while`). Through practical exercises, students learn how to direct program execution, manage repetitive tasks, and apply statements like `break` and `continue` for fine-grained loop control.

 
## 🎯 Objectives  
- Understand and implement **decision-making** and **control flow** statements in Java.  
- Learn how to use **if**, **if-else**, **if-else-if**, **nested if**, and **switch** statements.  
- Practice **iteration statements**: for, while, and do-while loops.  
- Use **break**, **continue**, and **return** statements effectively in loops and conditions.  

---

## 📌 Quick Summary  

### 🔹 if Statement  
Executes a block of code **only if** the condition evaluates to `true`.  
```java
if (expression) {
    // code executes if condition is true
}
```

### 🔹 if...else Statement
Executes one block when the condition is true, and another when false.
```java
if (condition) {
    // true block
} else {
    // false block
}
```

### 🔹 if...else if Ladder
Used when you need to check multiple conditions sequentially.
```java
if (cond1) { ... }
else if (cond2) { ... }
else { ... }
```

### 🔹 Nested if...else
You can use an if statement inside another if to check more complex logic.

Example use case: finding the largest among three numbers.

### 🔹 Ternary Operator
A shorthand version of if...else.

variable = (condition) ? value_if_true : value_if_false;

### 🔹 switch Statement

Used to replace long if-else-if ladders and improve code readability.
```java
switch (variable) {
    case value1:
        // statements
        break;
    case value2:
        // statements
        break;
    default:
        // statements if no match
}
```

⚡ Always include a break; to prevent fall-through execution.

---

### 🔹 Loops in Java

Loops help repeat a block of code multiple times.

| Loop Type      | Syntax                         | Description                                           |
| -------------- | ------------------------------ | ----------------------------------------------------- |
| **for**        | `for(init; condition; update)` | Executes code a specific number of times.             |
| **while**      | `while(condition)`             | Executes while condition remains true.                |
| **do...while** | `do { ... } while(condition);` | Executes at least once before checking the condition. |


Example:
```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```
---

### 🔹 break Statement

Stops loop execution immediately and jumps out of it.
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;
}
```

### 🔹 continue Statement

Skips the current iteration and moves to the next one.
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) continue;
    System.out.println(i);
}
```

---
 
## 🧠 Key Takeaways

- Use if...else for binary decisions.

- Use switch for cleaner multiple-condition logic.

- Use loops to repeat actions efficiently.

- Use break/continue to control loop execution precisely.

---

## 📝 Exercises

#### 1. Prime Number Checker

Write a program that checks if a number is prime (divisible only by 1 and itself).

#### 2. Simple Calculator (Switch Case)

Implement a calculator performing addition, subtraction, multiplication, and division using switch.

#### 3. Even or Odd (do...while Loop)

Print numbers from 100 down to 1, showing whether each number is even or odd.

#### 4. Divisible by 5

Print numbers up to 100 that are divisible by 5 using a do...while loop.

#### 5. Season Finder

Write a program Season.java that takes two integers — month (M) and day (D) — and prints the season in the northern hemisphere using given date ranges:

Season	   From	            To

Spring	   March 21	        June 20

Summer	   June 21	        September 22

Fall	     September 23     December 21

Winter	   December 21     	March 20

#### 6. Multiplication Table

Display the multiplication table of a given number.

#### 7. Triangle Pattern

Print an N-by-N triangular pattern:
* * * * * *
  * * * * *
    * * * *
      * * *
        * *
          *


#### 8. Five Per Line

Using one for loop and one if statement, print numbers from 1000 to 2000, displaying five integers per line.

Hint: Use the modulus operator % to decide when to print a newline.
