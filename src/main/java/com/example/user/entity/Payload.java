package com.example.user.entity;

import java.util.List;

public class Payload {
public String ref;
public String action;
public List<Commit> commits;
public String getRef() {
	return ref;
}
public void setRef(String ref) {
	this.ref = ref;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public List<Commit> getCommits() {
	return commits;
}
public void setCommits(List<Commit> commits) {
	this.commits = commits;
}


}
