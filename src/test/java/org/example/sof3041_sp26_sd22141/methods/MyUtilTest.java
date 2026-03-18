package org.example.sof3041_sp26_sd22141.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilTest {

    @Test
    @DisplayName("Cong")
    void add() {

        int result = new MyUtil().add(1,2);

        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Dao nguoc ky tu")
    void reverse() {

        Assertions.assertEquals("cba", new MyUtil().reverse("abc"));
    }
}