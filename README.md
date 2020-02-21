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