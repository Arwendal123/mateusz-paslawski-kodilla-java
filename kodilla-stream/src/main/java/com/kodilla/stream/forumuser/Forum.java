package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Forum {

    ForumUser user1 = new ForumUser(1, "username1", 'M', LocalDate.of(1998,1,1), 3);
    ForumUser user2 = new ForumUser(2, "username2", 'M', LocalDate.of(2001,1,1), 4);
    ForumUser user3 = new ForumUser(3, "username3", 'M', LocalDate.of(1999,1,1), 0);
    ForumUser user4 = new ForumUser(4, "username4", 'M', LocalDate.of(2000,1,1), 2);
    ForumUser user5 = new ForumUser(5, "username5", 'M', LocalDate.of(2010,1,1), 400);
    ForumUser user6 = new ForumUser(6, "username6", 'M', LocalDate.of(1970,1,1), 1);
    ForumUser user7 = new ForumUser(7, "username7", 'F', LocalDate.of(1978,1,1), 2);

    private final List<ForumUser> theUserList = new ArrayList<>(); {Arrays.asList(user1,user2,user3,user4,user5, user6, user7);
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
