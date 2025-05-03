# Selection Sort:

arr = [64, 34, 25, 5, 22, 11, 90, 12]

n = len(arr)
for i in range(n-1):
    minIndex = i
    for j in range(i+1, n):
        if arr[j] < arr[minIndex]:
            minIndex = j
    minValue = arr.pop(minIndex)
    arr.insert(i, minValue)

print('Sorted Array:', arr)

# Improved Selection Sort:
my_arr = [64, 34, 25, 5, 22, 11, 90, 12]

length = len(my_arr)
for i in range(length - 1):
    minindex = i
    for j in range(i+1, n):
        if my_arr[j] < my_arr[minindex]:
            minindex = j
    my_arr[i], my_arr[minindex] = my_arr[minindex], my_arr[i]

print('Sorted Array:', my_arr)