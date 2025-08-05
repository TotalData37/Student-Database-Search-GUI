# Student Database Search (GUI-Based)

This is a Java GUI application that allows users to search a small student database using the last four digits of a **student ID**. The app uses **JOptionPane dialogs** to interact with the user and display student information such as **first name** and **GPA**.

> **Course**: CSIS 212-B02  
> **Author**: David Lyman  
> **Assignment**: 7  
> **Citation**: [Oracle JOptionPane Docs](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)

---

## 📁 Project Structure

Student-Database-Search-GUI/
├── FinalProjectPart1.java // GUI application to search for students by ID
├── FinalProjectPart1.class // Compiled Java class file
├── .gitattributes

---

## 💡 Features

- Search for students using a 4-digit ID
- Displays:
  - ✅ Student name
  - ✅ GPA
- Handles invalid input (non-numeric or missing)
- Includes retry loop with **"Would you like to search again?"** dialog
- Uses **JOptionPane** for all GUI interactions

---

## 🛠️ Getting Started

### ✅ Prerequisites

- Java Development Kit (JDK) 8 or later
- No external libraries required

### 📦 How to Run

1. Clone or download the project files.
2. Open a terminal in the project directory.
3. Compile the source file:

   ```bash
   javac FinalProjectPart1.java
4. Run the program:

   ```bash
   java assignmenteight.FinalProjectPart1
⚠️ Make sure your Java file is in the folder named assignmenteight/ to match the package declaration.

---

📄 Sample Interaction
User is prompted via a dialog:
Enter a 4-digit student ID to search:

If found:
Student Found:
Name: Cathy
GPA: 3.9

If not found or invalid:
No student found with ID: 9999
OR
Invalid input. Please enter a 4-digit number.

---

🧠 Concepts Demonstrated
Arrays to store student data

Loops for repeated searches

JOptionPane for GUI dialogs

Error handling with try-catch

Conditional logic for search and validation

---

📜 License
This project is for academic use and demonstration only. Not licensed for commercial use.
