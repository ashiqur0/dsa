# Binary Search

def binarySearch(arr, item):
    left = 0
    right = len(arr) - 1
    while(left <= right):
        mid = (left + right) // 2
        if arr[mid] == item:
            return mid
        if arr[mid] < item:
            left = mid + 1
        else:
            right = mid - 1
    else:
        return False

arr = [1, 2, 4, 5, 6, 7, 8, 9, 55]
item = 9

if(binarySearch(arr, item)):
    print(item, 'Fount at index', binarySearch(arr, item))
else:
    print(item, 'Not found')