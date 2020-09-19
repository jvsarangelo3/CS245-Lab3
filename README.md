# CS245-Lab3
Jacelle Sarangelo
18 September 2020

The DeleteColumnsToSort program returns a list of values that aren't sorted by giving the columns in the given array of strings that should be deleted. It returns an empty list if the columns are sorted and returns -1 if the strings aren't the same length.

The program first creates an object "c" then the array of strings. The program creates different arrays to show the different outputs. The program then prints the list and the columns that should be deleted by going into the minDeletionSize function.

The minDeletionSize function creates an array list for the columns to delete. Then it goes into a loop that looks through each string in the list and tests to see if they have the same or different lengths. If they are different lengths, the col will read -1. Then the function goes into a different loop that first looks through the character in the columns then another loop goes through the columns of the array. It first checks the length of the col to make sure they're the same as the length of the string next to it, if they're not it ends through the loop and returns -1, else if they're the same length then it adds that value into the col list (the columns to delete). Finally, it breaks from the loop and returns those values, which are then printed.
