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

package org.ifinalframework.api.hanshow.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * AP.
 *
 * @author likly
 * @version 1.2.4
 * @since 1.2.4
 */
@Setter
@Getter
public class AP {
    /**
     * 基站ID
     */
    private Long id;
    /**
     * 该基站在此user中的序号，用于基站屏幕显示
     */
    private Integer sequence;
    /**
     * MAC地址
     */
    private String mac;
    /**
     * 是否可以绑定一代价签
     */
    private Boolean allowBindV1Esl;
}
