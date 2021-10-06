package com.strategy.ksh;

public class Main {
    public static void main(String[] args) {
        Employee kyawkyaw = new Employee("Kyaw Kyaw", new Consultant());
        Employee kaunghtet = new Employee("Kaung Htet", new SeniorConsultant());
        Employee thiha = new Employee("Thiha", new LeadConsultant());

        System.out.println("=======Before promotion=======\n");

        kyawkyaw.doWork();
        kaunghtet.doWork();
        thiha.doWork();

        kyawkyaw.promote(new SeniorConsultant());
        kaunghtet.promote(new LeadConsultant());
        thiha.promote(new PrincipalConsultant());

        System.out.println("\n=======After promotion=======\n");

        kyawkyaw.doWork();
        kaunghtet.doWork();
        thiha.doWork();
        
    }
}
