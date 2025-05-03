# Fibonacci Number using Iterative Method
fibo1 = 0
fibo2 = 1
print(fibo1)
print(fibo2)
for i in range(3):
    fibo3 = fibo1 + fibo2
    print(fibo3)
    fibo1 = fibo2
    fibo2 = fibo3
else:
    print("Done") 