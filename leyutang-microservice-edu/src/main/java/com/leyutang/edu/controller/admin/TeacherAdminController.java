package com.leyutang.edu.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leyutang.common.vo.R;
import com.leyutang.edu.entity.Teacher;
import com.leyutang.edu.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/edu/teacher")
@CrossOrigin
public class TeacherAdminController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "所有讲师列表")
    @GetMapping
    public R list()
    {
        List<Teacher> list =  teacherService.list(null);
        return R.ok()
                .message("查询讲师成功！")
                .data("items",list);
    }

    //DeleteMapping、PathVariable是指通过路径传ID
    @ApiOperation(value = "根据ID逻辑删除讲师")
    @DeleteMapping("id")
    public R removeById(
            @ApiParam(name = "id",value = "讲师", required = true)
            @PathVariable String id){

        teacherService.removeById(id);
        return R.ok();
    }
}
