# Linear Search

arr = [3, 4, 2, 5, 3, 8]
item = 5
for i in range(len(arr)):
    if arr[i] == item:
        print(item, "Found at index:", i)
        break