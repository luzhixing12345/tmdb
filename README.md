# tmdb

<div align=center><img src="https://raw.githubusercontent.com/learner-lu/picbed/master/20220504011739.png" height="300" alt="抚子妹妹"></div>

## 介绍

本项目为武汉大学2019级计算机弘毅班"数据库系统实现"课程的第三次大作业

组名: 啊对对对

- 组长:陆知行
- 组员:孙含笑
- 组员:陶文琪
- 组员:徐梓峻

Totem Mobile Database at WHU (This is a prototype system for teaching purpose)

武汉大学移动端Totem数据库系统

## 任务要求

### Task 1

实现对象Union操作

### Task 2

实现更新迁移操作

### Task 3

实现手机端各app产生的轨迹（百度地图、跑步软件、共享单车、打车等），并进行Union操作以完整的存储个人出行轨迹

> 所有功能需要用SQL实现进行调用，可利用javacc进行编译，小组成员共四人，能连通3大任务，并进行流畅的展示

## 解决思路

- [TASK1-解决思路](file/task1-solution.md)
- [TASK2-解决思路](file/task2-solution.md)
- [TASK3-解决思路](file/task3-solution.md)

## 使用方法

[安卓apk下载](https://github.com/luzhixing12345/tmdb/releases/download/v0.0.2/app-release.apk)

- 安卓手机安装之后可以使用SQL语句进行增删改查,**这里的SQL语句非常的脆弱**,需要一个完整的句子
- 点击武大图标奇数次后再点击右侧放大镜可以看到我的路线
- 点击武大图标偶数次后再点击右侧放大镜可以看到APP的数据轨迹追踪

## 可视化结果演示(TASK3)

> TASK1 TASK2 为功能测试,不方便可视化,结果演示见解决思路中的测试结果

|WHU|APP|
|:--:|:--:|
|![whu_trace](https://raw.githubusercontent.com/learner-lu/picbed/master/whu_trace.gif)|![APP_trace](https://raw.githubusercontent.com/learner-lu/picbed/master/APP_trace.gif)|

## 实验文档

- pdf [下载](https://github.com/luzhixing12345/tmdb/releases/download/v0.0.3/default.pdf)
- markdown [下载](https://github.com/luzhixing12345/tmdb/releases/download/v0.0.3/default.md)
- [B站视频讲解](https://www.bilibili.com/video/BV1gY4y1C7sc)

## [一些思考](file/debug.md)和[一些锦上添花](file/addition.md)

## 参考资料

[TotemDB资料1](http://totemdb.whu.edu.cn/upload/202102/02/202102022020113648.pdf)

[TotemDB资料2](http://totemdb.whu.edu.cn/upload/202102/02/202102022020276488.pdf)

[其他相关资料下载](https://github.com/luzhixing12345/tmdb/releases/download/v0.0.1/resource.zip)
