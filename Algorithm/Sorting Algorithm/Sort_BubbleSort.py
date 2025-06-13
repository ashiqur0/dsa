# Bubble Sort
arr = [64, 34, 25, 12, 22, 11, 90, 5]

n = len(arr)
for i in range(n-1):
    for j in range(n-i-1):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]

print('Sorted array:', arr)

# Advance Bubble Sort: 
my_arr = [64, 34, 25, 12, 22, 11, 90,  5]

length = len(my_arr)
for i in range(length-1):
    swapped = False
    for j in range(length-i-1):
        if my_arr[j] > my_arr[j+1]:
            my_arr[j], my_arr[j+1] = my_arr[j+1], my_arr[j]
            swapped = True
    if not swapped:
        break

print('Sorted array:', my_arr)