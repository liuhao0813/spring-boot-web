## Centos7安装Mysql数据库

> 在CentOS 7 版本中MySQL数据库软件从默认的程序列表中移除，用mariadb代替，所以本文安装使用mariadb来安装
>
> MariaDB数据库管理系统是MySQL的一个分支，主要由开源社区在维护，采用GPL授权许可。开发这个分支的原因之一是：甲骨文公司收购了MySQL后，有将MySQL闭源的潜在风险，因此社区采用分支的方式来避开这个风险。MariaDB的目的是完全兼容MySQL，包括API和命令行，使之能轻松成为MySQL的代替品
>

### 安装MariaDB

`yum install mariadb-server mariadb` 

如下表示成功

``````
Installed:
  mariadb.x86_64 1:5.5.56-2.el7       mariadb-server.x86_64 1:5.5.56-2.el7

Dependency Installed:
  perl-Compress-Raw-Bzip2.x86_64 0:2.061-3.el7
  perl-Compress-Raw-Zlib.x86_64 1:2.061-4.el7
  perl-DBD-MySQL.x86_64 0:4.023-5.el7
  perl-DBI.x86_64 0:1.627-4.el7
  perl-Data-Dumper.x86_64 0:2.145-3.el7
  perl-IO-Compress.noarch 0:2.061-2.el7
  perl-Net-Daemon.noarch 0:0.48-5.el7
  perl-PlRPC.noarch 0:0.2020-14.el7
Complete!
[root@localhost ~]#
``````

1. 启动MariaDB

   `systemctl start mariadb`

2. 停止MariaDB

   `systemctl stop mariadb` 

3. 重启MariaDB

   `systemctl restart mariadb`

4. 设置开机启动MariaDB

   `systemctl enable mariadb`

5. 可以正常使用使用数据库


```
[root@localhost ~]# mysql -uroot -p
Enter password:
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 2
Server version: 5.5.56-MariaDB MariaDB Server

Copyright (c) 2000, 2017, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [(none)]> show database;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'database' at line 1
MariaDB [(none)]> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| test               |
+--------------------+
4 rows in set (0.00 sec)
```



### 配置MariaDB

> 配置文件放置在/etc/my.cnf
>
> 具体的配置信息参考官方文档

