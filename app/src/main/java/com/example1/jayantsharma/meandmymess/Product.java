package com.example1.jayantsharma.meandmymess;

public class Product {
    private int id;
    private int image;

    private String name,regno,block,messtype;



    public Product(int id, String name, String regno, String block, String messtype, int image) {
        this.id = id;
        this.name = name;
        this.regno = regno;
        this.block = block;
        this.messtype = messtype;
        this.image = image;
    }
    public int getImage() {
        return image;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getRegno() {
        return regno;
    }

    public String getBlock() {
        return block;
    }

    public String getMesstype() {
        return messtype;
    }
}
