package com.du.patentmanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author Du425
 * @since 2021-12-26
 */
@ApiModel(value = "Patentmanagement对象", description = "")
public class Patentmanagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("专利类型")
    private String type;

    @ApiModelProperty("专利名称")
    private String name;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("专利号")
    private String number;

    @ApiModelProperty("申请日期")
    private LocalDate applyDate;

    @ApiModelProperty("专利权人")
    private String owner;

    @ApiModelProperty("授权公告日")
    private LocalDate announceDate;

    @ApiModelProperty("授权单位")
    private String authorizeUnit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDate getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(LocalDate announceDate) {
        this.announceDate = announceDate;
    }

    public String getAuthorizeUnit() {
        return authorizeUnit;
    }

    public void setAuthorizeUnit(String authorizeUnit) {
        this.authorizeUnit = authorizeUnit;
    }

    @Override
    public String toString() {
        return "Patentmanagement{" +
        "id=" + id +
        ", type=" + type +
        ", name=" + name +
        ", author=" + author +
        ", number=" + number +
        ", applyDate=" + applyDate +
        ", owner=" + owner +
        ", announceDate=" + announceDate +
        ", authorizeUnit=" + authorizeUnit +
        "}";
    }
}
