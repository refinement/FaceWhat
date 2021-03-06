package com.chat.service.aidl;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SESSION.
 */
public class Session {

    private String whoId;
    private String whoName;
    private String whoAvatar;
    private String sessionId;
    private String sessionName;
    private String body;
    private String type;
    private String time;
    private String status;
    private String unread;
    
	public String getWhoId() {
		return whoId;
	}
	public void setWhoId(String whoId) {
		this.whoId = whoId;
	}
	public String getWhoName() {
		return whoName;
	}
	public void setWhoName(String whoName) {
		this.whoName = whoName;
	}
	public String getWhoAvatar() {
		return whoAvatar;
	}
	public void setWhoAvatar(String whoAvatar) {
		this.whoAvatar = whoAvatar;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUnread() {
		return unread;
	}
	public void setUnread(String unread) {
		this.unread = unread;
	}
}
