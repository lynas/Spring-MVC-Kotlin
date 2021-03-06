package com.lynas.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

@Configuration
open class WebInit : AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getRootConfigClasses(): Array<out Class<*>>? {
        return arrayOf<Class<*>>(RootConfig::class.java)
    }

    override fun getServletConfigClasses(): Array<out Class<*>>? {
        return arrayOf<Class<*>>(WebConfig::class.java)
    }

    override fun getServletMappings(): Array<out String>? {
        return arrayOf("/")
    }

}