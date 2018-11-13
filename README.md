# microservice
一个微服务系统demo，包括microservice-role，microservice-grade，microservice-zuul，microservice-config，microservice-eureka，以及docker相关配置

各微服务作用：
  microservice-role服务会根据姓名查询学生信息，并调用microservice-grade服务，查询具有该姓名学生的成绩列表
  microservice-grade服务根据学号查询成绩列表
  microservice-zuul服务构建网关
  microservice-config服务提供统一配置服务
  microservice-eureka 提供注册与发现服务
