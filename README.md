# mavenpolymerizedemo

# 本工程是maven聚合demo 并提供restful服务，
	使用mysql数据库，创建test数据库，然后导入本工程内的sql脚本。（注意修改用户名和密码）
	使用mvn clean install 将maven-server下的war包复制到tomcat下即可运行，可以改一下名字为maven-server，启动tomcat，访问http://localhost:8080/maven-server/rest/core/apicla/apifunc即可得到数据
	工程内有bat文件，只要改一下路径就可以省去maven的clean install步骤，还能将生成的war包复制到tomcat下

maven-server当作提供服务的模块，建立工程是选择war包


