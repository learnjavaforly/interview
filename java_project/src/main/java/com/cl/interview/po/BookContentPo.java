package com.cl.interview.po;

import com.cl.interview.common.ToObject;
import com.cl.interview.entity.BookContentEntity;
import com.cl.interview.util.ClassUtils;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class BookContentPo implements Serializable,ToObject<BookContentEntity> {
    public BookContentPo() {
    }
    

    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 书籍Id
     */
    private BookChapterPo bookChapterPo;
    /**
     * 标题
     */
    private String title;
    private String content;
    private String think;
    private Integer degree;
    private Date createTime;

    @Override
    public BookContentEntity toObject() {
        BookContentEntity entity =  (BookContentEntity) new ClassUtils().inheritValue(new BookContentEntity(), this,null);
        if (this.bookChapterPo != null) entity.setBookChapterEntity(this.getBookChapterPo().toObject());
        return entity;
    }
}