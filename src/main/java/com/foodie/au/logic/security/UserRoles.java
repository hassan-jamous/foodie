package com.foodie.au.logic.security;

public final class UserRoles {
    public static final String ADMIN_ROLE = "wmMkAdmin";
    //Spring Security Granted Authority requires ROLE_ before the role name
    public static final String SPRING_SECURITY_GRANTED_AUTHORITY_ADMIN_ROLE = "ROLE_wmMkAdmin";

    private UserRoles() {
    }
}
