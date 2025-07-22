"""
Search: Linear Search Algorithm

Time Complexity: O(n)
Space Complexity: O(1)
"""

def linear_Search(item):
    for i in range(len(arr)):
        if arr[i] == item:
            return i
    else:
        return False


arr = [3, 4, 2, 5, 3, 8]
# item = 5;
item = 50;
result = linear_Search(item)

if result != False:
    print(item, "Found at index:", result)
else:
    print(item, "Not Found in the Array")