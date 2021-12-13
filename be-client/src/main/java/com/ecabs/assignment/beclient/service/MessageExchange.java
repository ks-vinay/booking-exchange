package com.ecabs.assignment.beclient.service;

import com.ecabs.assignment.beclient.dto.MessageDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author Vinay KS
 * @created on 12/11/21
 * @project booking-exchange
 */

@Service
public class MessageExchange implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(MessageExchange.class);

    private ApplicationContext context;

    /**
     * @param messageDto
     */
    public void sendMessageToBrokerExchange(MessageDto messageDto){
        logger.info("Received booking details for the bookingId in MessageExchange {} ",messageDto.getBookingDto().getId());
        MessageBrokerExchange messageBrokerExchange = BeanFactoryAnnotationUtils.qualifiedBeanOfType(context.getAutowireCapableBeanFactory(), MessageBrokerExchange.class, messageDto.getEventType());
        messageBrokerExchange.auditMessage(messageDto);
        messageBrokerExchange.processMessage(messageDto);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
