package com.ine5418.user.producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.ine5418.user.dtos.EmailDto;
import com.ine5418.user.models.UserModel;

@Component
public class UserProducer {
	final RabbitTemplate rabbitTemplate;

	public UserProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	@Value(value = "${broker.queue.email.name}")
	private String routingKey;

	public void publishMessageEmail(UserModel userModel) {
		var emailDto = new EmailDto();
		emailDto.setUserId(userModel.getUserId());
		emailDto.setEmailTo(userModel.getEmail());
		emailDto.setSubject("Cadastro realizado com sucesso");
		emailDto.setText(userModel.getName() + ", seja bem vindo!");

		rabbitTemplate.convertAndSend("", routingKey, emailDto);
	}


}
