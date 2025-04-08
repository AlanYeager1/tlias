package org.yzw.tlias_back.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yzw.tlias_back.pojo.Dept;
import org.yzw.tlias_back.pojo.Result;
import org.yzw.tlias_back.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    public Result getListOfAllDept() {
        List<Dept> listOfAllDept = deptService.getAllDepartment();
        return Result.success(listOfAllDept);
    }

    @RequestMapping(value = "/depts", method = RequestMethod.DELETE)
    public Result deleteDept(Integer id) {
        deptService.deleteDeptById(id);
        return Result.success();
    }

    @RequestMapping(value = "/depts", method = RequestMethod.POST)
    public Result addDept(@RequestBody Dept dept) {
        deptService.addDept(dept);
        return Result.success();
    }

    @RequestMapping(value = "/depts", method = RequestMethod.PUT)
    public Result updateDept(@RequestBody Dept dept) {
        deptService.updateDept(dept);
        return Result.success();
    }

    @RequestMapping(value = "/depts/{id}", method = RequestMethod.GET)
    public Result selectDept(@PathVariable Integer id) {
        List<Dept> selectedDept = deptService.selectDept(id);
        return Result.success(selectedDept);
    }
}
