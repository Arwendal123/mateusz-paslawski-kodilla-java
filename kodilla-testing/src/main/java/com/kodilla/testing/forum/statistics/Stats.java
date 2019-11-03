/* zmuszało mnie do dodania public przed zmiennymi, nie mam pojecia dlaczego,
skoro klasa jest publiczna, przed metodą calculateAdvStatistics tez musialem dopisac public
 */

package com.kodilla.testing.forum.statistics;

public class Stats {
    public int totalPosts;
    public int totalComments;
    public int totalUsers;
    public int averagePostsPerUser;
    public int averageCommentsPerUser;
    public int averageCommentsPerPost;
    Statistics statistics;

    public Stats(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersCount()!=0) {
            totalPosts = statistics.postsCount();
        } else {
            totalPosts = 0;
        }
        if (statistics.usersCount()!=0) {
            totalComments = statistics.commentsCount();
        } else {
            totalComments = 0;
        }
        if (statistics.usersCount()!=0) {
            totalUsers = statistics.usersCount();
        } else {
            totalUsers = 0;
        }
        if (statistics.usersCount()!=0) {
            averagePostsPerUser = statistics.postsCount() / statistics.usersCount();
        } else {
            averagePostsPerUser = 0;
        }
        if (statistics.usersCount()!=0) {
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersCount();
        } else {
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount()!=0) {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }

    void showStatistics() {
        System.out.println("Total posts: " + totalPosts);
        System.out.println("Total comments: " + totalComments);
        System.out.println("Total users: " + totalUsers);
        System.out.println("Avg. posts per user: " + averagePostsPerUser);
        System.out.println("Avg. comments per user: " + averageCommentsPerUser);
        System.out.println("Avg. comments per post: " + averageCommentsPerPost);
    }
}
