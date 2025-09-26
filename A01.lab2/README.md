 # Lab 2 – Dice Game (OOP 1DT905)

This project is **Lab 2** from the *Object-Oriented Programming* course (1DT905, Linnaeus University).  
The assignment was to design and build a simple dice game in **Java**, applying the principles of **class design and responsibility separation**.

---

## Overview
The program is structured into multiple classes, each modeling a different part of the game:

- **`Dice.java`**  
  Models a standard die and provides a `roll()` method.  

- **`DiceGraphic.java`**  
  Extends `Dice` by adding a textual/visual representation of the roll result.  

- **`DiceGraphicCheating.java`**  
  A “cheating die” that can be manipulated to produce controlled outcomes.  

- **`DiceHand.java`**  
  Manages a group of dice (a player’s “hand”).  

- **`DicePlayer.java`**  
  Represents a player who owns a `DiceHand`.  

- **`DiceGame.java`**  
  Contains the main game logic, including player turns, dice rolls, and scoring.  

- **`Main.java`**  
  The entry point of the application that launches the game.  

---

## Key Idea
Each class has **one responsibility**:  
- Game pieces (`Dice`, `DiceGraphic`, `DiceGraphicCheating`)  
- Containers (`DiceHand`)  
- Players (`DicePlayer`)  
- Game flow (`DiceGame`, `Main`)  

This separation makes the system modular, easier to understand, extend, and maintain.  

---
## Requirements
- **Java 17** (or later)  

---

## Running the Program
From the repository root:  
```bash
cd A01.lab2
javac *.java
java Main
