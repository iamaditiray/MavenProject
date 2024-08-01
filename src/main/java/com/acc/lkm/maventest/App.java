package com.acc.lkm.maventest;

import java.util.SortedMap;
import java.util.TreeMap;

public class App {

    private SortedMap<String, String> marketProjects;

    public App() {
        marketProjects = new TreeMap<String, String>();
        initializeMarketProjects();
    }

    private void initializeMarketProjects() {
        marketProjects.put("US Market", "Project Alpha");
        marketProjects.put("European Market", "Project Beta");
        marketProjects.put("Asian Market", "Project Gamma");
    }

    public SortedMap<String, String> getMarketProjects() {
        return marketProjects;
    }

    public String getProjectForMarket(String market) {
        return marketProjects.get(market);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Markets and their Projects:");
        for (String market : app.getMarketProjects().keySet()) {
            System.out.println(market + " -> " + app.getProjectForMarket(market));
        }
        
        // Example of getting a project for a specific market
        String marketToCheck = "European Market";
        String project = app.getProjectForMarket(marketToCheck);
        System.out.println("The project for " + marketToCheck + " is " + project);
    }
}

