package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        ForumUser user1 = new ForumUser(1, "username1", 'M', LocalDate.of(1998,1,1), 3);
        ForumUser user2 = new ForumUser(2, "username2", 'M', LocalDate.of(2001,1,1), 4);
        ForumUser user3 = new ForumUser(3, "username3", 'M', LocalDate.of(1999,1,1), 0);
        ForumUser user4 = new ForumUser(4, "username4", 'M', LocalDate.of(2000,1,1), 2);
        ForumUser user5 = new ForumUser(5, "username5", 'M', LocalDate.of(2010,1,1), 400);
        ForumUser user6 = new ForumUser(6, "username6", 'M', LocalDate.of(1970,1,1), 1);
        ForumUser user7 = new ForumUser(7, "username7", 'F', LocalDate.of(1978,1,1), 2);

        theForum.addUser(user1);
        theForum.addUser(user2);
        theForum.addUser(user3);
        theForum.addUser(user4);
        theForum.addUser(user5);
        theForum.addUser(user6);
        theForum.addUser(user7);

        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() > 19)
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println(theResultMapOfForumUsers);
    }
}