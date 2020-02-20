/**
 * 
 */
package com.EJaswanthReddy.InterestCalculator;

/**
 * @author harsha
 *
 */
public interface Calculate {
	public abstract double calculateSimpleInterest(double principleAmount, double time, double rateOfInterest);
	
	public abstract double calculateCompoundInterest(double principleAmount, double time, double rateOfInterest);
}
