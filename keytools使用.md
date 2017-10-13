### KeyTools使用

1. 生成keystore
   `keytool -genkeypair -keyalg RSA -keysize 2048 -sigalg SHA1withRSA -validity 36500 -alias ovn.sso.com -keystore d:/tomcat.keystore -dname "CN=ovn.sso.com,OU=kawhi,O=carl,L=GuangZhou,ST=GuangDong,C=CN"`
2. 生成证书
   `keytool -exportcert -alias ovn.sso.com -keystore d:/tomcat.keystore  -file d:/tomcat.cer -rfc`
3. 导入证书
   `keytool -importcert -alias ovn.sso.com -keystore "%JAVA_HOME%\jre\lib\security\cacerts" -file d:/tomcat.cer -trustcacerts`
4. 注意导入证书的密码是changeit

`keytool -importcert -alias ovn.sso.com -keystore "D:\Program Files\Java\jre1.8.0_144\lib\security\cacerts" -file d:/tomcat.cer -trustcacerts`
5. 查看证书
   `keytool -list -keystore "%JAVA_HOME%\jre\lib\security\cacerts" | findstr/i server`

6. 删除证书
   `keytool -delete -alias passport.sso.com -keystore "%JAVA_HOME%\jre\lib\security\cacerts"`
   `keytool -delete -alias ovn.sso.com -keystore "D:\Program Files\Java\jre1.8.0_144\lib\security\cacerts"`