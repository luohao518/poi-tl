package com.deepoove.poi.tl.example;


import com.deepoove.poi.data.TableRenderData;

import java.util.List;

public class Doc {

    String title1;
    String title2;

    String title3;

    List<DocDetail> level1;

    TableRenderData table;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    String image;


    public TableRenderData getTable() {
        return table;
    }

    public void setTable(TableRenderData table) {
        this.table = table;
    }


    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }


    public List<DocDetail> getLevel1() {
        return level1;
    }

    public void setLevel1(List<DocDetail> level1) {
        this.level1 = level1;
    }
}
