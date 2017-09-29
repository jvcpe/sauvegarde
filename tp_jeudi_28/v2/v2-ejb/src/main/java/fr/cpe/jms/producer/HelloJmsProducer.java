package fr.cpe.jms.producer;

import javax.inject.Inject;
import javax.jms.Queue;
import javax.jms.JMSContext;
import javax.ejb.Stateless;
import javax.annotation.Resource;


import fr.cpe.jms.producer.IHelloJmsProducer;

public class HelloJmsProducer implements IHelloJmsProducer {
	@Resource(name="java:/asi2-hello")
	private Queue queue;
	
	@Inject
	private JMSContext context;
	
	@Override
	public String sayHello(String name) {
		context.createProducer()
		.send(queue, name);
		return null;
	}
}
