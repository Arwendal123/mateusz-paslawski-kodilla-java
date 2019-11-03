/* zanim zrobie wszystkie testy chcialbym to omówić, bo znalazłem sposób z override size()
w google, ale chciałbym zrozumieć dlaczego tak ma być i dlaczego później Intellj
kazał dorzucić 100 dodatkowych linijek wewnątrz listy.
Ewentualnie czy da się to zrobić inaczej, bo to bez sensu jeżeli znajdę rozwiązanie
zaadaptuję je do zadania, a nie zrozumiem istoty działania, no chyba ze znow
nie skorzystalem z prostszego sposobu przedstawionego w trakcie bootcampu...*/
package com.kodilla.testing.forum.statistics.mock;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.Stats;
import org.junit.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatistics0Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersCount()).thenReturn(6);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        Stats stats = new Stats(statisticsMock);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, stats.averagePostsPerUser);
        Assert.assertEquals(0, stats.averageCommentsPerUser);
        Assert.assertEquals(0, stats.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersCount()).thenReturn(6);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);

        Stats stats = new Stats(statisticsMock);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000/6, stats.averagePostsPerUser);
        Assert.assertEquals(200/6, stats.averageCommentsPerUser);
        Assert.assertEquals(200/1000, stats.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatistics0Comments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersCount()).thenReturn(6);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        Stats stats = new Stats(statisticsMock);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100/6, stats.averagePostsPerUser);
        Assert.assertEquals(0, stats.averageCommentsPerUser);
        Assert.assertEquals(0, stats.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatisticsMorePostsThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersCount()).thenReturn(6);
        when(statisticsMock.postsCount()).thenReturn(123);
        when(statisticsMock.commentsCount()).thenReturn(121);

        Stats stats = new Stats(statisticsMock);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(123/6, stats.averagePostsPerUser);
        Assert.assertEquals(121/6, stats.averageCommentsPerUser);
        Assert.assertEquals(121/123, stats.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersCount()).thenReturn(6);
        when(statisticsMock.postsCount()).thenReturn(123);
        when(statisticsMock.commentsCount()).thenReturn(124);

        Stats stats = new Stats(statisticsMock);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(123/6, stats.averagePostsPerUser);
        Assert.assertEquals(124/6, stats.averageCommentsPerUser);
        Assert.assertEquals(124/123, stats.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatistics0Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        Stats stats = new Stats(statisticsMock);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, stats.averagePostsPerUser);
        Assert.assertEquals(0, stats.averageCommentsPerUser);
        Assert.assertEquals(0, stats.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatistics1000Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.usersCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(1700);
        when(statisticsMock.commentsCount()).thenReturn(1200);

        Stats stats = new Stats(statisticsMock);
        //When
        stats.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1700/1000, stats.averagePostsPerUser);
        Assert.assertEquals(1200/1000, stats.averageCommentsPerUser);
        Assert.assertEquals(1200/1700, stats.averageCommentsPerPost);
    }

}
