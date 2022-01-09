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

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * Screen.
 *
 * @author likly
 * @version 1.2.4
 * @since 1.2.4
 */
@Setter
@Getter
public class Screen {
    @JsonProperty("default_page_id")
    private Integer defaultPageId;
    @JsonProperty("default_page")
    private String defaultPage;
    private List<Page> page;
    private Object args;
    /**
     * 用于设定模板中用到的图片内容，也就是模板中CONTENT_TYPE_BMP_FILE或CONTENT_TYPE_IMAGE类型的block使用的图片内容。
     * images对象 中每一个条目的key是图片文件的文件名，value是图片内容进行Base64编码后的内容，不 创建预览图不用提交此参数。
     */
    private Map<String,String> images;

}
