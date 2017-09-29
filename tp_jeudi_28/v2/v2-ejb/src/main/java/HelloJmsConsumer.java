import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.jboss.logging.Logger;
@MessageDriven(name="HelloJmsMDB", activationConfig= {
		
})
public class HelloJmsConsumer implements MessageListener {

	
		private static Logger logger = Logger.getLogger(HelloJmsConsumer.class.getName());
		
		@Override
		public void onMessage(Message message) {
			logger.info(">>> onMessage() -" + message);
			try{
				Thread.sleep(3000);
			} catch (InterruptException e) {
				e.printStackTrace();
			}
			
			if (message instanceof TextMessage) {
				TextMessage textMessage = (TextMessage)message;
				
				try{
					logger.info("Hello" + textMessage.getText());
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		}
}
