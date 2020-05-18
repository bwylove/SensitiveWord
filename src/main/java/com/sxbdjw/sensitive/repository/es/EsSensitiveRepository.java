package com.sxbdjw.sensitive.repository.es;

import com.sxbdjw.sensitive.domain.es.EsSensitiveWord;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsSensitiveRepository extends ElasticsearchRepository<EsSensitiveWord,String> {

//    boolean contains(String txt);






}
