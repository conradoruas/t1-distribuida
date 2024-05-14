package com.ine5418.email.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.ine5418.email.dtos.EmailRecordDto;
import com.ine5418.email.models.EmailModel;
import com.ine5418.email.services.EmailService;

@Component
public class EmailConsumer {
	final EmailService emailService;

	public EmailConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@RabbitListener(queues = "${broker.queue.email.name}")
	public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto) {
		var emailModel = new EmailModel();
		BeanUtils.copyProperties(emailRecordDto, emailModel);
		emailService.sendEmail(emailModel);
	}
}
