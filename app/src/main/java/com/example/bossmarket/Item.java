package com.example.bossmarket;

public class Item {
    int itemImg;
    String itemName, itemDesc, itemOrigin;

    public Item (int image, String name, String desc){
        this.itemImg = image;
        this.itemName = name;
        this.itemDesc = desc;
    }

    public Item (int image, String name, String desc, String origin){
        this.itemImg = image;
        this.itemName = name;
        this.itemDesc = desc;
        this.itemOrigin = origin;
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

    public String getItemOrigin() {
        return itemOrigin;
    }

    public void setItemOrigin(String itemOrigin) {
        this.itemOrigin = itemOrigin;
    }
}
