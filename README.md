Strategy Pattern
This code demonstrates the Strategy Design Pattern in Java by implementing multiple payment methods:

Payment Interface: Defines the common pay method for all payment strategies.
Concrete Payment Strategies:
GooglePay: Implements the pay method for Google Pay.
Paytm: Implements the pay method for Paytm.
User Context Class:
Accepts a Payment strategy in its constructor.
Calls the pay method using the provided strategy.
How It Works
Create an instance of User with a specific payment strategy (GooglePay or Paytm).
Call the doPayment method to execute the chosen payment strategy.
