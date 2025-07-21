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