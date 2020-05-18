package com.sxbdjw.sensitive.controller;


import com.sxbdjw.sensitive.domain.es.EsBlog;
import com.sxbdjw.sensitive.repository.es.EsBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private EsBlogRepository esBlogRepository;

    @GetMapping
    public List<EsBlog> list(@RequestParam(value = "title", required = false, defaultValue = "") String title,
                             @RequestParam(value = "summary", required = false, defaultValue = "") String summary,
                             @RequestParam(value = "content", required = false, defaultValue = "") String content,
                             @RequestParam(value = "pageIndex", required = false, defaultValue = "") int pageIndex,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "") int pageSize) {
        PageRequest pageable = PageRequest.of(pageIndex, pageSize);
        Page<EsBlog> page = esBlogRepository.findByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        return page.getContent();
    }

    ;
}
