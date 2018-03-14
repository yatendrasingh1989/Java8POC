package com.yaten.test.string;

import com.yaten.algorithms.string.Palindrome;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PalindromeTest {
   // @Mock
    private Palindrome palindrome;

    @Before//Executed before every test. It is used to prepare the test environment
    public void beforeEveryTest(){
        System.out.println("Before");
       // palindrome=new Palindrome();

       // test is failing when mocking like below
       palindrome= mock(Palindrome.class);
        palindrome=(Palindrome)palindrome;

    }

    @Test//Identifies a method as a test method.
    public void testPalindrome(){
        System.out.println("Test");
        Assert.assertEquals(true,palindrome.isPalindrome("radar"));
    }
    @After//Executed after each test. It is used to cleanup the test environment (e.g., delete temporary data, restore defaults). It can also save memory by cleaning up expensive memory structures.
    public void afterEveryTest(){
        System.out.println("After");
        palindrome=null;
    }
}
