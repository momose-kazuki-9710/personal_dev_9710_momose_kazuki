package com.example.demo.entity.noTable;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//＝＝画面表示のためのクラス＝＝

//画面表示で使いたいものを集めて、Entityクラスを作る
// → Repositoryファイルを作成し、表示内容を設定する
//   → Controllerクラスで呼び出す＆HTMLで記述する

@Entity
public class ThreadDisplay {

	//スレッドのID
	@Id
	private Integer id;
	@Column(name = "category_id")
	private Integer categoryId;
	@Column(name = "category_name")
	private String categoryName;
	@Column(name = "title")
	private String title;
	@Column(name = "body")
	private String body;
	@Column(name = "creator")
	private String creator;
	@Column(name = "last_update_date")
	private LocalDateTime lastUpdateDate;
	@Column(name = "create_date")
	private LocalDateTime createDate;
	

	public ThreadDisplay() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public LocalDateTime getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	
}
