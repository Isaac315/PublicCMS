package com.publiccms.entities.cms;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsContentTag generated by hbm2java
 */
@Entity
@Table(name = "cms_content_tag")
public class CmsContentTag implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "标签")
    private int tagId;
    @MyColumn(title = "内容")
    private int contentId;

    public CmsContentTag() {
    }

    public CmsContentTag(int tagId, int contentId) {
        this.tagId = tagId;
        this.contentId = contentId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "tag_id", nullable = false)
    public int getTagId() {
        return this.tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @Column(name = "content_id", nullable = false)
    public int getContentId() {
        return this.contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

}