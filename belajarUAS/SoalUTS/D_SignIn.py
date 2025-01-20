def create_account():
    print("========== Sign In ==========")
    while True:
        username = input("Username: ")
        # Cek username tidak boleh diakhiri '_' atau '.'
        if username[-1] in ['_', '.']:
            print("Username tidak boleh diakhiri '_' atau '.'. Silakan coba lagi.")
        else:
            break

    while True:
        password = input("Password: ")
        # Validasi password
        has_upper = any(char.isupper() for char in password)
        has_lower = any(char.islower() for char in password)
        has_digit = any(char.isdigit() for char in password)
        has_special = any(char in "!@#$%^&*\"'_`~" for char in password)
        no_space = ' ' not in password
        if len(password) >= 8 and has_upper and has_lower and has_digit and has_special and no_space:
            break
        else:
            print("Password harus terdiri dari minimal 8 karakter, "
                  "mengandung huruf besar, huruf kecil, angka, "
                  "dan minimal satu karakter spesial (!, @, #, $, %, ^, &, *, ', \", _), "
                  "tanpa spasi. Silakan coba lagi.")
    
    print("\nSign in completed")
    print(f"Hi {username}, your request has been accepted.\n")
    verify_account()

def verify_account():
    print("========== Verification ==========")
    print("Please continue your account creation by:")
    print("1. Registering your phone number")
    print("2. Registering your email")
    
    while True:
        choice = input("Choose verification method (1 for Phone, 2 for Email): ")
        if choice == '1':
            verify_phone()
            break
        elif choice == '2':
            verify_email()
            break
        else:
            print("Invalid choice. Please enter 1 or 2.")

def verify_phone():
    while True:
        phone_number = input("Phone number (format: +62xxxxxxxxxxx): ")
        # Validasi nomor telepon
        if phone_number.startswith("+62") and phone_number[1:].isdigit() and 10 <= len(phone_number[3:]) <= 13:
            print("Your number is registered.")
            break
        else:
            print("Number invalid. Phone number must be 10-13 digits, starting with +62. Silakan coba lagi.")

def verify_email():
    while True:
        email = input("Email: ")
        # Validasi email sederhana tanpa regex
        if "@" in email and "." in email and email.index("@") < email.rindex("."):
            print("Your email is registered.")
            break
        else:
            print("Email invalid. Please enter a valid email address.")

# Jalankan program
create_account()
