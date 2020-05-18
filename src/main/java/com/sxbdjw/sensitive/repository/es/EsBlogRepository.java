package com.sxbdjw.sensitive.repository.es;

import com.sxbdjw.sensitive.domain.es.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {

    Page<EsBlog> findByTitleContainingOrSummaryContainingOrContentContaining(String title,String summary, String content, Pageable pageable);
}
