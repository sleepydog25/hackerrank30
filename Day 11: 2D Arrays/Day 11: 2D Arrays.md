# Context
Given a 6X6 2D Array, :

1 1 1 0 0 0 

0 1 0 0 0 0 

1 1 1 0 0 0 

0 0 0 0 0 0 

0 0 0 0 0 0 

0 0 0 0 0 0 

We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:

a b c 

  d   
  
e f g 


There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

# Task
Calculate the hourglass sum for every hourglass in A , then print the maximum hourglass sum.

## Sample Input

1 1 1 0 0 0 

0 1 0 0 0 0 

1 1 1 0 0 0 

0 0 2 4 4 0 

0 0 0 2 0 0 

0 0 1 2 4 0 


## Sample Output

19

### The full description of the problem is in the website below:
https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true
