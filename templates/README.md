# Bugsnag-Logback [![Build Status](https://ssl.webpack.de/secure-jenkins.codereligion.com/buildStatus/icon?job=bugsnag-logback-master-build-flow)](http://jenkins.codereligion.com/view/bugsnag-logback/job/bugsnag-logback-master-build-flow/)

A logback appender which pushes any event containing an exception to bugsnag.

## Requirements
* Java 1.5 or higher
* logback
* dependencies see [maven pom](pom.xml)

## Maven ##
```xml
<dependency>
	<groupId>com.codereligion</groupId>
	<artifactId>bugsnag-logback</artifactId>
	<version>${project.version}</version>
</dependency>
```

## Configuration
For a detailed description of the configuration parameters check the [wiki](https://github.com/codereligion/bugsnag-logback/wiki).
```xml
    <appender name="BUGSNAG" class="com.codereligion.bugsnag.logback.Appender">
        <!-- required -->
        <apiKey>yourKey</apiKey>

        <!-- optional, defaults to false -->
        <sslEnabled>true</sslEnabled>

        <!-- optional, defaults to production -->
        <releaseStage>staging</releaseStage>

        <!-- optional, comma separated set of stage names, defaults to an empty set -->
        <notifyReleaseStages>staging,production</notifyReleaseStages>

        <!-- optional, comma separated set of package names, defaults to an empty set-->
        <projectPackages>com.your.project.package.name</projectPackages>

        <!-- optional, comma separated set of package names, defaults to an empty set -->
        <ignoreClasses>com.some.ignored.package,com.some.other.package</ignoreClasses>

        <!-- optional, comma separated set of to be filtered words, defaults to an empty set -->
        <filters>password,key</filters>

        <!-- optional, fully qualified name of your meta data provider class -->
        <metaDataProviderClassName>com.your.project.MetaDataProvider</metaDataProviderClassName>

        <!-- optional, defaults to notify.bugsnag.com -->
        <endpoint>notify.bugsnag.com</endpoint>
    </appender>
```

## Meta data provider
A ```MetaDataProvider``` implementation can be used to add additional information aka. "meta data" for each event,
which is send to bugsnag.

```java
${exampleMetaDataProvider}
```