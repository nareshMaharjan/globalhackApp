package com.globalhack.app.cucumber.stepdefs;

import com.globalhack.app.GlobalhackApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GlobalhackApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
