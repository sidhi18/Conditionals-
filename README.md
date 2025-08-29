Programs

11) Calculator (switch)

Ops: +, -, *, / with division-by-zero protection.
I/O: Two numbers + operator → prints result.

12) Day Number → Weekday (switch)

Input: 1–7
Output: MONDAY … SUNDAY
Note: Will be refactored later using an array once arrays are covered.

13) Month → Season (switch on name/number)

Maps month (name or 1–12) to a season (WINTER / SUMMER / MONSOON).
Tip: Cases grouped to reduce repetition.

14) ATM Simulator (menu + switch)

Menu: Check Balance / Withdraw / Deposit / Exit
Rules:

PIN verification on each action

Withdraw only if amount <= balance

Updates balance on successful withdraw/deposit

Rejects invalid/negative amounts

15) Student Result (Total, %, Grade)

Reads marks for 5 subjects, prints Total, Percentage, and Grade (A/B/C/D/Fail).
Optional rule: If any subject < 35 → Fail.

16) BMI Category

Computes BMI from weight (kg) and height (cm), prints category:
Underweight / Normal / Overweight / Obese.
BMI is shown to 2 decimal.

17) Quadratic Equation — Nature of Roots

Given coefficients a, b, c, computes discriminant and prints:
Real & Distinct / Real & Equal / Complex (Imaginary).

18) Grade with Plus/Minus (A+, A, A− …)

Granular else-if ladder. Example bands:

A+: 97–100

A : 93–96

A−: 90–92

B+: 87–89

B : 83–86

B−: 80–82

C+, C, C− … down to F

19) Triangle Validity & Type

Validates triangle with triangle inequality.
Then prints type: Equilateral, Isosceles, or Scalene.

20) Temperature Check (°C)

Classifies temperature into:

< 0 → Freezing

0–10 → Cold

11–25 → Moderate

26–35 → Warm

> 35 → Hot

Sample Runs

ATM — Withdraw

Enter choice: 2
Enter amount to Withdraw: 500
Enter your pin: 6732
Withdraw successful
Balance: 19500


Temperature

Enter temperature (°C): 31
Warm

Notes / Future Improvements

Program 12 (Weekday): refactor to use an array after learning arrays.

Extract repeated input/printing into small helper methods for cleaner code.

Add input validation and friendly error messages across all programs.


If you want, I can split this README into sections per file (`Conditionals_03` vs `Conditional_03_2`) or add a table of contents with quick links.
