package com.sbtestcontroller.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstControllerTest {
    @Test
    void hello() {
        FirstController controller = new FirstController();
        String response = controller.hello("Java");
        assertEquals("Hello Java", response);
    }
}