package de6;

public class Category {
    private String id, type;

    public Category() {
    }

    ///---------------------
    public Category(String type) {
        this.type = type;
    }

    public Category(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }  
}
