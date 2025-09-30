package com.draig.vibecheckwithai;

import com.draig.vibecheckwithai.conversations.ConversationRepository;
import com.draig.vibecheckwithai.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VibeCheckWithAiApplication {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private ConversationRepository conversationRepository;
    public static void main(String[] args) {
        SpringApplication.run(VibeCheckWithAiApplication.class, args);
    }

}
