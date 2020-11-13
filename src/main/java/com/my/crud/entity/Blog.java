package com.my.crud.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Blog extends Model {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userId;

    private String title;

    private String description;

    private String content;

    private LocalDateTime created;

    private Integer status;


}
