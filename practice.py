## Greet First letter of the Name with upper case
# fruits = input()
# print(fruits.title())

## Grand Father- Grand Son - Gold Coin
# n = int(input())
# print(pow(n, n+1))

## nth Fibonacci
def F(n):
    if n <= 1:
        return n
    else:
        return F(n-1) + F(n-2)

for i in range(0,10):
    print(F(i), end=" ")