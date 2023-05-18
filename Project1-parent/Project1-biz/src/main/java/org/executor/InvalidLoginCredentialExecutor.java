/*
 * Copyright (C) 2019 Fastjrun, Inc. All Rights Reserved.
 */
package org.executor;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fastjrun.executor.BaseSimpleJobExecutor;
import org.service.CoreUserService;

@Component("invalidLoginCredentialExecutor")
public class InvalidLoginCredentialExecutor extends BaseSimpleJobExecutor {
    @Autowired
    private CoreUserService coreUserService;

    @Override
    public void execute() {
        this.coreUserService.inValidUserLoginCredential(new Date());
    }
}
