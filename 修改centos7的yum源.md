## 修改centos7的yum源

​	以下内容，纯属个人笔记，如有问题，欢迎指正，237594169@qq.com

1. 复制/etc/yum.repos.d/Centos-Base.repo文件为Centos-aliyun.repo文件

2. 使用喜欢的编辑器打开，进行编辑，注释所有的mirrorlist属性，放开baseurl，将baseurl修改为阿里云的yum源，这个地址可能有变动，亲自行百度，我使用的时候是http://mirrors.aliyun.com/centos

   注意：在[aliyun]这个节点下，需要配置enabled=1生效，否则不生效

```#
# The mirror system uses the connecting IP address of the client and the
# update status of each mirror to pick mirrors that are updated to and
# geographically close to the client.  You should use this for CentOS updates
# unless you are manually picking other mirrors.
#
# If the mirrorlist= does not work for you, as a fall back you can try the
# remarked out baseurl= line instead.
#
#

[Aliyun]
name=CentOS-$releasever - Aliyun
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=os&infra=$infra
baseurl=http://mirrors.aliyun.com/centos/$releasever/os/$basearch/
enabled=1
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7

#released updates
[updates]
name=CentOS-$releasever - Updates
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=updates&infra=$infra
baseurl=http://mirrors.aliyun.com/centos/$releasever/updates/$basearch/
gpgcheck=1
#additional packages that may be useful
[extras]
name=CentOS-$releasever - Extras
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=extras&infra=$infra
baseurl=http://mirrors.aliyun.com/centos/$releasever/extras/$basearch/
gpgcheck=1
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7

#additional packages that extend functionality of existing packages
[centosplus]
name=CentOS-$releasever - Plus
#mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=centosplus&infra=$infra
baseurl=http://mirrors.aliyun.com/centos/$releasever/centosplus/$basearch/
gpgcheck=1
enabled=0
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7
```

3. 修改完成后使用yum repolist endabled进行验证，结果如下图表示设置成功

   ````
   [root@localhost yum.repos.d]# yum repolist enabled
   Loaded plugins: fastestmirror
   Repository updates is listed more than once in the configuration
   Repository extras is listed more than once in the configuration
   Repository centosplus is listed more than once in the configuration
   Loading mirror speeds from cached hostfile
    * base: mirrors.aliyun.com
   repo id                             repo name                             status
   Aliyun/7/x86_64                     CentOS-7 - Aliyun                     9,591
   base/7/x86_64                       CentOS-7 - Base                       9,591
   extras/7/x86_64                     CentOS-7 - Extras                       227
   updates/7/x86_64                    CentOS-7 - Updates                      731
   repolist: 20,140
   [root@localhost yum.repos.d]#
   ````


​