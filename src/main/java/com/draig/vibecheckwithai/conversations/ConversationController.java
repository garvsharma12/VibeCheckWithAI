package com.draig.vibecheckwithai.conversations;

import com.draig.vibecheckwithai.profiles.ProfileRepository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.UUID;

public class ConversationController {

    private final ConversationRepository conversationRepository;
    private final ProfileRepository profileRepository;

    public ConversationController(ConversationRepository conversationRepository, ProfileRepository profileRepository) {
        this.conversationRepository = conversationRepository;
        this.profileRepository = profileRepository;
    }

    @PostMapping("/conversations")
    public Conversation createNewConversation(CreateConversationRequest request){
        profileRepository.findById(request.profileId()).
                orElseThrow(() -> new IllegalArgumentException("Profile not found"));
        Conversation conversation = new Conversation(
                UUID.randomUUID().toString(),
                request.profileId(),
                new ArrayList<>()
        );
        conversationRepository.save(conversation);
        return conversation;
    }

    public record CreateConversationRequest(String profileId){

    }
}
