package com.fullstack.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue
	private Long course_id;
	private String course_title;
	private String mini_desc;
	private String course_img_path;
	private String video_url;
	@Column(columnDefinition = "TEXT", length = 1500)
	private String description;
	@Column(columnDefinition = "TEXT", length = 1500)
	private String key_aspects;
}
