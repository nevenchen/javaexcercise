package com.neven.java.basic.jms;
import java.net.URI;  
import java.net.URISyntaxException;  
  
import javax.jms.Connection;  
import javax.jms.ConnectionFactory;  
import javax.jms.Destination;  
import javax.jms.JMSException;  
import javax.jms.MessageProducer;  
import javax.jms.Session;  
import javax.jms.TextMessage;  
import javax.naming.Context;  
import javax.naming.InitialContext;  
import javax.naming.NamingException;  
  
import org.apache.activemq.broker.BrokerFactory;  
import org.apache.activemq.broker.BrokerService;  
import org.apache.commons.logging.Log;  
import org.apache.commons.logging.LogFactory;  
  
/** 
 * refer to http://activemq.apache.org/jndi-support.html 
 * http://activemq.apache.org/how-do-i-embed-a-broker-inside-a-connection.html 
 * @author gloomyfish 
 * 
 */  
public class PureJMSProducer {  
      
    private static final Log LOG = LogFactory.getLog(PureJMSProducer.class);  
  
    private PureJMSProducer() {  
    }  
  
    /** 
     * @param args the destination name to send to and optionally, the number of 
     *                messages to send 
     */  
    public static void main(String[] args) {  
        Context jndiContext = null;  
        ConnectionFactory connectionFactory = null;  
        Connection connection = null;  
        Session session = null;  
        Destination destination = null;  
        MessageProducer producer = null;  
        BrokerService broker = null;  
        final int numMsgs = 10;  
  
        /* 
         * Create a JNDI API InitialContext object 
         */  
        try {  
            jndiContext = new InitialContext();  
        } catch (NamingException e) {  
            LOG.info("Could not create JNDI API context: " + e.toString());  
            System.exit(1);  
        }  
          
        // create external TCP broker  
        try {  
            broker = BrokerFactory.createBroker(new URI("broker:tcp://localhost:61616"));  
            broker.start();   
        } catch (URISyntaxException e) {  
            LOG.info("Could not create broker: " + e.toString());  
        } catch (Exception e) {  
            LOG.info("Could not create broker: " + e.toString());  
        }  
//        try {  
//            
//        }  
  
        /* 
         * Look up connection factory and destination. 
         */  
        try {  
            connectionFactory = (ConnectionFactory)jndiContext.lookup("ConnectionFactory");  
            destination = (Destination)jndiContext.lookup("MyTopic");  
        } catch (NamingException e) {  
            LOG.info("JNDI API lookup failed: " + e);  
            System.exit(1);  
        }  
          
        /* 
         * Create connection. Create session from connection; false means 
         * session is not transacted. Create sender and text message. Send 
         * messages, varying text slightly. Send end-of-messages message. 
         * Finally, close connection. 
         */  
        try {  
            connection = connectionFactory.createConnection();  
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);  
            producer = session.createProducer(destination);  
            TextMessage message = session.createTextMessage();  
            Thread.sleep(3000);  
            for (int i = 0; i < numMsgs; i++) {  
                message.setText("This is message " + (i + 1));  
                LOG.info("Sending message: " + message.getText());  
                producer.send(message);  
                Thread.sleep(3000);  
            }  
  
            /* 
             * Send a non-text control message indicating end of messages. 
             */  
            producer.send(session.createMessage());  
        } catch (JMSException e) {  
            LOG.info("Exception occurred: " + e);  
        } catch (InterruptedException e) {  
            LOG.info("Exception occurred: " + e);  
        } finally {  
            if (connection != null) {  
                try {  
                    connection.close();  
                } catch (JMSException e) {  
                }  
            }  
        }  
          
        // stop the TCP broker  
        try {  
            broker.stop();  
        } catch (Exception e) {  
            LOG.info("stop the broker failed: " + e);  
        }  
    }  
  
  
}  