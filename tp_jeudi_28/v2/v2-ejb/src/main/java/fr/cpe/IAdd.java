package fr.cpe;

import javax.ejb.Local;

@Local
public interface IAdd{
	String doAdd(float tab[]);
}
