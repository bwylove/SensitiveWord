package com.sxbdjw.sensitive.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.sxbdjw.sensitive.repository.es.EsSensitiveRepository;
import com.sxbdjw.sensitive.util.SensitiveWordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/es",method = RequestMethod.GET)
public class EsSentiviveController {

    @Autowired
    EsSensitiveRepository esSensitiveRepository;

    @GetMapping
    public boolean contains (@RequestParam(value = "word",required = false,defaultValue = "")String word){
        SensitiveWordUtil.sensitiveHelper("太多");
      return SensitiveWordUtil.contains(word);
    };









}
