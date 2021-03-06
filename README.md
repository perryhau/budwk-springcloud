# BudWk 开源企业级Java Web开发框架
WK系列开发框架 Java SpringCloud + SpringBoot2 + Nutz

[![Build Status](https://travis-ci.org/budwk/budwk-nutzboot.png?branch=bootstrap)](https://travis-ci.org/Wizzercn/NutzWk)
[![GitHub release](https://img.shields.io/github/release/budwk/budwk-nutzboot.svg)](https://github.com/Wizzercn/NutzWk/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![PowerByNutz](https://img.shields.io/badge/PowerBy-Nutz-green.svg)](https://github.com/nutzam/nutz)

https://wizzer.cn/donation  赞助者

# 前言

本项目自2012年开始用于商业项目，至今已服务于全国各地公司大大小小数千个项目，行业涉及政务、电商、物联网等，随着个人经验积累及从事行业的不同分别发布了1.0至5.0多个版本，每个版本都是完整运行且完全开源免费的，您可以根据项目规模选择不同版本。本项目案例众多，省厅级项目、市级平台、大数据项目、电商平台、物联网平台等等。

我们有强大的后援 —— Nutz 社区支持  https://nutz.cn  及 Nutz 使用手册 https://nutzam.com/core/nutz_preface.html

### QQ交流群

*  1群: 68428921(已满)
*  2群: 24457628

# 版本说明

| 版本名称 | 版本特点 | 版本地址 | 运行方式 | 后端主要技术| 前端主要技术 | 浏览器兼容性 |
| ---------|---------| ----------| ----------| ----------|----------|----------|
| BudWk v7.x 开发中 | 微服务分布式API + 前后端分离 |[v7.x](https://github.com/budwk/budwk-springcloud)| jar,war | springcloud + nutz dao/json/.. + shiro | nuxt + vue + elementUI | Chrome,IE10+ |
| BudWk v6.x 开发中| 微服务分布式 + 前后端分离 |[v6.x](https://github.com/budwk/budwk-nutzboot)| jar,war | nutzboot + dubbo + shiro | nuxt + vue + elementUI | Chrome,IE10+ |
| BudWk v6.x-mini 开发中| 微服务单应用 + 前后端分离 |[v6.x-mini](https://github.com/budwk/budwk-nutzboot)| jar,war | nutzboot + shiro | nuxt + vue + elementUI | Chrome,IE10+ |
| NutzWk v5.x| 微服务分布式 + 前端混合模式 |[v5.x](https://github.com/Wizzercn/NutzWk/tree/v5.x)| jar,war | nutzboot + dubbo + shiro + beetl | vue + elementUI + jquery 或 jquery + bootstrap 两个版本 | Chrome,IE9+ |
| NutzWk v5.x-mini| 微服务单应用 + 前端混合模式 |[v5.x-mini](https://github.com/Wizzercn/NutzWk/tree/v5.x-mini)| jar,war | nutzboot + shiro + beetl | vue + elementUI + jquery | Chrome,IE9+ |
| NutzWk v4.x| 模块化单应用 |[v4.x](https://github.com/Wizzercn/NutzWk/tree/v4.x)| war | nutz + shiro + beetl | jquery + bootstrap | Chrome,IE7 + |
| NutzWk v3.x| 单应用 |[v3.x](https://github.com/Wizzercn/NutzWk/tree/v3.x)| war | nutz + shiro + beetl 或 velocity 两个版本 | jquery + bootstrap | Chrome,IE7 + |
| NutzWk v1.x| 单应用 |[v1.x](https://github.com/Wizzercn/NutzWk/tree/v1.x)| war | nutz + shiro + velocity | jquery + easyUI | IE6 + |

# 本版说明(BudWk v7.x)

## 运行环境

*   JDK 8 181 + 或 OpenJDK 11 +
*   Redis 4.0.8 +
*   MySql 5.7 + 或 MariaDB、Oracle、SqlServer、达梦等
*   Nacos 1.1.4 +

## 开发工具
*   IntelliJ IDEA
*   Visual Studio Code
*   Node 12.13.0 +
*   Maven 3.5.3 +
*   Git

## 目录结构
| 模块名称                                     | 介绍                                     |
| ---------------------------------------- | ---------------------------------------- |
|[wk-code-generator](wk-code-generator) |代码生成器|
|[wk-common](wk-common) |框架公共模块,POJO类,工具类,枚举类,常量类等|
|[wk-sb-service-sys](wk-sb-service-sys) |系统管理模块,组织架构/权限管理等API|
|[wk-sb-service-cms](wk-sb-service-cms) |CMS管理模块,栏目管理/文章管理等API|
|[wk-sb-service-wx](wk-sb-service-wx) |微信管理模块,微信管理及微信支付功能等API|
|[wk-sb-service-slog](wk-sb-service-slog) |业务日志模块,记录日志/管理日志等API|
|[wk-sb-service-job](wk-sb-service-job) |分布式定时任务,任务管理等API|
|[wk-sb-service-ucenter](wk-sb-service-ucenter) |用户中心,用户注册登陆/用户授权等API|
|[wk-sb-service-gateway](wk-sb-service-gateway) |网关中心|
|[wk-starter](wk-starter) |各种starter|
|[wk-example](wk-example) |各种示例代码|

## 技术选型
### 后端技术
技术 | 名称 | 官网
----|------|----
Nutz | JavaEE应用程序框架  | [https://nutzam.com](https://nutzam.com)
SpringCloud | 分布式系统基础设施  | [https://nutzam.com](https://nutzam.com)
Apache Shiro | 安全框架  | [https://shiro.apache.org](https://shiro.apache.org)
Druid | 数据库连接池  | [https://github.com/alibaba/druid](https://github.com/alibaba/druid)
Nacos | 注册中心配置中心  | [https://zookeeper.apache.org](https://zookeeper.apache.org)
Xxl-job | 分布式任务调度  | [https://github.com/xuxueli/xxl-job](https://github.com/xuxueli/xxl-job)
Redis | 分布式缓存数据库  | [https://redis.io](https://redis.io)
Maven | 项目构建管理  | [https://maven.apache.org](https://maven.apache.org)

### 前端技术
技术 | 名称 | 官网
----|------|----
Vue.js | MVVM框架 | [https://vuejs.org](https://vuejs.org)
Nuxt.js | Vue通用应用框架 | [https://nuxtjs.org](https://nuxtjs.org)
Elment | 基于Vue的UI框架 | [https://element.eleme.io](https://element.eleme.io)
Font-awesome | 字体图标  | [https://fontawesome.com](https://fontawesome.com)

## 开发指南
*   确保 MySql、Redis、Nacos 默认端口配置并已启动好
*   MySql 创建名为 `budwk_v7` 的空数据库,在各模块启动时会自动建表,同时初始化数据
*   启动顺序是 sys --> slog --> cms[可选] --> wx[可选] --> job[可选] --> gateway
*   正常启动后访问 `http://127.0.0.1:8080/sysadmin` 用户名 superadmin 密码 1
*   若觉得项目复杂上手较难,可以从最简单的一个NB项目学起 [wizzer.cn 源码](https://github.com/Wizzercn/Demo/tree/master/nutzboot-wizzer-cn)

## 项目部署

*   内置配置文件启动  `nohup java -jar wk-nb-service-sys.jar &` 带参数 `-Dnutz.profiles.active=prod` 可加载 application-prod.properties 文件
*   外置配置文件启动  `nohup java -Dnutz.boot.configure.properties.dir=/data/nutzwk/sys/ -jar wk-nb-service-sys.jar &` 此时加载文件夹所有 *.properties 配置文件
*   生产环境可以使用 [PythonWk](https://github.com/Wizzercn/PythonWk) 进行部署,登陆后台运维中心可在线更新jar包及配置文件等

# 鸣谢

*   [@wendal](https://github.com/wendal)
*   [@rekoe](https://github.com/Rekoe)
*   [@enilu](https://github.com/enilu)
*   [@loyalove](https://github.com/loyalove)
*   [@threefish](https://github.com/threefish)
*   [@kerbores](https://github.com/kerbores)

# 关于

*   提供付费的培训服务，含源码解析、设计思路、疑难解答、项目辅导等
*   联系方式 QQ：11624317  微信：wizzer
*   欢迎打赏，以资鼓励 [https://wizzer.cn/donation](https://wizzer.cn/donation)
