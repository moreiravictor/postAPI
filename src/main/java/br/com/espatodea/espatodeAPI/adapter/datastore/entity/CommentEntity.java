package br.com.espatodea.espatodeAPI.adapter.datastore.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "comments")
public class CommentEntity {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "comment_id")
	private int comment_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private PostEntity post;
	
	@Column(name = "comment_content", columnDefinition = "TEXT")
	private String comment_content;
	
	@Column(name = "comment_author")
	private	String comment_author;
	
	@Column(name = "comment_date")
	private Date comment_date;
	
	@Column(name = "comment_like")
	private int comment_like;
}
