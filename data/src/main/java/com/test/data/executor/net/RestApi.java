/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.test.data.executor.net;


import com.test.data.BuildConfig;
import com.test.data.executor.model.LoginResponseModel;

import java.util.List;

import io.reactivex.Observable;

/**
 * RestApi for retrieving data from the network.
 */
public interface RestApi {
  String API_BASE_URL =
          BuildConfig.SERVER_URL;

  /** Api url for getting all users */
  String API_URL_GET_USER_LIST = API_BASE_URL + "users.json";
  /** Api url for getting a user profile: Remember to concatenate id + 'json' */
  String API_URL_GET_USER_DETAILS = API_BASE_URL + "user_";

  /**
   * Retrieves an {@link Observable} which will emit a List of {@link com.test.data.executor.model.LoginResponseModel}.
   */
  Observable<List<LoginResponseModel>> userEntityList();

  /**
   * Retrieves an {@link Observable} which will emit a {@link }.
   *
   * @param userId The user id used to get user data.
   */
  Observable<LoginResponseModel> userEntityById(final int userId);
}
