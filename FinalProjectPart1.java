//FinalProjectPart1.java -This programs runs through a database of students with a GUI input dialog for known last 4 SSN
//CSIS 212-B02
// Oracle, Class JoptionPane https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html

package assignmenteight;

import javax.swing.JOptionPane; // Import a GUI input/output dialogs

public class FinalProjectPart1 {
    // Main method beings execution of Java application
    public static void main(String[] args) {
        // Declare and initialize the arrays
        int[] studentIDs = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
        String[] firstNames = {"Alice", "Ben", "Cathy", "David", "Eva", "Frank", "Grace", "Henry", "Isla", "Jack"};
        double[] gpas = {3.5, 2.8, 3.9, 3.2, 2.5, 3.4, 3.8, 3.0, 3.6, 3.1};

        boolean keepSearching = true; // Keeps track if the student ID was found

        while (keepSearching) {
            String input = JOptionPane.showInputDialog( // prompt the user to enter a student ID
                null,
                "Enter a 4-digit student ID to search:",
                "Student Lookup",
                JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) {
                // This is for when the user click cancel; Exit the loop
                break;
            }
            // Start of Loop
            try {
                int id = Integer.parseInt(input);
                boolean found = false;
                // Search for a matching student ID
                for (int i = 0; i < studentIDs.length; i++) {
                    if (studentIDs[i] == id) {
                        String message = "Student Found:\nName: " + firstNames[i] + "\nGPA: " + gpas[i];
                        JOptionPane.showMessageDialog(null, message, "Success", JOptionPane.INFORMATION_MESSAGE); // Shows student infomation
                        found = true; // End of Loop
                        break;
                    }
                }
                // Validation check if ID wasn't found
                if (!found) {
                    JOptionPane.showMessageDialog(
                        null,
                        "No student found with ID: " + id,
                        "Error",
                        JOptionPane.ERROR_MESSAGE 
                    );
                }
                // Input validation check in case a number was not inputed.
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Invalid input. Please enter a 4-digit number.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }

            // Display Assignment and my name 
            JOptionPane.showMessageDialog(
                null,
                "David Lyman – Assignment 7",
                "Info",
                JOptionPane.INFORMATION_MESSAGE
            );

            // asks if the user wants to continue searching again.
            int confirm = JOptionPane.showConfirmDialog(
                null,
                "Would you like to search for another student?",
                "Continue?",
                JOptionPane.YES_NO_OPTION
            );

            // Loops exits upon if the user chooses no
            if (confirm != JOptionPane.YES_OPTION) {
                keepSearching = false;
            }
        } // End of Main loop
    } // End of Main Method
} // End of Class FinalProjectPart1

