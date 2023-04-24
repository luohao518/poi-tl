package com.deepoove.poi.tl.example;


import com.deepoove.poi.data.NumberingRenderData;

import java.util.List;

public class DocDetail {

    String title;

    String image;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<DocDetail> getChildLevel() {
		return childLevel;
	}

	public void setChildLevel(List<DocDetail> childLevel) {
		this.childLevel = childLevel;
	}

    private NumberingRenderData responsibility;

	List<DocDetail> childLevel;
}
