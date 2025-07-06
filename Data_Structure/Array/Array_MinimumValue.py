# Finding Minimum Value of an Array

my_arr = [7, 12, 9, 4, 11]
minValue = my_arr[0]

for i in my_arr:
    if i < minValue:
        minValue = i

print("Loest : ", minValue)