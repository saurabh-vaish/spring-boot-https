**Enable SSL/TLS in spring boot**

* SSL = Secure Sockets Layer , TLS = Transport Layer Security
* SSL is a layer of security that sits on top of TCP/IP.
* TLS is a layer of security that sits on top of SSL.
* By default spring boot uses TLS.

* To enable SSL/TLS in spring boot, we need to add the following configuration in application.properties file.
  ```
  server:
      ssl:
        enabled: true # Default for https , false will disable ssl
        keystore: classpath:server-keystore.jks #default location is project root folder
        keystore-password: Thrymr@123
        protocol: TLSv1.2
  ```
* We need to ganerate keystore file that we have defined in application.properties file.
* To ganerate file we need to use java keytool utility.
* We need to add the following command in terminal.
  ```
   C:\PROGRA~1\Java\jdk-17\bin\keytool.exe -genkey -alias local_self_signed_certificate -keyalg RSA -keysize 2048 -validity 365 -keypass Thrymr@123 -storepass Thrymr@123 -keystore server-keystore.jks
  ```
* By default it looks file in project root folder.
* we can move to resource folder and provide classpath