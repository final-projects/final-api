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

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.ifinalframework.core.IEnum;

/**
 * Result.
 *
 * @author likly
 * @version 1.2.4
 * @since 1.2.4
 */
@Setter
@Getter
public class Result<T> {
    @JsonProperty("status_no")
    private Integer status;
    private String type;
    @JsonProperty("message")
    private String message;
    private String user;
    private T data;

    public boolean isSuccess(){
        return StatusNo.STATUS_NO_0.getCode().equals(status);
    }


    @AllArgsConstructor
    @Getter
    public enum StatusNo implements IEnum<Integer>{

        STATUS_NO_0(0,"成功完成"),
        STATUS_NO_1(1,"成功完成"),
        STATUS_NO_2(2,"成功完成"),
        STATUS_NO_100(100,"成功完成"),
        STATUS_NO_101(101,"成功完成"),
        STATUS_NO_102(102,"成功完成"),
        STATUS_NO_103(103,"成功完成"),
        STATUS_NO_104(104,"成功完成"),
        STATUS_NO_105(105,"成功完成"),
        STATUS_NO_200(200,"成功完成"),
        STATUS_NO_201(201,"成功完成"),
        STATUS_NO_202(202,"成功完成"),
        STATUS_NO_203(203,"成功完成"),
        STATUS_NO_204(204,"成功完成"),
        STATUS_NO_205(205,"成功完成"),
        STATUS_NO_206(206,"成功完成"),
        STATUS_NO_207(207,"成功完成"),
        STATUS_NO_208(208,"成功完成"),
        STATUS_NO_209(209,"成功完成"),
        STATUS_NO_500(500,"成功完成");


        private final Integer code;
        private final String desc;
    }

}
