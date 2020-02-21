# Roman numbers to integers
Exercise to demonstrate how TDD helped me evolve the algorithm for roman numbers to integers conversion.

# Step 1
Verify setup is correct.

# Step 2
First failing test is to convert "I" to 1. I have assumed that this API wouldn't be passed any garbage inputs like "null" or random strings.

# Step 3
Pass the failing test with simplest solution. I just returned 1.

# Step 4
Next simplest failing test is to convert "II" to 2.

# Step 5
At this stage the idea is to avoid writing the actual algorithm as far as possible. So, I thought the simplest thing would be just an if..else.

# Step 6
Next simplest failing test to convert "III" to 3.

# Step 7
Again I am trying to avoid writing any algorithm. So, added another if..else to pass the test.

# Step 8
I could find some clear repetition in the tests as well as code. Time to refactor! The revelation at this point is that the integer output is just the number of "I"s in the input. My generalisation may be wrong at this stage but I don't really think much.

# Step 9
Next failing test to convert IV to 4.

# Step 10
This is the first I am really thinking about how to pass the test. I realised that 4 is represented as "IV" and not as "IIII". So I need to modify my logic. This reveals that when the input number is closer to the next higher literal (e.g. "IV" is closer to "V" than to "I"), the number (in Roman) starts to be represented in terms of the higher literal (i.e. "IV" is represented in terms of "V" and not as "IIII"). So I am thinking what if I start from the right and subtract the value of left literal from the right. But this will work only when literal on the left is smaller than that on right else I will have to add instead of subtract.

# Step 11
I just realised that I missed a simpler test which is of single literal as the input roman number (e.g. I, V, X, etc.). No complex calculation is needed in this case and we can just return the value of the literal. I tried to write a failing test for converting "V" to 5. However, this algoritm already works for this case. If I had written this test case at the start, I would have checked if the length of the string is 1 and just returned the value of the roman literal.

# Step 12
This is the first time I am considering a scenario where the right literal is smaller than the one to its left. However, it shouldn't be a concern because the algoritm adds them. So, I found a set of passing tests.

# Step 13
The case of "IX" is similar to that of "IV" but I have not yet provided the value of literal 'X'. I think this is also a good time to provide value of all roman literals.

# Step 14
Provide value of all roman literals and corresponding tests.

# Step 15
Now I am trying to consider cases involving more than two types of literals