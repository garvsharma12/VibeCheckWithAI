package com.draig.vibecheckwithai.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public class ProfileRepository extends MongoRepository<Profile, String> {

}
