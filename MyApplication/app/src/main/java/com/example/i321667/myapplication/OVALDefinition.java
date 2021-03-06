package com.example.i321667.myapplication;

/**
 * Created by GanHong on 16/5/4.
 */
public class OVALDefinition {

    private String definitionName;
    private String date;
    private String url;
    private String category;
    private String description;

    public OVALDefinition(String name, String category, String date, String url, String description){
        this.definitionName = name;
        this.date = date;
        this.url = url;
        this.category = category;
        this.description = description;
    }

    public String getDefinitionName(){
        return definitionName;
    }

    public void setDefinitionName(String name){
        this.definitionName = name;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

}
