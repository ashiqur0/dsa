# Finding Maximum Value of an Array

my_arr = [7, 12, 9, 4, 11]
maxValue = my_arr[0]

for i in my_arr:
    if i > maxValue:
        maxValue = i

print("Maximu:", maxValue)