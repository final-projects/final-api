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

package org.ifinalframework.api.hanshow.domain.element;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.ifinalframework.data.hanshow.Element;

import javax.validation.constraints.NotNull;

/**
 * @author likly
 * @version 1.2.4
 **/
@Setter
@Getter
public class TextElement extends Element {

    /**
     * 字体类型
     * 字体名称后可添加三个属性：Regular/BOLD/ITALIC
     * 字体文件放置在${eslworking.home}/data/usr/fonts。
     * 如果找不到设置的字体文件，将使用系统默认字体。
     */
    @NotNull
    @JsonProperty("font_type")
    private String fontType;
    /**
     * 图层内容
     */
    @NotNull
    @JsonProperty("content_title")
    private String title;
    /**
     * 内容值
     */
    @JsonProperty("content_value")
    private String value;
    /**
     * 字体颜色
     * 设置为 RED 时，需要有红屏硬件才能显示。如果不支持的硬件默认显示黑色。
     */
    @NotNull
    @JsonProperty("content_color")
    private Color color = Color.BLACK;
    /**
     * 对齐方式
     */
    @JsonProperty("content_alignment")
    private Alignment alignment;
    /**
     * 文本垂直对齐方式
     */
    @JsonProperty("content_vertical_alignment")
    private VerticalAlignment verticalAlignment;
    /**
     * 文本是否自
     * 动换行
     */
    private Boolean autoWrap;

}
