package com.squer.prorpel.persistence.config
import com.zaxxer.hikari.HikariDataSource
import org.jooq.ConnectionProvider
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.TransactionProvider
import org.jooq.impl.DataSourceConnectionProvider
import org.jooq.impl.DefaultConfiguration
import org.jooq.impl.DefaultDSLContext
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.jooq.SpringTransactionProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy
import javax.sql.DataSource
@Configuration
class DatasourceConfig {


        @Value("\${app.datasource.driver}")
        private lateinit var databaseFirstDriver: String

        @Value("\${spring.datasource.url}")
        private lateinit var databaseFirstUrl: String

        @Value("\${spring.datasource.username}")
        private lateinit var databaseFirstUser: String

        @Value("\${spring.datasource.password}")
        private lateinit var databaseFirstPassword: String

        @Primary
        @Bean("datasource")
        fun datasource(): DataSource {
            val datasoruce = HikariDataSource()
            datasoruce.driverClassName = databaseFirstDriver
            datasoruce.jdbcUrl = databaseFirstUrl
            datasoruce.username = databaseFirstUser
            datasoruce.password = databaseFirstPassword
            return datasoruce
        }

        @Primary
        @Bean("txManager")
        fun transactionManager(): DataSourceTransactionManager {
            return DataSourceTransactionManager(datasource())
        }

        @Bean("connectionProvider")
        fun connectionProvider(): ConnectionProvider {
            return DataSourceConnectionProvider(TransactionAwareDataSourceProxy(datasource()))
        }

        @Bean("txProvider")
        fun transactionProvider(): TransactionProvider {
            return SpringTransactionProvider(transactionManager())
        }

        @Bean("jooqContext")
        fun dslContextFirst(): DSLContext {
            val defaultConfiguration = DefaultConfiguration()
                .derive(connectionProvider())
                .derive(transactionProvider())
                .derive(SQLDialect.POSTGRES)
            return DefaultDSLContext(defaultConfiguration)

        }

}
