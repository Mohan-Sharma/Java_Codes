package org.msharma.noviceproblems.exception.Exercise;

import java.util.HashSet;
import java.util.Set;

/**
 * Get all the numbers which are not fibonacci and less than given number
 */
class ExceptFibonacci
{
	private Set<Integer> getTheSetUptoGivenNumber(int number)
	{
		Set<Integer> numberSet = new HashSet<>();
		for(int i=0;i<=number;i++)
		{
			numberSet.add(i);
		}
		return numberSet;
	}

	private Set<Integer> getFibonacciSetUptoGivenNumber(int number)
	{
		Set<Integer> fibboSet = new HashSet<>();
		int first=0, second=1, sum;
		while(first < number)
		{
			sum = first + second;
			fibboSet.add(first);
			first = second;
			second = sum;
		}
		return fibboSet;
	}

	public static void main(String arr[])
	{
		int number = 100;
		ExceptFibonacci exceptFibonacci = new ExceptFibonacci();
		Set<Integer> setOfAllNumbers = exceptFibonacci.getTheSetUptoGivenNumber(number);
		Set<Integer> setOfFibonacciNumbers = exceptFibonacci.getFibonacciSetUptoGivenNumber(number);
		System.out.println("The set of numbers without fibonacci : ");
		setOfAllNumbers.removeAll(setOfFibonacciNumbers);
		System.out.println(setOfAllNumbers);

	}
}