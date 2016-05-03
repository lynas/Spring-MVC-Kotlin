package com.lynas.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {

    @RequestMapping(value = "/")
    fun home(): String {
        return "home"
    }
}