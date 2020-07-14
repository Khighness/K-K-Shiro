###  K&K 

### FEBS-Shiro

![https://img.shields.io/badge/license-Apache%202.0-blue.svg?longCache=true&style=flat-square](https://img.shields.io/badge/license-Apache%202.0-blue.svg?longCache=true&style=flat-square)
![https://img.shields.io/badge/springboot-2.2.1-yellow.svg?style=flat-square](https://img.shields.io/badge/springboot-2.2.1-yellow.svg?style=flat-square)
![https://img.shields.io/badge/shiro-1.4.2-orange.svg?longCache=true&style=flat-square](https://img.shields.io/badge/shiro-1.4.2-orange.svg?longCache=true&style=flat-square)
![https://img.shields.io/badge/layui-2.5.5-brightgreen.svg?longCache=true&style=flat-square](https://img.shields.io/badge/layui-2.5.5-brightgreen.svg?longCache=true&style=flat-square)

K&K-Shiro是一款简单高效的后台权限管理系统，使用Spring Boot，Shiro和Layui构建。

FEBS意指：**F**ast，**E**asy use，**B**eautiful和**S**afe。

相信无论作为企业级应用，私活开发脚手架或者权限系统构建学习，FEBS-Shiro都会是一个不错的选择。



### 本地部署


本地部署账号密码：

账号 | 密码| 权限
---|---|---
K | KAG1823 |超级管理员，拥有所有增删改查权限
scott | 1234qwer | 注册账户，拥有查看，新增权限（新增用户除外）和导出Excel权限
micaela | 1234qwer |系统监测员，负责整个系统监控模块
Jana   | 1234qwer  |跑批人员，负责任务调度跑批模块
Khighness | KAG1823 |注册账号



### 系统模块
系统功能模块组成如下所示：
```
├─系统管理
│  ├─用户管理
│  ├─角色管理
│  ├─菜单管理
│  └─部门管理
├─系统监控
│  ├─在线用户
│  ├─系统日志
│  ├─登录日志
│  ├─请求追踪
│  ├─系统信息
│  │  ├─JVM信息
│  │  ├─TOMCAT信息
│  │  └─服务器信息
├─任务调度
│  ├─定时任务
│  └─调度日志
├─代码生成
│  ├─生成配置
│  ├─代码生成
└─其他模块
   ├─FEBS组件
   │  ├─表单组件
   │  ├─表单组合
   │  ├─FEBS工具
   │  ├─系统图标
   │  └─其他组件
   ├─APEX图表
   ├─高德地图
   └─导入导出
```
### 系统特点

1. 前后端请求参数校验
2. 支持Excel导入导出
3. 前端页面布局多样化，主题多样化
4. 支持多数据源，代码生成
5. 多Tab页面，适合企业应用
6. 用户权限动态刷新
7. 浏览器兼容性好，页面支持PC，Pad和移动端。
8. 代码简单，结构清晰



### 技术选型

#### 后端
- Maven 
- Spring Boot 
- Mybatis-Plus
- MySQL 
- Shiro 

#### 前端
- Layui 
- Nepadmin
- formSelects 4.x 多选框
- eleTree 树组件
- formSelect.js树形下拉
- Apexcharts图表

### 系统截图

![screenshot](screenshot/pc_screenshot_1.jpg)

![screenshot](screenshot/pc_screenshot_2.jpg)
![screenshot](screenshot/pc_screenshot_3.jpg)
![screenshot](screenshot/pc_screenshot_4.jpg)
![screenshot](screenshot/pc_screenshot_5.jpg)
![screenshot](screenshot/pc_screenshot_6.jpg)

![screenshot](screenshot/pc_screenshot_7.jpg)

![screenshot](screenshot/pc_screenshot_8.jpg)



|[<img src="https://raw.github.com/alrra/browser-logos/master/src/archive/internet-explorer_9-11/internet-explorer_9-11_48x48.png" alt="Edge" width="24px" height="24px" />](http://godban.github.io/browsers-support-badges/)</br>IE| [<img src="https://raw.githubusercontent.com/alrra/browser-logos/master/src/edge/edge_48x48.png" alt="Edge" width="24px" height="24px" />](http://godban.github.io/browsers-support-badges/)</br>Edge | [<img src="https://raw.githubusercontent.com/alrra/browser-logos/master/src/firefox/firefox_48x48.png" alt="Firefox" width="24px" height="24px" />](http://godban.github.io/browsers-support-badges/)</br>Firefox | [<img src="https://raw.githubusercontent.com/alrra/browser-logos/master/src/chrome/chrome_48x48.png" alt="Chrome" width="24px" height="24px" />](http://godban.github.io/browsers-support-badges/)</br>Chrome | [<img src="https://raw.githubusercontent.com/alrra/browser-logos/master/src/safari/safari_48x48.png" alt="Safari" width="24px" height="24px" />](http://godban.github.io/browsers-support-badges/)</br>Safari |[<img src="https://raw.github.com/alrra/browser-logos/master/src/opera/opera_48x48.png" alt="Edge" width="24px" height="24px" />](http://godban.github.io/browsers-support-badges/)</br>Opera
| --------- | --------- | --------- | --------- | --------- |--------- |
|IE 10+| Edge| last 15 versions| last 15 versions| last 10 versions| last 15 versions


### 反馈交流

欢迎加入一起~~交流技术~~划水水：

![qq](screenshot/QQ.jpg)

### 特别赞助

<a href="https://www.jetbrains.com/?from=FEBS Shiro">
    <img src="screenshot/jetbrains.png" width="100px">

</a>

### 支持团队
如果该系统对您有帮助的话，请作者喝杯抹茶吧🍺~

![treatme](screenshot/alipay.jpg)

