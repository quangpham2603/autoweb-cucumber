package testing.web.config;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private static final ThreadLocal<Map<String, Object>> sharedData =
            ThreadLocal.withInitial(HashMap::new);
    private static final String GET_ERROR_MESSAGE =
            "Can't get data value with key %s. Current shared data %s";


    public static ScenarioContext getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public void setData(String key, Object value) {
        sharedData.get().put(key, value);
    }

    public void setContext(String key, Object value) {
        getInstance().setData(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T getContext(String key, Object defaultValue) {
        try {
            return getInstance().getData(key);
        } catch (IllegalAccessError e) {
            return (T) defaultValue;
        }
    }
    public <T> T getContext(String key) {
        return getInstance().getData(key);
    }


    @SuppressWarnings("unchecked")
    public <T> T getData(String key) {
        if (sharedData.get().containsKey(key)) return (T) sharedData.get().get(key);
        String exceptionMsg = String.format(GET_ERROR_MESSAGE, key, getInstance());
        throw new IllegalAccessError(exceptionMsg);
    }

    private static class InstanceHolder {
        private static final ScenarioContext INSTANCE = new ScenarioContext();
    }
}
