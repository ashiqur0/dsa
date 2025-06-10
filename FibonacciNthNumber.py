# nth Fibonacci Number

def F(n):
    if n <= 1:
        return n
    return F(n-1) + F(n-2)

print(F(0)) 
print(F(1)) 
print(F(2)) 
print(F(3)) 
print(F(4)) 
print(F(5)) 
print(F(6))