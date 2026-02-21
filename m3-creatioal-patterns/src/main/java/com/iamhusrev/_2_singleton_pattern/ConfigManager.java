package com.iamhusrev._2_singleton_pattern;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static final ConfigManager instance = new ConfigManager();
    private final Map<String, Object> settings = new HashMap<>();

    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}
