package kr.co.kwt.messageapi.application.port.out;

import kr.co.kwt.messageapi.domain.model.Message;

public interface MessageProducerPort {
    void send(Message message);
}