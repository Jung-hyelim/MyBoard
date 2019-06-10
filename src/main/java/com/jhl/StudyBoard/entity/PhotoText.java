package com.jhl.StudyBoard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "photo_text")
@Getter
@NoArgsConstructor
public class PhotoText {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "photo_id")
	private Photo photo;
	
	@Column
	private double position_x;
	
	@Column
	private double position_y;
	
	@Column
	private String text;
	
	public PhotoText(Long id, Photo photo, double x, double y, String text) {
		this.id = id;
		this.photo = photo;
		this.position_x = x;
		this.position_y = y;
		this.text = text;
	}
	
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
}
