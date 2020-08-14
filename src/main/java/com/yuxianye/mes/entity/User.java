package com.yuxianye.mes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import com.fasterxml.jackson.annotation.JsonFilter;

@Entity
@Table(name="yxy_user")
@DynamicUpdate(true)
@DynamicInsert(true)
@SelectBeforeUpdate
@JsonFilter("include")
public class User {


    
//    @Column(name = "id_", length = 36, nullable = false)
//    @GeneratedValue(generator = "uuid") // 指定生成器名称
//    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator") // 生成器名称，uuid生成类
	@Id
	@Column(name="id")
	private Integer id;

	private String name;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(String name) {
		this.name = name;
	}

}
