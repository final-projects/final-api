/*
 * Copyright 2020-2022 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ifinalframework.api.hanshow;

import org.ifinalframework.api.hanshow.domain.AP;
import org.ifinalframework.api.hanshow.domain.Firmware;
import org.ifinalframework.api.hanshow.domain.PreviewImage;
import org.ifinalframework.api.hanshow.domain.User;
import org.ifinalframework.api.hanshow.pojo.EslPage;
import org.ifinalframework.api.hanshow.pojo.Template;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * HanShowClient.
 *
 * @author likly
 * @version 1.2.4
 * @since 1.2.4
 */
public interface HanShowClient {

    @PUT("/{user}/esls/{id}")
    Call<Result> updateEsl(@Path("user") String user, @Path("id") String id);

    /**
     * 获得全部价签类型
     *
     * @param user 用户
     */
    @GET("/{user}/esls/firmwares")
    Call<Result<List<Firmware>>> firmwares(@Path("user") String user);

    /**
     * 获得单个价签类型
     *
     * @param user 用户
     * @param id   类型ID
     */
    @GET("/{user}/esls/firmwares/{id}")
    Call<Result<Firmware>> firmwares(@Path("user") String user, @Path("id") Integer id);

    /**
     * 获得所有user数据
     */
    @GET("/users")
    Call<Result<List<User>>> users();

    /**
     * 获得指定user数据
     *
     * @param user 用户
     */
    @GET("/{user}/user")
    Call<Result<User>> user(@Path("user") String user);

    /**
     * 为该门店分配一个基站
     * @param user 用户
     * @param ap 基站
     */
    @PUT("/{user}/user/ap")
    Call<Result<Void>> ap(@Path("user") String user,@Body AP ap);

    @DELETE("/{user}/user/ap/{mac}")
    Call<Result<Void>> ap(@Path("user") String user,@Path("mac") String mac);

    @GET("/esls/page/{page}")
    Call<Result<EslPage>> esls(@Path("page") Integer page);

    @GET("/{user}/esls/page/{page}")
    Call<Result<EslPage>> esls(@Path("user") String user,@Path("page") Integer page);

    /**
     * 上传MPD模板
     *
     * @param user 用户
     * @param name 模板名称
     */
    @PUT("/{user}/templates/mpd/{name}")
    Call<Result<List<PreviewImage>>> templates(@Path("user") String user, @Path("name") String name,
                                                    @Body Template body);

}
