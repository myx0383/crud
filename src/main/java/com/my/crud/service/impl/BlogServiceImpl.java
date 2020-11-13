package com.my.crud.service.impl;

import com.my.crud.entity.Blog;
import com.my.crud.mapper.BlogMapper;
import com.my.crud.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-12
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
