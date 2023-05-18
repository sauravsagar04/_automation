/*
 * Copyright (C) 2019 Fastjrun, Inc. All Rights Reserved.
 */
package org.listener;

import com.fastjrun.listener.BaseListener;
import org.entity.User;

public class RegisterSuccessNotifyListener extends BaseListener {
    public void processUser(User user) {
        log.info(" user :" + user);
    }
}

