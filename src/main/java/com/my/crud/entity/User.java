package com.my.crud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

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
public class User extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名字
     */
    @NotBlank(message = "昵称不能为空")
    private String username;

    private String avatar;
    @NotBlank(message = "昵称不能为空")
    @Email(message ="邮箱格式不正确")
    private String email;

    private String password;

    private Integer status;

    private LocalDateTime created;

    private LocalDateTime lastLogin;


}
