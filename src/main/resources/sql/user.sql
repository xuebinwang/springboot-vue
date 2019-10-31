CREATE TABLE `dm_user` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) NOT NULL,
  `user_age` varchar(100) NOT NULL,
  `create_time`  timestamp  NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*
1.先检查npm和node的版本
查看npm版本：npm -v
升级npm： npm install -g npm
查看node版本：node -v
升级node版本：https://nodejs.org/ 官网现在下载最新的node安装
2.卸载vue-cli
npm uninstall -g vue-cli
3.重新安装vue-cli
npm install -g vue-cli
4.再运行，生成vue项目
vue init webpack vue-demo 成功
5.进入目录
cd vue-demo
6.安装axios
安装cnpm，淘宝镜像cnpm
npm install -g cnpm --registry=https://registry.npm.taobao.org
cnpm install
cnpm install axios --save

 */
