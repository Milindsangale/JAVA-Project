
def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y != 0:
        return x / y
    else:
        return "Error: Cannot divide by zero."

# Input from the user
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

print("Choose an operation:")
print("1. Add")
print("2. Subtract")
print("3. Multiply")
print("4. Divide")

choice = input("Enter your choice (1/2/3/4): ")

if choice == '1':
    print(f"Result: {num1} + {num2} = {add(num1, num2)}")
elif choice == '2':
    print(f"Result: {num1} - {num2} = {subtract(num1, num2)}")
elif choice == '3':
    print(f"Result: {num1} * {num2} = {multiply(num1, num2)}")
elif choice == '4':
    print(f"Result: {num1} / {num2} = {divide(num1, num2)}")
else:
    print("Invalid input. Please choose a valid operation (1/2/3/4).")
