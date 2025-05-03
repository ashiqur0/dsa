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