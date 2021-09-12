# TP03 - Invalid Form Input


1. ## Invalid Name

   ### Initial Setup
   **Step 1.** Input a valid date of birth and write some reason to join testing area.
   **Step 2.** Input a valid date of birth and write some reason to join testing area.
   **Step 3.** Input a valid date of birth and write some reason to join testing area.

   ### Test Step Description
   **Step 1.** Write a unexpected character as a name.
   **Step 2.** Write a number as a name.
   **Step 3.** Write a too short name.

   ### Expected Results
   **Step 1.** Form can not be submitted while required fields contains invalid inputs.
   **Step 2.** Form can not be submitted while required fields contains invalid inputs.
   **Step 3.** Form can not be submitted while required fields contains invalid inputs.

   ### Comments
   **Step 1.** Try to use any unexpected character for a person name, as: @, &, !, etc.
   **Step 2.** Try to use any number for a person name, as: 1, 2, 3, etc.
   **Step 3.** Try to use a name too short for a person, as: A, B, C.


2. ## Invalid date of birth

   ### Initial Setup
   **Step 1.** Input a valid name and write some reason to join testing area.
   **Step 2.** Input a valid name and write some reason to join testing area.
   **Step 3.** Input a valid name and write some reason to join testing area.

   ### Test Step Description
   **Step 1.** Write a date too far in the past.
   **Step 2.** Write a date which is exactly 17 years and 11 months ago.
   **Step 2.** Write the date before today.
   **Step 3.** Write a date in the future.

   ### Expected Results
   **Step 1.** Form can not be submitted while required fields contains invalid inputs.
   **Step 2.** Form can not be submitted while required fields contains invalid inputs.
   **Step 3.** Form can not be submitted while required fields contains invalid inputs.
   **Step 4.** Form can not be submitted while required fields contains invalid inputs.

   ### Comments
   **Step 1.** Try to use a date too far in the past, as: 200 years ago, 300 years ago, etc.
   **Step 2.** It is not expected an underage user can be submitted on the forms.
   **Step 2.** It is not expected an underage user can be submitted on the forms.
   **Step 4.** It not possible to use a future date as date of birth.


3. ## Invalid reason

   ### Initial Setup
   **Step 1.** Input a valid name and date of birth.
   **Step 2.** Input a valid name and date of birth.
   **Step 3.** Input a valid name and date of birth.
	   
   ### Test Step Description
   **Step 1.** Write a reason with four words.
   **Step 2.** Write a reason with one word.
   **Step 3.** Write a reason with 201 words.

   ### Expected Results
   **Step 1.** Form can not be submitted while a reason is too short.
   **Step 2.** Form can not be submitted while a reason is too short.
   **Step 3.** Form can not be submitted while a reason is too long.
	   
   ### Comments
   **Step 1.** Try to use any unexpected character for an word or shot words, as: @, &, !, lol, hi, etc.
   **Step 2.** Try to use any unexpected character for an word or shot words, as: @, &, !, lol, hi, etc.
   **Step 3.** You can use Lorem Ipsum generator to create a text with 201 words or more: https://www.lipsum.com/
