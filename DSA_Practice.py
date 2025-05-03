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