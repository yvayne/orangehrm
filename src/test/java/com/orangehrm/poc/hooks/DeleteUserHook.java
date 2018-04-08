package com.orangehrm.poc.hooks;

import cucumber.api.java.After;

/**
 * It is in charge to delete a user once was created.
 */
public class DeleteUserHook {
    @After(value = "@deleteUser")
    public final void deleteUserCreated() {
        System.out.println("Deleted User");
    }
}
