package com.simplilearn.eFoodCrush.constant;

public class Authority {
	public static final String[] USER_AUTHORITIES = {
	"food:read, cart:read, cart:update, cart:write, order:read, order:write, order:delete" };
public static final String[] ADMIN_AUTHORITIES = { "food:read, food:write, food:update, order:read" };
}
