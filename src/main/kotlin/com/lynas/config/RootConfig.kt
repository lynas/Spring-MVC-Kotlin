package com.lynas.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * Created by LynAs on 03-May-16
 */

@Configuration
@ComponentScan(basePackages = arrayOf("com.lynas"))
open class RootConfig