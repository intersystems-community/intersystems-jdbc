# InterSystems JDBC driver

Available on [maven central repository](https://central.sonatype.com/artifact/community.intersystems/intersystems-jdbc)

* Maven

  ```xml
  <dependency>
      <groupId>community.intersystems</groupId>
      <artifactId>intersystems-jdbc</artifactId>
      <version>3.8.0</version>
  </dependency>
  ```

* Gradle

  ```
  implementation group: 'community.intersystems', name: 'intersystems-jdbc', version: '3.8.0'
  ```


## Use

```Java
Class.forName ("com.intersystems.jdbc.IRISDriver").newInstance();
String  url="jdbc:IRIS://127.0.0.1:1972/User";
String  username = "_SYSTEM";
String  password = "SYS";
dbconnection = DriverManager.getConnection(url,username,password);
```