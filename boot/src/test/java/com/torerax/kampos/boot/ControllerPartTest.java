package com.torerax.kampos.boot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ControllerPartTest {
    @InjectMocks
    private ControllerPart controller;

    @Test
    void testearController () {
        this.controller.pruebaTest();
    }
}