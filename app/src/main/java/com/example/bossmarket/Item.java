package com.example.bossmarket;

public class Item {
    int itemImg;
    String itemName, itemDesc;

    public Item (int image, String name, String desc){
        this.itemImg = image;
        this.itemName = name;
        this.itemDesc = desc;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}
