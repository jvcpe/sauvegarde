package fr.cpe.impl;

import javax.inject.Inject;

import org.jboss.logging.Logger;

import fr.cpe.IAdd;
import fr.cpe.IAddRestService;

public class AddRestService implements IAddRestService {

	Logger logger = Logger.getLogger(AddRestService.class.getName());
	
	@Inject
	private IAdd addService;
	
	@Override
	public String add(float[] tab) {
		logger.info(">>> add()");
		return addService.doAdd(tab);
	}
}
