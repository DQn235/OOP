package de6;

public class Book {
    private String id, authors, title; 
    private Category category;

    public Book() {
    }

    public Book(String id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        
        if(category.compareToIgnoreCase("KHTN") == 0) {
            this.category = new Category(category);
        }else if (category.compareToIgnoreCase("KHXH") == 0){
            this.category = new Category(category);
        } else if (category.compareToIgnoreCase("Luan van") == 0){
            this.category = new Category(category);
        }else {
            this.category = new Category("Tap chi");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = new Category(category);
    }

//    @Override
//    public String toString() {
//        return id + " - " + authors + " - " + title + " - " + category;
//    }
}
