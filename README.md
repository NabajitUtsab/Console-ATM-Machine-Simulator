# 🏧 Simple ATM Machine (Java Console Application)

A beginner-friendly **Java console-based ATM system** that allows users to check their balance, deposit money, withdraw money (with constraints), and exit safely.

---

## 🧠 Overview

This project demonstrates:
- Console-based user interaction using `Scanner`
- Menu-driven program structure
- Looping and conditional logic
- Simple arithmetic operations for account balance management

---

## ⚙️ Features

✅ **Check Balance** – View current account balance  
✅ **Deposit Funds** – Add money to your account  
✅ **Withdraw Funds** – Withdraw up to 100 taka at a time  
✅ **Validation** – Prevents negative or excessive withdrawals  
✅ **Exit Option** – Gracefully terminate the program  

---

## 💰 Rules & Constraints

- Maximum withdrawal limit per transaction: **100 taka**
- Cannot withdraw more than your available balance
- Negative withdrawal amounts are invalid

---

## 💻 Example Run

Welcome to the Simple Console ATM
Please select an option:

Check Balance

Deposit Funds

Withdraw Funds

Exit

2

How much do you want to deposit?

500

Your current balance is 500.0 taka

Welcome to the Simple Console ATM
Please select an option:

Check Balance

Deposit Funds

Withdraw Funds

Exit

3

How much do you want to withdraw?

200

You can withdraw maximum 100 taka!

Welcome to the Simple Console ATM
Please select an option:

Check Balance

Deposit Funds

Withdraw Funds

Exit

4

Thank you for using the ATM! Goodbye



---

## 🧩 Code Logic Breakdown

1. **Main Loop (`while`):**  
   Keeps the ATM running until the user selects Exit (option 4).

2. **Switch Case:**
   - `1` → Display current balance  
   - `2` → Deposit funds  
   - `3` → Withdraw funds (with validation)  
   - `4` → Exit program  
   - *Default* → Handles invalid inputs  

3. **Validation Checks:**
   - Prevents withdrawing more than balance  
   - Disallows negative withdrawals  
   - Restricts withdrawal amount to ≤ 100 taka  

---

## 🏗️ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/NabajitUtsab/simple-atm-machine.git

2. Navigate to the project folder:

cd simple-atm-machine


3. Compile the Java file:

javac AtmMachine.java


4. Run the program:

java AtmMachine
