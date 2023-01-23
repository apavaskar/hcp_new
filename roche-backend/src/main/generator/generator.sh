#export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.0.4.jdk

java -classpath ./../resources/db/changelog:jooq-3.17.2.jar:\
jooq-meta-3.17.2.jar:\
jooq-codegen-3.17.2.jar:\
postgresql-42.4.0.jar:\
jakarta.xml.bind-api-3.0.0.jar:\
jooq-meta-extensions-liquibase-3.17.5.jar:\
jooq-meta-extensions-3.17.5.jar:\
liquibase-core-4.9.1.jar:\
reactive-streams-1.0.3.jar:\
h2-2.1.214.jar:\
r2dbc-spi-0.9.1.RELEASE.jar:. \
org.jooq.codegen.GenerationTool hospital.xml
