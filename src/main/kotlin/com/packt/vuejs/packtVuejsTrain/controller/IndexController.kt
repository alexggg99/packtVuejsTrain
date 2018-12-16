package com.packt.vuejs.packtVuejsTrain.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @RequestMapping("/")
    fun getIndex(model : Model) = "index"

}