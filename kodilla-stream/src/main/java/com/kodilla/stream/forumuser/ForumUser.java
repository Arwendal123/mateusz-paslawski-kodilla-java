package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postCount;

    public ForumUser(int userID, String username, char sex, LocalDate dateOfBirth, int postCount) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
