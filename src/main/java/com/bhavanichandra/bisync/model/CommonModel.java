
package com.bhavanichandra.bisync.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(value = NON_NULL)
public class CommonModel {

    private String type;
    private String text;
    private Boolean emoji;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CommonModel() {
    }

    /**
     * 
     * @param emoji
     * @param text
     * @param type
     */
    public CommonModel(String type, String text, Boolean emoji) {
        super();
        this.type = type;
        this.text = text;
        this.emoji = emoji;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getEmoji() {
        return emoji;
    }

    public void setEmoji(Boolean emoji) {
        this.emoji = emoji;
    }

}
