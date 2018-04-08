package com.orangehrm.poc.hooks;

import cucumber.api.java.After;

/**
 * Created by YVAYNER-DV01 on 4/7/2018.
 */
public class DeleteUserHook {
    @After(value = "@deleteUser")
    public final void deleteUserCreated() {
        System.out.println("Eliminar User");
    }
}
