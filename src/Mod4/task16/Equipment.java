package Mod4.task16;

public abstract class Equipment {
    private String productName;
    private double price;
    private String levelOfProtection;
    private String size;
    private int article;

    public Equipment(String productName, double price, String levelOfProtection, String size, int article) {
        this.productName = productName;
        this.price = price;
        this.levelOfProtection = levelOfProtection;
        this.size = size;
        this.article = article;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Цена должна быть больше 0");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLevelOfProtection() {
        return levelOfProtection;
    }

    public void setLevelOfProtection(String levelOfProtection) {
        this.levelOfProtection = levelOfProtection;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStandardEquip() {
        return "Стандарт безопасности изделия" + levelOfProtection;

    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }


}
