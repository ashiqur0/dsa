# nth Fibonacci Number

def F(n):
    if n <= 1:
        return n
    else:
        return F(n-1) + F(n-2)

print(F(9)) 

# As 0 based index: F(9) will return the 10th fibonacci 