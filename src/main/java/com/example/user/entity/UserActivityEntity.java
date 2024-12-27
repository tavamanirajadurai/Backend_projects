package com.example.user.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class UserActivityEntity {
	public long id;
	public String type;
	public Repo repo;
	public Payload payload;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Repo getRepo() {
		return repo;
	}
	public void setRepo(Repo repo) {
		this.repo = repo;
	}
	public Payload getPayload() {
		return payload;
	}
	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
}
