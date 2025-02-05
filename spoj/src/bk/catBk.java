Class Category thêm:
public Category(String type) {
        this.type = type;
    }


Class Book


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


public Category getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = new Category(category);
    }

    @Override
    public String toString() {
        return id + " - " + authors + " - " + title + " - " + category;
    }



Btn them Sách

Book x = new Book(txtID.getText(), txtAuthor.getText(),
                txtTitle.getText(), cbCategory.getSelectedItem().toString());

        danhsach.add(x);

        try {
            File f = new File("books.dat");
            PrintWriter pw = new PrintWriter(f);
            for (Book b : danhsach) {
                pw.printf("%s-%s-%s-%s\n", b.getId(), b.getAuthors(),
                        b.getTitle(), b.getCategory().getType());
            }

            pw.close();

            JOptionPane.showMessageDialog(null, "Luu du lieu thanh cong");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Luu file that bai");
            System.out.println(ex);
        }



btn clear

txtID.setText("");
        txtAuthor.setText("");
        txtTitle.setText("");

        cbCategory.setSelectedIndex(0); //Combobox

        JOptionPane.showMessageDialog(rootPane, "Lam moi thanh cong!");

