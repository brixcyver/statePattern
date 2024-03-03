# Bank Account Management System using State Pattern 

A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.

* __Active accounts:__ Allow deposits and withdrawals.
* __Suspended accounts:__ Disallow deposits and withdrawals transactions, but allow viewing account information.
* __Closed accounts:__ Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

Implement the State pattern to improve code maintainability and flexibility:

1. __Define Account States:__ Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
2. __Implement State Interface:__ Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
3. __Implement State Behaviors:__ Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.
4. __Update Account Class:__
* Include attributes for accountNumber and balance.
* Remove state-specific logic from the Account class.
* Introduce a reference to the current AccountState object.
* Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.

<br>

## Logic:

__If the account is active:__
* You can either suspend it or close it.
  
__If the account is suspended:__
* You can either activate or close it.
* No deposits and withdrawals allowed.

__If the account is closed:__
* You can neither suspend nor activate it.
* No deposits and withdrawals allowed.

<br>


## Composition of Account:
__Attributes:__
* accountNumber : String
* balance:  Double
* accountState:  AccountState

<br>

## Methods:
* Setter and getter methods
* deposit(Double depositAmount): void
* withdraw(Double withdrawAmount): void
* suspend(): void
* activate(): void
* close() : void
* toString()   

<br>

## UML Diagram:

