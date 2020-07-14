package cc.mrbird.febs.others.controller;

import cc.mrbird.febs.others.entity.DataPermissionTest;
import cc.mrbird.febs.others.service.IDataPermissionTestService;
import cc.mrbird.febs.common.controller.BaseController;
import cc.mrbird.febs.common.entity.FebsResponse;
import cc.mrbird.febs.common.entity.QueryRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: KHighness
 * @Date: 2020-7
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("datapermission/test")
@RequiredArgsConstructor
public class DataPermissionTestController extends BaseController {

    private final IDataPermissionTestService dataPermissionTestService;

    @GetMapping("list")
    @RequiresPermissions("others:datapermission")
    public FebsResponse dataPermissionTestList(QueryRequest request, DataPermissionTest dataPermissionTest) {
        Map<String, Object> dataTable = getDataTable(this.dataPermissionTestService.findDataPermissionTests(request, dataPermissionTest));
        return new FebsResponse().success().data(dataTable);
    }
}