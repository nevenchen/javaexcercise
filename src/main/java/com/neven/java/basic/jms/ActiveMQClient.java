package com.neven.java.basic.jms;

import java.io.IOException;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;

import org.apache.activemq.ActiveMQConnectionFactory;

public class ActiveMQClient {  
    
    public static void main(String[] args) throws IOException {  
          
        // -- http://dlc.sun.com/pdf//816-5904-10/816-5904-10.pdf  
        try {  
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");  
        // ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("vm://locahost");  
        Connection connection = factory.createConnection();  
        connection.start();  
          
        // create message topic  
        //Topic topic= new ActiveMQTopic("MyTopic");  
        InitialContext jndiContext=new InitialContext();  
        Topic topic=(Topic)jndiContext.lookup("MyTopic");   
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);  
          
        // register message consumer  
        MessageConsumer comsumer1 = session.createConsumer(topic);  
        comsumer1.setMessageListener(new MessageListener(){  
            public void onMessage(Message m) {  
                try {  
                    System.out.println("Consumer get " + ((TextMessage)m).getText());  
                } catch (JMSException e) {  
                    e.printStackTrace();  
                }   
            }  
        });  
        Thread.sleep(30000);  
        session.close();  
        connection.stop();  
          
        } catch(Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
}  
