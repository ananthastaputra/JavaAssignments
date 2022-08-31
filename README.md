# Prework-Assignment_SaiAnanth

Question 1 : First Letter Printer
provided with a string and returns a string with the first letter of every word in the string;

Sample Test Case
Input:
great learning
Output: 
gl

Solution:
1) Split the words using split method which returns string array
2) iterate the string array and get the first character of each word
3) concatenate each character and returns this String


Question 2: Find Missing Number

provided with an array of the size n-1. It contains distinct integers in the range of 1 to n. and returns missing number

Sample Test case:
5
1 2 3 4
Output:
5

Solution
1)iterate through array and find the iteration value is present with same index of arr
2)if itertaion value is not present in array store the number and break the loop


Question 3: Pattern Printer

print the following patter for a given n value.

For n=3
pattern is:
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

Solution 
1) we need to have 3 loops one is for controlling rows and others  is for controlling columns
2) we need to print n*i times the value of n 
3) last in iteration of i we have to print in new line for every row 


