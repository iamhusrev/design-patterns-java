package com.iamhusrev._2_singleton_pattern;

public class Demo {

    public static void main(String[] args) {

        ConfigManager config1 = ConfigManager.getInstance();
        config1.set("url", "https://example.com");

        ConfigManager config2 = ConfigManager.getInstance();

        System.out.println(config2.get("url")); // Output: https://example.com
    }

}
