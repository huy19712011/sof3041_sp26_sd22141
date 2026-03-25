package org.example.sof3041_sp26_sd22141.methods;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {

    static MyUtil myUtil;

    //
    @BeforeAll
    static void setUpBeforeClass() {

        System.out.println("Set up before class - @BeforAll");
        myUtil = new MyUtil();
    }

    @AfterAll
    static void tearDownAfterClass() {

        System.out.println("Tear down after class- @AfterAll");
    }

    @BeforeEach
    void setUp() {

        System.out.println("Set up before each");
    }

    @AfterEach
    void tearDown() {

        System.out.println("Tear down after each");
    }

    @Test
    @DisplayName("Cong")
    void add() {

        //int result = new MyUtil().add(1,2);
        int result = myUtil.add(1,2);

        Assertions.assertEquals(3, result);

    }

    @Test
    @DisplayName("Dao nguoc ky tu")
    void reverse() {

        //Assertions.assertEquals("cba", new MyUtil().reverse("abc"));
        Assertions.assertEquals("cba", myUtil.reverse("abc"));
    }

    @Test
    @DisplayName("assertNull")
    void test_assertNull() {

        Assertions.assertNull(null);
    }

    @Test
    @DisplayName("assertNotNull")
    void test_assertNotNull() {

        Assertions.assertNotNull(1);
    }

    @Test
    @DisplayName("assertSame")
    void test_assertSame() {

        Assertions.assertSame("Hi", "Hi");
    }
    @Test
    @DisplayName("assertNotSame")
    void test_assertNotSame() {

        Assertions.assertNotSame("Hi", "Hello");
    }

    @Test
    @DisplayName("assertTrue")
    void test_assertTrue() {

        Assertions.assertTrue(3 > 0);
    }

    //
    @Test
    @DisplayName("for Arrays")
    void test_assertArrayEquals() {

        String[] s1 = {"A", "B"};
        String[] s2 = {"A", "B"};

        Assertions.assertArrayEquals(s1, s2);
    }

    //
    @Test
    @DisplayName("assertThrows")
    void test_assertThrows() {

        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException();
        });
    }
}