package fr.cpe.impl;

import javax.ejb.Stateless;

import fr.cpe.IAdd;

@Stateless
public class Add implements IAdd{
	@Override
	public String doAdd(float[] tab) {
		float res = 0;
		for (float item : tab) {
		    res = res + item;
		}
		return "Result is :" + String.valueOf(res);
	}
	
}
