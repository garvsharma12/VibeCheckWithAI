package com.draig.vibecheckwithai.profiles;

public record Profiles(
        String id,
        String firstName,
        String lastName,
        int age,
        String ethnicity,
        String location,
        Gender gender,
        String bio,
        String imageUrl,
        String myersBriggerspersonalityType
) {
}
