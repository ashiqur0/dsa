# Array Minimum Value Finding:
arr = [7, 12, 9, 4, 11]
minimum = arr[0]

for i in arr:
    if minimum > i:
        minimum = i

print('Minimum:', minimum)

# Array Maximum Value Finding:
maximum = arr[0]

for i in arr:
    if maximum < i:
        maximum = i

print('Maximum:', maximum)

# Fibonacci Number using Iterative Method
fibo1 = 0
fibo2 = 1
print(fibo1)
print(fibo2)

for i in range(8):
    fibo3 = fibo1 + fibo2
    print(fibo3)
    fibo1 = fibo2
    fibo2 = fibo3

# Fibonacci Number using Recursive Method
fibo1 = 0
fibo2 = 1
print(fibo1)
print(fibo2)
count = 2

def fibonacci(fibo1, fibo2):
    global count
    if count < 10:
        fibo3 = fibo1 + fibo2
        print(fibo3)
        fibo1 = fibo2
        fibo2 = fibo3
        count += 1
        fibonacci(fibo1, fibo2)
    else:
        return

fibonacci(fibo1, fibo2)

# nth Fibonacci
def F(n):
    if n <= 1:
        return n
    else:
        return F(n-1) + F(n-2)

print('10th Fibonacci:', F(9))

# Bubble Sort
arr = [64, 34, 25, 5, 22, 11, 90, 12]

n = len(arr)
for i in range(n-1):
    for j in range(n-i-1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]

print('Sorted Array:', arr)

# Improved Bubble Sort
arr = [64, 34, 25, 5, 22, 11, 90, 12]

n = len(arr)
for i in range(n-1):
    swapped = False
    for j in range(n-i-1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]
            swapped = True
    if not swapped:
        break
print('Sorted Array:', arr)

# Selection Sort
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

# Improved Selection Sort
arr = [64, 34, 25, 5, 22, 11, 90, 12]

n = len(arr)
for i in range(n-1):
    minIndex = i
    for j in range(i+1, n):
        if arr[j] < arr[minIndex]:
            minIndex = j
    arr[i], arr[minIndex] = arr[minIndex], arr[i]

print('Sorted Array:', arr)

# Insertion Sort
arr = [64, 34, 25, 5, 22, 11, 90, 12]

n = len(arr)
for i in range(1, n):
    inset_index = i
    current_value = arr.pop(i)
    for j in range(i-1, -1, -1):
        if arr[j] > current_value:
            inset_index = j
    arr.insert(inset_index, current_value)

print('Sorted Array:', arr)

# Improved Insertion Sort
arr = [64, 34, 25, 5, 22, 11, 90]

n = len(arr)
for i in range(1, n):
    insert_index = i
    current_value = arr[i]
    for j in range(i-1, -1, -1):
        if arr[j] > current_value:
            arr[j+1] = arr[j]
            insert_index = j
        else:
            break
    arr[insert_index] = current_value
    
print('Sorted Array:-', arr)

# Linear Search
arr = [2, 3, 6, 4, 5, 9]
item = 5
for i in range(len(arr)):
    if arr[i] == item:
        print(item, "Found at index", i)

# Binary Search
def binarySearch(a, item):
    left = 0
    right = len(a)-1
    while left <= right:
        mid = (left + right) // 2
        if a[mid] == item:
            return mid
        if a[mid] < item:
            left = mid + 1
        else:
            right = mid - 1
    return False

a = [1, 3, 4, 6, 7]
item = 4
result = binarySearch(a, item)
if result:
    print(item, 'found')
else:
    print(item, 'not found')