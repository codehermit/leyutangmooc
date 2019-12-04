package com.leyutang.edu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leyutang.edu.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.leyutang.edu.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author Helen
 * @since 2019-11-29
 */
public interface TeacherService extends IService<Teacher> {

    void pageQuery(Page<Teacher> pageParam, TeacherQuery teacherQuery);
}
