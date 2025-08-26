def is_palindrome_number(num):
    original = str(num)
    reversed_num = original[::-1]
    return original == reversed_num

# Example usage
number = int(input("Enter a number: "))

if is_palindrome_number(number):
    print(f"{number} is a palindrome.")
else:
    print(f"{number} is not a palindrome.")
