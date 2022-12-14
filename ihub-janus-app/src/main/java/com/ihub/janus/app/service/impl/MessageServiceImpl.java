package com.ihub.janus.app.service.impl;

import com.ihub.janus.app.service.MessageService;
import com.ihub.janus.data.entity.Message;
import com.ihub.janus.data.entity.User;
import com.ihub.janus.data.repository.MessageRepository;
import com.ihub.janus.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    /** The user repository. */
    @Autowired
    private MessageRepository messageRepository;

    /**
     * Creates the.
     *
     * @return the user
     */
    @Override
    public Message create(Message message) {

        return messageRepository.save(message);
    }

}
