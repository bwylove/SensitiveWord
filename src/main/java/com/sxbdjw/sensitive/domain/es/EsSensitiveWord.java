package com.sxbdjw.sensitive.domain.es;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Document(indexName = "sensitivate", type = "bdjw")
public class EsSensitiveWord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String word;
    private String type;
    private String thesaurus;

    public EsSensitiveWord() {
    }

    public EsSensitiveWord(String word, String type, String thesaurus) {
        this.word = word;
        this.type = type;
        this.thesaurus = thesaurus;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getThesaurus() {
        return thesaurus;
    }

    public void setThesaurus(String thesaurus) {
        this.thesaurus = thesaurus;
    }

    @Override
    public String toString() {
        return "EsSensitiveWord{" +
                "id='" + id + '\'' +
                ", word='" + word + '\'' +
                ", type='" + type + '\'' +
                ", thesaurus='" + thesaurus + '\'' +
                '}';
    }
}
