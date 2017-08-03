/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.test.data.executor.mapper;


import com.test.data.executor.model.LoginResponseModel;
import com.test.domain.executor.User;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * domain layer.
 */
@Singleton
public class UserEntityDataMapper {

    @Inject
    UserEntityDataMapper() {
    }

    /**
     *
     * @param userEntity Object to be transformed.
     */
    public User transform(LoginResponseModel userEntity) {
        User user = null;
        if (userEntity != null) {
            user = new User(userEntity.getCode());
            user.setCoverUrl(userEntity.getAccessToken());
            user.setFullName(userEntity.getStatus());
        }
        return user;
    }

}
