package com.strategy.ksh;

public class LeadConsultant implements Role {
    @Override
    public String description() {
        return LeadConsultant.class.getSimpleName();
    }

    @Override
    public String responsibilities() {
        return "Make tech decisions";
    }
}