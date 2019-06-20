package ru.davletbaev.task15;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonTest {

    private String type;

    @JsonProperty("value")
    private JsonValue jsonValue;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JsonValue getJsonValue() {
        return jsonValue;
    }

    public void setJsonValue(JsonValue jsonValue) {
        this.jsonValue = jsonValue;
    }
}
