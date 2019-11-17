package com.kodilla.stream.forumuser;

import com.kodilla.stream.StreamMain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public void addUser(ForumUser newUser){
        theUserList.add(newUser);
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }
}
