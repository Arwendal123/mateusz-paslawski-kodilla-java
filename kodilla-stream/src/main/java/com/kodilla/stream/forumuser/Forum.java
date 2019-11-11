package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();{
        theUserList.add(new ForumUser(1, "username1",
                'M', LocalDate.of(1998,1,1), 3));
        theUserList.add(new ForumUser(2, "username1",
                'M', LocalDate.of(2001,1,1), 4));
        theUserList.add(new ForumUser(3, "username1",
                'M', LocalDate.of(1999,1,1), 0));
        theUserList.add(new ForumUser(4, "username1",
                'M', LocalDate.of(2000,1,1), 2));
        theUserList.add(new ForumUser(5, "username1",
                'M', LocalDate.of(2010,1,1), 400));
        theUserList.add(new ForumUser(6, "username1",
                'M', LocalDate.of(1970,1,1), 1));
        theUserList.add(new ForumUser(7, "username1",
                'F', LocalDate.of(1978,1,1), 2));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
