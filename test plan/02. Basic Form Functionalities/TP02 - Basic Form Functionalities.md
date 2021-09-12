# TP02 - Basic Form Functionalities


1. ## Empty fields - All

   ### Initial Setup
   N/A
   
   ### Test Step Description
   **Step 1.** Left all fields empty and click on Submit.
   
   ### Expected Results
   **Step 1.** Form can not be submitted while required fields are empty and "This form is invalid. Check field 'What is your name'." message is displayed.
   
   ### Comments
   **Step 1.** Form must guide the user to correct the next required field.


2. ## Empty fields - "What is your name" not empty

   ### Initial Setup
   **Step 1.** TP02TC01 previously executed.
   
   ### Test Step Description
   **Step 1.** Write a valid name on "Name" field.
   **Step 2.** Left "What is the date of your birth?" and "Why did you join the testing area?" fields empty, and click on Submit.
   **Step 3.** Check if "This form is invalid. Check field 'What is the date of your birth'." message is displayed.
   
   ### Expected Results
   **Step 1.** User can insert their name on field.
   **Step 2.** Form can not be submitted while have required fields empty.
   **Step 3.** Message is displayed and user's name still on field.
   
   ### Comments
   **Step 3.** Form must guide the user to correct the next required field.


3. ## Empty fields - "What is your name" and "What is the date of your birth" not empty

   ### Initial Setup
   **Step 1.** TP02TC01 and TP02TC02 previously executed.
   
   ### Test Step Description
   **Step 1.** Write a valid date on "What is the date of your birth?" field.
   **Step 2.** Left "Why did you join the testing area?" field empty, and click on Submit.
   **Step 3.** Check if "This form is invalid. Check field 'Why did you join the testing area'." message is displayed.
   
   ### Expected Results
   **Step 1.** User can insert their date of birth on field.
   **Step 2.** Form can not be submitted while have required fields empty.
   **Step 3.** Message is displayed and user's name and date of birth still on fields.
   
   ### Comments
   **Step 3.** Form must guide the user to correct the next required field.


4. ## Empty fields - "What is your name", "What is the date of your birth" and "Why did you join the testing area" not empty

   ### Initial Setup
   **Step 1.** TP02TC01, TP02TC02 and TP02TC03 previously executed.
   
   ### Test Step Description
   **Step 1.** Write a valid text on "Why did you join the testing area?" field.
   **Step 2.** Submit form.
   **Step 3.** Check if "Information sent. Information sent successfully!" message is displayed.
   
   ### Expected Results
   **Step 1.** User can insert their reason for joining to testing area on field.
   **Step 2.** Form can be submmited
   **Step 3.** Message is displayed.
   
   ### Comments
   N/A
   