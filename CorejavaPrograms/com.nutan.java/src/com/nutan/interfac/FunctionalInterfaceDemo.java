package com.nutan.interfac;
@FunctionalInterface
interface Payment
{
	double makePayment(double amount);
}
public class FunctionalInterfaceDemo 
{

	public static void main(String[] args) 
	{
		Payment upi=new Payment()
				{
					public double makePayment(double amount)
					{
						return amount+50;
					}
				};
				double result = upi.makePayment(2000);
				System.out.println("Payment is :"+result);

	}

}
