# Linear Search
arr = [22, 78, 93, 227, 3089, 4048]
key = 227
isFound = False;
for i in range(len(arr)):
    if arr[i] == key:
        isFound = True

if isFound:
    print('Found')
else:
    print('Not Found')
    
# Binary Search
def binarySearch(arr, key):
    left = 0
    right = len(arr)-1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == key:
            return mid
        if arr[mid] < key:
            left = mid + 1
        else:
            right = mid - 1
    return False

isFound2 = binarySearch(arr, key)
if isFound2:
    print('Found at index', isFound2)
else:
    print('Not Found')